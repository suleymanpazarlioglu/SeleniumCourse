package com.cydeo.tests.day2_locators;

//TC #4: Library verifications
//1. Open Chrome browser
//2. Go to http://library2.cybertekschool.com/login.html
//3. Enter username: “incorrect@email.com”
//4. Enter password: “incorrect password”
//5. Verify: visually “Sorry, Wrong Email or Password”
//displayed
//PS: Locate username input box using “className” locator
//Locate password input box using “id” locator
//Locate Sign in button using “tagName” locator


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task4 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://library2.cybertekschool.com/login.html");
        WebElement email=driver.findElement(By.className("form-control"));
        email.sendKeys("incorrect@email.com");
        WebElement password= driver.findElement(By.id("inputPassword"));
        password.sendKeys("incorrect password");
        WebElement signButton= driver.findElement(By.tagName("button"));
        signButton.click();

        driver.close();

    }
}
