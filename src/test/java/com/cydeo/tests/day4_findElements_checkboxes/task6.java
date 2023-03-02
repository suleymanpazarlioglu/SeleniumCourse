package com.cydeo.tests.day4_findElements_checkboxes;

//TC #6: StaleElementReferenceException Task
//1- Open a chrome browser
//2- Go to: https://practice.cydeo.com/abtest
//3- Locate “CYDEO” link, verify it is displayed.
//4- Refresh the page.
//5- Verify it is displayed, again.

//This is a simple StaleElementReferenceException to understand what is
//this exception and how to handle it.

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class task6 {

    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/abtest");

        WebElement cydeoLink= driver.findElement(By.linkText("CYDEO"));
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());

        driver.navigate().refresh();

        WebElement cydeoLink2= driver.findElement(By.linkText("CYDEO"));
        System.out.println("cydeoLink2.isDisplayed() = " + cydeoLink2.isDisplayed());

        driver.close();
    }
}
