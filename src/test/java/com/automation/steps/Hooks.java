package com.automation.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setUp(){
        System.out.println("before each scenario");
    }

    @After
    public void cleanUp(){
        System.out.println("after each scenario");
    }
}
