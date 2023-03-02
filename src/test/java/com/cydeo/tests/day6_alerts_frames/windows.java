package com.cydeo.tests.day6_alerts_frames;

//TC #5: Window Handle practice
//
//1. Create a new class called: T5_WindowsPractice
//2. Create new test and make set ups
//3. Go to : https://practice.cydeo.com/windows
//4. Assert: Title is “Windows”
//5. Click to: “Click Here” link
//6. Switch to new Window.
//7. Assert: Title is “New Window”

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class windows {
    WebDriver driver;

    @BeforeMethod
    public void init() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void tearDown(){

        driver.quit();
    }

    @Test
    public void test() throws InterruptedException {
        driver.get("https://practice.cydeo.com/windows");
        Assert.assertEquals(driver.getTitle(),"Windows");

        WebElement clickHereButton= driver.findElement(By.linkText("Click Here"));
        clickHereButton.click();

        Set<String> allWindows=driver.getWindowHandles();


        for (String window  : allWindows) {
            driver.switchTo().window(window);
        }

        Assert.assertEquals(driver.getTitle(),"New Window");
    }
}
