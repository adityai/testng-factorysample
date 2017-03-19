package com.iaditya.testng.factorysample;

import org.testng.annotations.Factory;

public class SimpleParameterTestFactory {
    @Factory
    public Object[] factoryMethod() {
        return new Object[] { new SimpleParameterTest(0), new SimpleParameterTest(1) };
    }
}
