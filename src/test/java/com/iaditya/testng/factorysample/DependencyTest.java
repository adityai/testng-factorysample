package com.iaditya.testng.factorysample;

import org.testng.annotations.Test;

/**
 * Sample test suite to demonstrate dependency tests
 * 
 * @author adityai
 *
 */
public class DependencyTest {
    private int param;
    
    /**
     * Simple constructor 
     * 
     * @param param
     */
    public DependencyTest(int param) {
        this.param = param;
    }
 
    /**
     * Simple test method that is dependent on testMethodTwo to complete
     */
    @Test(dependsOnMethods = { "testMethodTwo" })
    public void testMethodOne() {
        System.out.println("Test method one with param values: " + this.param);
    }
 
    @Test
    public void testMethodTwo() {
        System.out.println("Test method two with param values: " + this.param);
    }
    
}
