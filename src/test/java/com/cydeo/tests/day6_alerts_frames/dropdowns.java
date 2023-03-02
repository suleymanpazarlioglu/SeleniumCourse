package com.cydeo.tests.day6_alerts_frames;

//TC #5: Selecting state from State dropdown and verifying result
//1. Open Chrome browser
//2. Go to http://practice.cybertekschool.com/dropdown
//3. Select Illinois
//4. Select Virginia
//5. Select California
//6. Verify final selected option is California.
//Use all Select options. (visible text, value, index)

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class dropdowns {

    WebDriver driver;

    @BeforeMethod
    public void init() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test5() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/dropdown");

        Select stateDropdown=new Select(driver.findElement(By.id("state")));
        stateDropdown.selectByIndex(14);

        Thread.sleep(2000);

        stateDropdown.selectByVisibleText("Virginia");

        Thread.sleep(2000);

        stateDropdown.selectByValue("CA");

        Assert.assertEquals(stateDropdown.getFirstSelectedOption().getText(),"California");


    }

    @Test
    public void test6(){
        driver.get("http://practice.cybertekschool.com/dropdown");

        Select yearDropdown=new Select(driver.findElement(By.id("year")));
        yearDropdown.selectByVisibleText("1924");

        Select monthDropdown=new Select(driver.findElement(By.id("month")));
        monthDropdown.selectByValue("11");

        Select dayDropdown=new Select(driver.findElement(By.id("day")));
        dayDropdown.selectByIndex(0);

        Assert.assertEquals(yearDropdown.getFirstSelectedOption().getText(),"1924");
        Assert.assertEquals(monthDropdown.getFirstSelectedOption().getText(),"December");
        Assert.assertEquals(dayDropdown.getFirstSelectedOption().getText(),"1");

    }

    @AfterMethod
    public void tearDown(){

        driver.close();
    }
}