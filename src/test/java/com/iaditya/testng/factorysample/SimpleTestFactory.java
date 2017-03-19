package com.iaditya.testng.factorysample;

import org.testng.annotations.Factory;

public class SimpleTestFactory 
{
    @Factory
    public Object[] factoryMethod() {
        return new Object[] { new SimpleTest(), new SimpleTest() };
    }
}
