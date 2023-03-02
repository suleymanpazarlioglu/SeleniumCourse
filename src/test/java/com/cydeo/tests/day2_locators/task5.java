package com.cydeo.tests.day2_locators;

//TC #5: getText() and getAttribute() method practice
//1- Open a chrome browser
//2- Go to: https://practice.cydeo.com/registration_form
//3- Verify header text is as expected:
//  Expected: Registration form
//4- Locate “First name” input box
//5- Verify placeholder attribute’s value is as expected:
//  Expected: first name

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task5 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/registration_form");
        WebElement header= driver.findElement(By.tagName("h2"));
        String actualHeader=header.getText();
        String expectedHeader="Registration form";

        if (actualHeader.equals(expectedHeader))
            System.out.println("HEADER VERIFICATION PASSED");
        else
            System.out.println("HEADER VERIFICATION FAILED");

        WebElement firstName=driver.findElement(By.className("form-control"));
        String actualAttributeName=firstName.getAttribute("placeholder");

        String expectedAttributeName="first name";

        if (actualAttributeName.equals(expectedAttributeName))
            System.out.println("ATTRIBUTE VERIFICATION PASSED");
        else
            System.out.println("ATTRIBUTE VERIFICATION FAILED");

        driver.close();
    }
}
