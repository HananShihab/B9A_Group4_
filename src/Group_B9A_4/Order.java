/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Group_B9A_4;

/**
 *
 * @author sam31
 */
public class Order {
   private int OrderID;
   private String Item;
   private double price;

    public Order(int OrderID, String OrderItem, double price) {
        this.OrderID = OrderID;
        this.Item = OrderItem;
        this.price = price;
    }
   
   

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int orderID) {
        OrderID = orderID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getItem() {
        return Item;
    }

    public void setItem(String orderItem) {
        Item = orderItem;
    }

    

    @Override
    public String toString() {
        return String.format("%d \t %-18s %.2f" , OrderID,Item.replaceAll("_", " "),price);
    }
}