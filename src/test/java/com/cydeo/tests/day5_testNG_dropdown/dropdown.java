package com.cydeo.tests.day5_testNG_dropdown;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class dropdown {

    //TC#4: Verifying “Simple dropdown” and “State selection” dropdown
    //default values
    //1. Open Chrome browser
    //2. Go to https://practice.cydeo.com/dropdown
    //3. Verify “Simple dropdown” default selected value is correct
    //Expected: “Please select an option”
    //4. Verify “State selection” default selected value is correct
    //Expected: “Select a State”

    WebDriver driver;
    @BeforeMethod
    public void init() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }



    @Test
    public void test1(){
        driver.get("https://practice.cydeo.com/dropdown");
        Select simpleDropdown=new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        Assert.assertEquals(simpleDropdown.getFirstSelectedOption().getText(),"Please select an option");

        Select stateDropdown=new Select(driver.findElement(By.xpath("//select[@id='state']")));
        Assert.assertEquals(stateDropdown.getFirstSelectedOption().getText(),"Select a State");

    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
