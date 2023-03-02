package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class webtable_order_verify {

    //TC #1: Web table practice
    // 1. Go to: https://practice.cydeo.com/web-tables
    //2. Verify Bob’s name is listed as expected.
    //Expected: “Bob Martin”
    //3. Verify Bob Martin’s order date is as expected
    //Expected: 12/31/2021
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
    public void test(){
        driver.get("https://practice.cydeo.com/web-tables");
        WebElement nameCell= driver.findElement(By.xpath("//table//tr[7]/td[2]"));

        Assert.assertEquals(nameCell.getText(),"Bob Martin");

        WebElement dateCell=driver.findElement(By.xpath("//table//tr[7]/td[2]/following-sibling::td[3]"));

        Assert.assertEquals(dateCell.getText(),"12/31/2021");




    }
    @Test
    public void test2_with_utils(){
        driver.get("https://practice.cydeo.com/web-tables");
        String orderDate= WebTableUtils.returnOrderDate(driver,"Alexandra Gray");
        System.out.println(orderDate);
        WebTableUtils.orderVerify(driver,"Alexandra Gray",orderDate);

    }

}
