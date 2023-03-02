package com.cydeo.tests.day6_alerts_frames;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class alerts {

    //TC #1: Information alert practice
    //1. Open browser
    //2. Go to website: http://practice.cydeo.com/javascript_alerts
    //3. Click to “Click for JS Alert” button
    //4. Click to OK button from the alert
    //5. Verify “You successfully clicked an alert” text is displayed.
    //
    //TC #2: Confirmation alert practice
    //1. Open browser
    //2. Go to website: http://practice.cydeo.com/javascript_alerts
    //3. Click to “Click for JS Confirm” button
    //4. Click to OK button from the alert
    //5. Verify “You clicked: Ok” text is displayed.
    //
    //TC #3: Information alert practice
    //1. Open browser
    //2. Go to website: http://practice.cydeo.com/javascript_alerts
    //3. Click to “Click for JS Prompt” button
    //4. Send “hello” text to alert
    //5. Click to OK button from the alert
    //6. Verify “You entered:  hello” text is displayed.
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
    public void test1() throws InterruptedException {
        driver.get("http://practice.cydeo.com/javascript_alerts");
        WebElement jsAlertButton= driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        jsAlertButton.click();

        Thread.sleep(2000);

        Alert informationAlert=driver.switchTo().alert();
        informationAlert.accept();

        WebElement resultLabel=driver.findElement(By.id("result"));

        Assert.assertEquals(resultLabel.getText(),"You successfully clicked an alert");
    }

    @Test
    public void test2() throws InterruptedException {

        driver.get("http://practice.cydeo.com/javascript_alerts");
        WebElement jsConfirmButton= driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        jsConfirmButton.click();

        Thread.sleep(2000);

        Alert confirmationAlert=driver.switchTo().alert();
        confirmationAlert.accept();

        WebElement resultLabel=driver.findElement(By.id("result"));

        Assert.assertEquals(resultLabel.getText(),"You clicked: Ok");

    }

    @Test
    public void test3() throws InterruptedException {

        driver.get("http://practice.cydeo.com/javascript_alerts");
        WebElement jsPromptButton= driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        jsPromptButton.click();

        Thread.sleep(2000);

        Alert informationAlertWithTest=driver.switchTo().alert();
        informationAlertWithTest.sendKeys("Hello");
        Thread.sleep(2000);
        informationAlertWithTest.accept();
        Thread.sleep(2000);

        WebElement resultLabel=driver.findElement(By.id("result"));

        Assert.assertEquals(resultLabel.getText(),"You entered: Hello");

    }

}
