package com.cydeo.tests.day6_alerts_frames;

//TC #4: Iframe practice
//1. Create a new class called: T4_Iframes
//2. Create new test and make set ups
//3. Go to: https://practice.cydeo.com/iframe
//4. Assert: “Your content goes here.” Text is displayed.
//5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class iframe {

    WebDriver driver;

    @BeforeMethod
    public void init() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void tearDown(){

        driver.close();
    }

    @Test
    public void test1(){
        driver.get("https://practice.cydeo.com/iframe");
        WebElement iframe=driver.findElement(By.id("mce_0_ifr"));

        driver.switchTo().frame(iframe);
        Assert.assertEquals(driver.findElement(By.xpath("//p[.='Your content goes here.']")).getText(),"Your content goes here.");

        driver.switchTo().parentFrame();
        Assert.assertEquals(driver.findElement(By.xpath("//h3")).getText(),"An iFrame containing the TinyMCE WYSIWYG Editor");


    }
}
