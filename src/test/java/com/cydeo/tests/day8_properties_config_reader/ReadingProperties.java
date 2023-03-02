package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.ConfigurationReader;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void test() throws IOException {

        Properties properties=new Properties();
        FileInputStream file=new FileInputStream("configuration.properties");
        properties.load(file);
        System.out.println("properties.get(\"browser\") = " + properties.get("browser"));

        String username=ConfigurationReader.getProperty("username");
        System.out.println("username = " + username);
    }
}

