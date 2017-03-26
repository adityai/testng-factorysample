package com.iaditya.testng.factorysample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

/**
 * Simple test suite with Factory and data provider
 *  
 * @author adityai
 *
 */
public class DataProviderTest 
{
    private int param;
 
    /**
     * Factory method to initialize testng test suite with the dataprovider
     * @param param
     */
    @Factory(dataProvider = "dataMethod")
    public DataProviderTest(int param) {
        this.param = param;
    }
 
    /**
     * Data provider used by the Factory method
     * 
     * @return
     */
    @DataProvider
    public static Object[][] dataMethod() {
        return new Object[][] { { 0 }, { 1 } };
    }
 
    /**
     * Simple test method that is truly not testing anything.
     */
    @Test
    public void testMethodOne() {
        int opValue = param + 1;
        System.out.println("Test method one output: " + opValue);
    }
 
    /**
     * Simple test method that is truly not testing anything.
     */
    @Test
    public void testMethodTwo() {
        int opValue = param + 2;
        System.out.println("Test method two output: " + opValue);
    }
}
