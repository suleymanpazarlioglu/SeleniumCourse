package com.cydeo.tests.day2_locators;

//TC #2: Back and forth navigation
//1- Open a chrome browser
//2- Go to: https://practice.cydeo.com
//3- Click to A/B Testing from top of the list.
//4- Verify title is:
//  Expected: No A/B Test
//5- Go back to home page by using the .back();
//6- Verify title equals:
//  Expected: Practice


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");
        WebElement href= driver.findElement(By.linkText("A/B Testing"));
        href.click();

        String expectedTitle="No A/B Test";
        String actualTitle=driver.getTitle();

        if (actualTitle.equals(expectedTitle))
            System.out.println("TITLE VERIFICATION PASSED");
        else
            System.out.println("TITLE VERIFICATION FAILED");

        driver.navigate().back();

        String expectedTitle2="Practice";
        String actualTitle2=driver.getTitle();

        if (actualTitle2.equals(expectedTitle2))
            System.out.println("TITLE2 VERIFICATION PASSED");
        else
            System.out.println("TITLE2 VERIFICATION FAILED");

        driver.close();


    }
}
