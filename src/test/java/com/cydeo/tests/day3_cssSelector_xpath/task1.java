package com.cydeo.tests.day3_cssSelector_xpath;

//TC #1: NextBaseCRM, locators and getText() practice
//1- Open a chrome browser
//2- Go to: https://login1.nextbasecrm.com/
//3- Enter incorrect username: “incorrect”
//4- Enter incorrect password: “incorrect”
//5- Click to log in button.
//6- Verify error message text is as expected:
//Expected: Incorrect login or password

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class task1 {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com");
        WebElement inputBox= driver.findElement(By.className("login-inp"));
        inputBox.sendKeys("incorrect");

        WebElement passwordBox= driver.findElement(By.name("USER_PASSWORD"));
        passwordBox.sendKeys("incorrect");

        WebElement logInBox= driver.findElement(By.className("login-btn"));
        logInBox.click();

        WebElement errorMessage= driver.findElement(By.className("errortext"));
        String actualErrorMessage=errorMessage.getText();

        if (actualErrorMessage.equals("Incorrect login or password"))
            System.out.println("PASSED");
        else
            System.out.println("FAILED");

        driver.close();


    }
}
