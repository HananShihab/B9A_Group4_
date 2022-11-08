/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Group_B9A_4;

import java.util.ArrayList;


public class Customer  {
     private String Fname;
    private String Lname;
   

    private bookTable Table;
    private ArrayList<Order> OrderList = new ArrayList();


    public Customer(String fname, String lname) {
        Fname = fname;
        Lname = lname;
       
        
    }

    public boolean AddOrder(Order o){
        OrderList.add(o);
        return true;
    }

    

    public void BookTable(bookTable table){
        Table = table;
    }


    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }


    
}