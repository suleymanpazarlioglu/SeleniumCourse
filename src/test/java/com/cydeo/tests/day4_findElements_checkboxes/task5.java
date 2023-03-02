package com.cydeo.tests.day4_findElements_checkboxes;

//Practice: Checkboxes
//1. Go to http://practice.cydeo.com/checkboxes
//2. Confirm checkbox #1 is NOT selected by default
//3. Confirm checkbox #2 is SELECTED by default.
//4. Click checkbox #1 to select it.
//5. Click checkbox #2 to deselect it.
//6. Confirm checkbox #1 is SELECTED.
//7. Confirm checkbox #2 is NOT selected.

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class task5 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/checkboxes");

        WebElement checkbox1=driver.findElement(By.id("box1"));
        WebElement checkbox2= driver.findElement(By.id("box2"));

        System.out.println("checkbox1.isSelected() expecting false=" + checkbox1.isSelected());
        System.out.println("checkbox2.isSelected() expecting true=" + checkbox2.isSelected());

        Thread.sleep(2000);
        checkbox1.click();
        Thread.sleep(2000);
        checkbox2.click();
        Thread.sleep(2000);

        System.out.println("checkbox1.isSelected() expecting true=" + checkbox1.isSelected());
        System.out.println("checkbox2.isSelected() expecting false=" + checkbox2.isSelected());

        driver.close();

    }


}
