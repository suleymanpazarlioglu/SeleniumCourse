package com.cydeo.tests.day5_testNG_dropdown;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class testNG_Selenium {

    WebDriver driver;

    @BeforeMethod
    public void init(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void selenium_test(){
        driver.get("https://google.com");
        Assert.assertEquals(driver.getTitle(),"Google","Title is not matching here.");
    }


    @AfterMethod
    public void tearDown(){
        driver.close();
    }

}
