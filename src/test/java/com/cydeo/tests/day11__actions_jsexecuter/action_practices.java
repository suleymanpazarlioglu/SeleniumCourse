package com.cydeo.tests.day11__actions_jsexecuter;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class action_practices {

    //TC #4: Scroll practice
    //1- Open a chrome browser
    //2- Go to: https://practice.cydeo.com/
    //3- Scroll down to “Powered by CYDEO”
    //4- Scroll using Actions class “moveTo(element)” method
    //
    //
    //TC #5: Scroll practice 2
    //1- Continue from where the Task 4 is left in the same test.
    //2- Scroll back up to “Home” link using PageUP button

    @Test
    public void test1() throws InterruptedException {

        Driver.getDriver().get("https://practice.cydeo.com");

        WebElement cydeoLink=Driver.getDriver().findElement(By.linkText("CYDEO"));
        WebElement homeLink=Driver.getDriver().findElement(By.linkText("Home"));

        Actions actions=new Actions(Driver.getDriver());

        actions.moveToElement(cydeoLink).perform();

        Thread.sleep(2000);

        actions.moveToElement(homeLink).perform();

        //actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP).perform();

        Thread.sleep(1000);

        Driver.closeDriver();

    }
    @Test
    public void test2(){
        Driver.getDriver().get("https://practice.cydeo.com/");
        Driver.closeDriver();
    }

    @Test
    public void test3(){
        Driver.getDriver().get("https://practice.cydeo.com/");
        Driver.closeDriver();
    }

    @Test
    public void test4(){
        Driver.getDriver().get("https://practice.cydeo.com/");
        Driver.closeDriver();
    }
}
