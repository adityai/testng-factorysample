package com.iaditya.testng.factorysample;

import org.testng.annotations.Factory;

/**
 * Simple Factory class to trigger dependency tests
 * 
 * @author adityai
 *
 */
public class DependencyTestFactory {
	
	/**
	 * Simple Factory method to trigger dependency tests
	 * 
	 * @return
	 */
    @Factory
    public Object[] factoryMethod() 
    {
        return new Object[] { new DependencyTest(1), new DependencyTest(2) };
    }
}
