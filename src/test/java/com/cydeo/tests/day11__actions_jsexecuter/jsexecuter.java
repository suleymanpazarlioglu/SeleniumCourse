package com.cydeo.tests.day11__actions_jsexecuter;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class jsexecuter {

    //TC #7: Scroll using JavascriptExecutor
    //1- Open a chrome browser
    //2- Go to: https://practice.cydeo.com/large
    //3- Scroll down to “Cydeo” link
    //4- Scroll up to “Home” link
    //5- Use below provided JS method only
    //
    //JavaScript method to use : arguments[0].scrollIntoView(true)
    //
    //Note: You need to locate the links as web elements and pass them as
    //arguments into executeScript() method

    @Test
    public void test() throws InterruptedException {

        Driver.getDriver().get("https://practice.cydeo.com/large");

        JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();

        WebElement homeLink=Driver.getDriver().findElement(By.linkText("Home"));
        WebElement cydeoLink=Driver.getDriver().findElement(By.linkText("CYDEO"));

        js.executeScript("arguments[0].scrollIntoView(true)",cydeoLink);

        Thread.sleep(2000);

        js.executeScript("arguments[0].scrollIntoView(true)",homeLink);

        Thread.sleep(2000);

        Driver.closeDriver();


    }

}
