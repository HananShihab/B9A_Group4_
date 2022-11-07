/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Group_B9A_4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sam31
 */
public class OrderTest {
      
    public OrderTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getOrderID method, of class Order.
     */
    @Test
    public void testGetOrderID() {
        System.out.println("getOrderID");
        Order instance = new Order(9,"choclate",15);
        int expResult = 9;
        int result = instance.getOrderID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setOrderID method, of class Order.
     */
    @Test
    public void testSetOrderID() {
        System.out.println("setOrderID");
        int orderID = 7;
        Order instance = new Order(9,"choclate",15);
        instance.setOrderID(orderID);
        int result=instance.getOrderID();
        assertEquals(orderID, result);
    }

    /**
     * Test of getPrice method, of class Order.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Order instance = new Order(9,"choclate",15);
        double expResult = 15;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setPrice method, of class Order.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double price = 17;
        Order instance = new Order(9,"choclate",15);
        instance.setPrice(price);
        double result=instance.getPrice();
        assertEquals(price, result,0.0001);
       
    }

    /**
     * Test of getItem method, of class Order.
     */
    @Test
    public void testGetItem() {
        System.out.println("getItem");
        Order instance = new Order(9,"hot choclate",15);
        String expResult = "hot choclate";
        String result = instance.getItem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setItem method, of class Order.
     */
    @Test
    public void testSetItem() {
        System.out.println("setItem");
        String orderItem = "french vanilla";
        Order instance = new Order(8,"french vanilla",15);
        instance.setItem(orderItem);
        String result=instance.getItem();
        assertEquals(orderItem, result);
        
       
    }

    /**
     * Test of toString method, of class Order.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Order instance = new Order(8,"french vanilla",15);
        String expResult = "8 	 french vanilla     15.00";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}