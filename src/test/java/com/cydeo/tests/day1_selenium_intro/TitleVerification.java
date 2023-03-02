package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class TitleVerification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://www.yahoo.com");

        String expectedTitle="Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";

        String actualTitle=driver.getTitle();

         if (actualTitle.equals(expectedTitle))
            System.out.println("VERIFICATION PASSED");
        else
            System.out.println("VERIFICATION FAILED");




        driver.close();
    }
}