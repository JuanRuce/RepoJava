/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jrac.core.function;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jruiz
 */
public class AFTest {
    
    public AFTest() {
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
     * Test of Plus method, of class AF.
     */
    @Test
    public void testPlus() {
        System.out.println("Plus");
        double sum1 = 4.5;
        double sum2 = 7.3;
        AF instance = new AF();
        double expResult = 11.8;
        double result = instance.Plus(sum1, sum2);
        assertEquals(expResult, result, 0.0);
        if(result != expResult){
         fail("The test case is a prototype.");
        }
    }

    /**
     * Test of Menus method, of class AF.
     */
    @Test
    public void testMenus() {
        System.out.println("Menus");
        double menus1 = 5.4;
        double menus2 = 1.2;
        AF instance = new AF();
        double expResult = 4.2;
        double result = instance.Menus(menus1, menus2);
        assertEquals(expResult, result, 0.0);
        if (result != expResult){
         fail("The test case is a prototype.");
        }
    }
    
}
