package com.iaditya.testng.factorysample;

import org.testng.annotations.Factory;

/**
 * Simple parameter test factory 
 * 
 * @author adityai
 *
 */
public class SimpleParameterTestFactory {
   
	/**
	 * Factory method to trigger simple parameter tests from Factory
	 * @return
	 */
	@Factory
    public Object[] factoryMethod() {
        return new Object[] { new SimpleParameterTest(0), new SimpleParameterTest(1) };
    }
}
