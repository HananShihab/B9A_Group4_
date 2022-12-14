/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Group_B9A_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.Scanner;


public class Group_B9A_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws FileNotFoundException, ParseException {

        Scanner inputUser = new Scanner(System.in);
        Scanner inputI = new Scanner(System.in);
        Order[] orderList = new Order[5];
        
        File outputFile = new File("Suggestions.txt");
        PrintWriter suggetionFile = new PrintWriter(outputFile);
        File outputFile2 = new File("SongList.txt");
        PrintWriter songFile = new PrintWriter(outputFile2);

        orderList[0] = Menu(1, "Americano", 12);
        orderList[1] = Menu(2, "Mocha", 13);
        orderList[2] = Menu(3, "Macchiato", 13);
        orderList[3] = Menu(4, "Espresso", 12);
        orderList[4] = Menu(5, "Latte", 13);

        bookTable[] tables = new bookTable[5];
        bookTable[] listBooking = new bookTable[5];
        listBooking[0] = GenerateBooking(111, true);
        listBooking[1] = GenerateBooking(222, true);
        listBooking[2] = GenerateBooking(333, false);
        listBooking[3] = GenerateBooking(444, true);
        listBooking[4] = GenerateBooking(555, true);
        int choice = 0;
        do {
            System.out.println("-----------------Magnesium Café System ---------------------\n");
            System.out.println("1 to see the menu");
            System.out.println("2 to order");
            System.out.println("3 to book a table");
            System.out.println("4 to write a suggetion ");
            System.out.println("5 choose a song");
            System.out.println("6 exit\n");
            System.out.println("------------------------------------------------------------");
            System.out.println("Enter your choice:");
            choice = inputI.nextInt();

            switch (choice) {
                case 1:
                    printMenu();
                    break;
                case 2:
                    printMenu();
                    System.out.println("Enter how many drinks would you like:");
                    int num = inputUser.nextInt();
                    int userDrinks[] = new int[num];
                    System.out.println("Enter your order/s Id:");

                    boolean check = false;
                    int[] index = new int[num];
                    int totalPrice = 0;
                    for (int i = 0; i < num; i++) {
                        userDrinks[i] = inputUser.nextInt();
                        index[i] = searchOrder(orderList, userDrinks[i]);
                        do {
                            if (index[i] == -1) {
                                System.out.println("The order ID in not correct, enter again?");
                                userDrinks[i] = inputUser.nextInt();
                                index[i] = searchOrder(orderList, userDrinks[i]);

                            }
                        } while (index[i] == -1);
                        totalPrice += orderList[index[i]].getPrice();

                    }
                    System.out.println("-----------Receipt-------------");
                    System.out.println("Number of items:" + num);
                    System.out.println("---List of items---");
                    for (int i = 0; i < index.length; i++) {
                        System.out.println(orderList[index[i]].getItem());
                    }
                    System.out.println("Total Price:" + totalPrice);
                    System.out.println("------------------------------");

                    break;
                 //Tagreed part
                 case 3:
                    System.out.println("Table available:");
                    for (int i = 0; i < listBooking.length; i++) {
                        if (listBooking[i].isTableAvailable()) {
                            System.out.println("Table ID  " + listBooking[i].getTableID());
                        }
                    }
                    boolean tID = false;
                    String fname = null;
                    String lname = null;
                    int indx = 0;
                    System.out.println("Enter the ID of the table you want:");
                    int tableID = inputUser.nextInt();
                    int bIndex = searchBooking(listBooking, tableID);
                    do {
                        if (bIndex == -1) {
                            System.out.println("There is  no available table with the ID you entered, enter another ID:");
                            tableID = inputUser.nextInt();
                            bIndex = searchBooking(listBooking, tableID);

                        }
                    } while (bIndex == -1);

                    listBooking[bIndex].setisTableAvailable(false);
                    System.out.println("Enter your first name:");
                    fname = inputUser.next();
                    System.out.println("Enter your last name:");
                    lname = inputUser.next();


                    Customer cust = new Customer(fname, lname);
                    System.out.println("The Table " + listBooking[bIndex].getTableID() + " is booked succesfully! For " + cust.getFname() + " " + cust.getLname());

                    break;
                //Hanans part    
                case 4:
                    System.out.println("Enter your suggetion:");
                    String suggestion = inputUser.nextLine();
                    suggetionFile.append(suggestion);
                    System.out.println("Your suggestion will be put into consideration!");
                    break;
                // Shaimas part    
                case 5:
                    System.out.println("Enter the song you want to hear:");
                    String enteredSong = inputUser.next();
                    songFile.append(enteredSong);
                    System.out.println("Your Song will be added to the song list!");
                    break;

            }
        } while (choice != 6);
        suggetionFile.flush();
        suggetionFile.close();

        songFile.flush();
        songFile.close();
    }

    public static void printMenu() {
        System.out.println("-------------------------------");
        System.out.println("ItemId   Drinks:       Price    \n");
        System.out.println("-------------------------------");
        System.out.println("1        Americano     12 SR \n");
        System.out.println("2        Mocha         13 SR \n");
        System.out.println("3        Macchiato     13 SR\n");
        System.out.println("4        Espresso      12 SR \n");
        System.out.println("5        Latte         12 SR \n");
        System.out.println("-------------------------------");
    }

   private static bookTable GenerateBooking(int id, boolean availability) throws ParseException {
        int ID = id;
        boolean avail = availability;
        bookTable booking = new bookTable(ID, avail);
        return booking;
    }

    private static Order Menu(int id, String name, int price) {
        int ID = id;
        String orderName = name;
        int orderPrice = price;
        Order orderList = new Order(id, orderName, orderPrice);

        return orderList;
    }

//        
    public static int searchOrder(Order[] orderList, int orderId) {
        for (int j = 0; j < orderList.length; j++) {
            if (orderList[j].getOrderID() == orderId) {
                return j;
            }

        }
        return -1;
    }

    public static int searchBooking(bookTable[] listBooking, int tableID) {
        for (int i = 0; i < listBooking.length; i++) {
            if (listBooking[i].getTableID() == tableID && listBooking[i].isTableAvailable()) {
                return i;
            }
        }
        return -1;
    }
    
}
