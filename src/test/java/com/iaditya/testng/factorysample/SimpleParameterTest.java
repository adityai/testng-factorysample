package com.iaditya.testng.factorysample;

import org.testng.annotations.Test;

/**
 * Simple parameter test suite. Too basic.
 * 
 * @author adityai
 *
 */
public class SimpleParameterTest {
    private int param;
    
    public SimpleParameterTest(int param) {
        this.param = param;
    }
 
    @Test
    public void testMethodOne() {
        int opValue = param + 1;
        System.out.println("Test method one output: " + opValue);
    }
 
    @Test
    public void testMethodTwo() {
        int opValue = param + 2;
        System.out.println("Test method two output: " + opValue);
    }
}
