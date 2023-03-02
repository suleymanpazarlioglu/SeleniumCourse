package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.tesla.com");

        String currentTitle=driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        String currentURL=driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        Thread.sleep(2000);

        driver.navigate().back();

        Thread.sleep(2000);

        driver.navigate().forward();

        Thread.sleep(2000);

        driver.navigate().refresh();

        Thread.sleep(2000);

        driver.navigate().to("https://www.google.com");

        currentTitle=driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        currentURL=driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        driver.close();


    }
}
