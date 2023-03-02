package com.cydeo.tests.day5_testNG_dropdown;

import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class testNG_intro {


    @Test(priority = 1)
    public void test1(){
        System.out.println("test1 is running");
        String actual="apple";
        String expected="apple";
        assertEquals(actual,expected);
    }

    @Test(priority = 2)
    public void test2(){
        System.out.println("test2 is running");
    }

    @BeforeClass
    public void setupMethod(){
        System.out.println("-----> BeforeClass is running!");

    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("-----> AfterClass is running!");

    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("---> BeforeMethod is running!");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("---> AfterMethod is running!");
    }


}
