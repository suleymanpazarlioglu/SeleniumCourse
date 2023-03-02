package com.cydeo.tests.day4_findElements_checkboxes;

//TC #1: XPATH and cssSelector Practices
//1. Open Chrome browser
//2. Go to https://practice.cydeo.com/forgot_password
//3. Locate all the WebElements on the page using XPATH and/or CSS
//locator only (total of 6)
//a. “Home” link
//b. “Forgot password” header
//c. “E-mail” text
//d. E-mail input box
//e. “Retrieve password” button
//f. “Powered by Cydeo text
//4. Verify all web elements are displayed.
//First solve the task with using cssSelector only. Try to create 2 different
//cssSelector if possible

//Then solve the task using XPATH only. Try to create 2 different
//XPATH locator if possible


import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class task1 {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/forgot_password");

        WebElement homeLink= driver.findElement(By.cssSelector("a[class='nav-link']"));

        WebElement forgotPassword= driver.findElement(By.xpath("//h2[.='Forgot Password']"));

        WebElement emailLabel= driver.findElement(By.xpath("//label[@for='email']"));

        WebElement emailInput= driver.findElement(By.xpath("//input[@name='email']"));

        WebElement button= driver.findElement(By.cssSelector("button#form_submit"));

        WebElement cydeoHref= driver.findElement(By.cssSelector("a[target='_blank']"));

        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());
        System.out.println("forgotPassword.isDisplayed() = " + forgotPassword.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
        System.out.println("emailInput.isDisplayed() = " + emailInput.isDisplayed());
        System.out.println("button.isDisplayed() = " + button.isDisplayed());
        System.out.println("cydeoHref.isDisplayed() = " + cydeoHref.isDisplayed());

        driver.close();


    }

}
