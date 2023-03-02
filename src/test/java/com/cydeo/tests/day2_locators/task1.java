package com.cydeo.tests.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//TC #1: Cydeo practice tool verifications
//1. Open Chrome browser
//2. Go to https://practice.cydeo.com
//3. Verify URL contains
//Expected: cydeo
//4. Verify title:
//Expected: Practice


public class task1 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");

        String expectedURL="cydeo";
        String actualURL=driver.getCurrentUrl();

        if (actualURL.contains(expectedURL))
            System.out.println("URL VERIFICATION PASSED");
        else
            System.out.println("URL VERIFICATION FAILED");

        String expectedTitle="Practice";
        String actualTitle=driver.getTitle();

        if (actualTitle.equals(expectedTitle))
            System.out.println("TITLE VERIFICATION PASSED");
        else
            System.out.println("TITLE VERIFICATION FAILED");

        driver.close();


    }
}
