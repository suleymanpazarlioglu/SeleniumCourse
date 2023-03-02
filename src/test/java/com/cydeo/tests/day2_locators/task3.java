package com.cydeo.tests.day2_locators;

//TC#3: Google search
//1- Open a chrome browser
//2- Go to: https://google.com
//3- Write “apple” in search box
//4- Click google search button
//5- Verify title:
//Expected: Title should start with “apple” word

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task3 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");
        WebElement searchBox=driver.findElement(By.name("q"));
        searchBox.sendKeys("apple"+ Keys.ENTER);

        String expectedTitle="apple";
        String actualTitle=driver.getTitle();

        if (actualTitle.startsWith(expectedTitle))
            System.out.println("TITLE VERIFICATION PASSED");
        else
            System.out.println("TITLE VERIFICATION FAILED");

        driver.close();

    }
}
