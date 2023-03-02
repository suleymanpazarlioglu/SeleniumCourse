package com.cydeo.tests.day4_findElements_checkboxes;

//TC #4: FindElements Task
//1- Open a chrome browser
//2- Go to: https://practice.cydeo.com/abtest
//3- Locate all the links in the page.
//4- Print out the number of the links on the page.
//5- Print out the texts of the links.
//6- Print out the HREF attribute values of the links

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class task4 {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/abtest");

        List<WebElement> links=driver.findElements(By.tagName("a"));

        System.out.println("links.size() = " + links.size());

        for (WebElement link:links) {
            System.out.println(link.getText());
        }

        for (WebElement link:links) {
            System.out.println(link.getAttribute("href"));
        }

        driver.close();

    }

}
