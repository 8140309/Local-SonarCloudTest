/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fernando
 */
public class CalculatorTest {

    public CalculatorTest() {
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
     * Test of sumNumbers method, of class Calculator.
     */
    @Test
    public void testSumNumbers1() {
        System.out.println("sumNumbers1");
        int n1 = 2;
        int n2 = 3;
        Calculator instance = new Calculator();
        int expResult = 5;
        int result = instance.sumNumbers(n1, n2);
        assertEquals(expResult, result);
    }

//    @Test
//    public void testSumNumbers2() {
//        System.out.println("sumNumbers2");
//        int n1 = 2;
//        int n2 = 3;
//        Calculator instance = new Calculator();
//        int expResult = 6;
//        int result = instance.sumNumbers(n1, n2);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of sumNumbers method, of class Calculator.
//     */
//    @Test
//    public void testSumNumbers() {
//        System.out.println("sumNumbers");
//        int n1 = 0;
//        int n2 = 0;
//        Calculator instance = new Calculator();
//        int expResult = 0;
//        int result = instance.sumNumbers(n1, n2);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of divideNumbers method, of class Calculator.
//     */
//    @Test
//    public void testDivideNumbers() {
//        System.out.println("divideNumbers");
//        int n1 = 0;
//        int n2 = 0;
//        Calculator instance = new Calculator();
//        int expResult = 0;
//        int result = instance.divideNumbers(n1, n2);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of divideNumbers2 method, of class Calculator.
//     */
//    @Test
//    public void testDivideNumbers2() {
//        System.out.println("divideNumbers2");
//        int n1 = 0;
//        int n2 = 0;
//        Calculator instance = new Calculator();
//        int expResult = 0;
//        int result = instance.divideNumbers2(n1, n2);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

}
