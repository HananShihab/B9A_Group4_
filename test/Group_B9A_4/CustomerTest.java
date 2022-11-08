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
import org.junit.Ignore;


public class CustomerTest {
    
    public CustomerTest() {
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
     * Test of AddOrder method, of class Customer.
     */
    
    @Ignore
    public void testAddOrder() {
        System.out.println("AddOrder");
        Order o = null;
        Customer instance = null;
        boolean expResult = false;
        boolean result = instance.AddOrder(o);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of BookTable method, of class Customer.
     */
    
    @Ignore
    public void testBookTable() {
        System.out.println("BookTable");
        bookTable table = null;
        Customer instance = null;
        instance.BookTable(table);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFname method, of class Customer.
     */
    @Test
    public void testGetFname() {
        System.out.println("getFname");
        Customer instance = new Customer("Sara","Ahmed");
        String expResult = "Sara";
        String result = instance.getFname();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setFname method, of class Customer.
     */
    @Test
   
     public void testSetFname() {
        System.out.println("setFname");
        String fname = "Layla";
        Customer instance = new Customer("Sara","Ahmed");
        instance.setFname(fname);
        String result = instance.getFname();
        assertEquals(fname, result);
        
    }

    /**
     * Test of getLname method, of class Customer.
     */
    @Test
    public void testGetLname() {
        System.out.println("getLname");
        Customer instance = new Customer("Sara","Ahmed");
        String expResult = "Ahmed";
        String result = instance.getLname();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setLname method, of class Customer.
     */
    @Test
    public void testSetLname() {
        System.out.println("setLname");
        String lname = "Khalid";
        Customer instance = new Customer("Sara","Ahmed");;
        instance.setLname(lname);
        String expResult = "Khalid";
        String result = instance.getLname();
        assertEquals(expResult, result);
        
        
    }
    
}
