package com.javamvn.examples;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    static Calculator app;

    @BeforeClass
    public static void initCalculator(){
        app = new Calculator();
    }

    @Before
    public void beforeEachTest(){
        System.out.println("This is executed before every test");
    }

    @Test
    public void testSum(){
        int result = app.add(4,5);
        assertEquals(9,result);
    }

    @Test
    public void testSubtract(){
        int result = app.subtract(5,5);
        assertEquals(0,result);
    }

    @Test
    public void testMultiplication(){
        long result = app.multiplication(5,8);
        assertEquals(40,result);
    }
}