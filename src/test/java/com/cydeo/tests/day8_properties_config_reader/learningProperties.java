package com.cydeo.tests.day8_properties_config_reader;

import org.testng.annotations.Test;

public class learningProperties {

    @Test
    public void test(){

        //key=value format
        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));

    }
}
