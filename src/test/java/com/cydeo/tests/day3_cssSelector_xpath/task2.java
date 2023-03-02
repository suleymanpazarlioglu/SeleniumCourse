package com.cydeo.tests.day3_cssSelector_xpath;

//TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
//1- Open a chrome browser
//2- Go to: https://login1.nextbasecrm.com/
//3- Verify “remember me” label text is as expected:
//Expected: Remember me on this computer
//4- Verify “forgot password” link text is as expected:
//Expected: Forgot your password?
//5- Verify “forgot password” href attribute’s value contains expected:
//Expected: forgot_password=yes

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class task2 {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://login1.nextbasecrm.com");
        driver.manage().window().maximize();

        WebElement rememberMeLabel=driver.findElement(By.className("login-item-checkbox-label"));
        String actualRememberMeLabel=rememberMeLabel.getText();

        if (actualRememberMeLabel.equals("Remember me on this computer"))
            System.out.println("passed");
        else
            System.out.println("failed");

        WebElement forgotYourPassword= driver.findElement(By.className("login-link-forgot-pass"));
        String actualForgotYourPassword=forgotYourPassword.getText();

        if (actualForgotYourPassword.equalsIgnoreCase("Forgot your password?"))
            System.out.println("passed");
        else
            System.out.println("failed");

        String hrefAttribute=forgotYourPassword.getAttribute("href");

        if (hrefAttribute.contains("forgot_password=yes"))
            System.out.println("passed");
        else
            System.out.println("failed");

        driver.close();
    }
}
