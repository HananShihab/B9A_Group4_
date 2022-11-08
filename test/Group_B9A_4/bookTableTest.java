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
public class bookTableTest {
    
    public bookTableTest() {
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
     * Test of getTableID method, of class bookTable.
     */
    @Test
    public void testGetTableID() {
        System.out.println("getTableID");
        bookTable instance = new bookTable(77,true);
        int expResult = 77;
        int result = instance.getTableID();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setTableID method, of class bookTable.
     */
    @Test
    public void testSetTableID() {
        System.out.println("setTableID");
        int tableID = 88;
        bookTable instance = new bookTable(77,true);
        instance.setTableID(tableID);
        int expResult = 88;
        int result = instance.getTableID();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of isTableAvailable method, of class bookTable.
     */
    @Test
    public void testIsTableAvailable() {
        System.out.println("isTableAvailable");
        bookTable instance = new bookTable(77,true);
        boolean expResult = true;
        boolean result = instance.isTableAvailable();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setisTableAvailable method, of class bookTable.
     */
    @Test
    public void testSetisTableAvailable() {
        System.out.println("setisTableAvailable");
        boolean tableAvilable = true;
        bookTable instance = new bookTable(77,false);
        instance.setisTableAvailable(tableAvilable);
        boolean exp=true;
        assertTrue(exp);
        
    }
    
}