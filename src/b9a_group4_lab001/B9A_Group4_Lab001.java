/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b9a_group4_lab001;

import java.util.Scanner;

/**
 *
 * @author Hanan
 */
public class B9A_Group4_Lab001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);
        Scanner inputI = new Scanner(System.in);
        int choice=0;
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
                   
                    break;
                case 2:
                    
                    break;

                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;

            }
        } while (choice != 6);

        
  
    }    
}
