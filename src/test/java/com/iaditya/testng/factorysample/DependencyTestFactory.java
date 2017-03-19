package com.iaditya.testng.factorysample;

import org.testng.annotations.Factory;

public class DependencyTestFactory {
    @Factory
    public Object[] factoryMethod() 
    {
        return new Object[] { new DependencyTest(1), new DependencyTest(2) };
    }
}
