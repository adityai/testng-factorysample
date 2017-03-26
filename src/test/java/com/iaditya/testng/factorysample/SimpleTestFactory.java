package com.iaditya.testng.factorysample;

import org.testng.annotations.Factory;

/**
 * Simple test factory class
 * 
 * @author adityai
 *
 */
public class SimpleTestFactory 
{
	/**
	 * Simple factory methods
	 * @return
	 */
    @Factory
    public Object[] factoryMethod() {
        return new Object[] { new SimpleTest(), new SimpleTest() };
    }
}
