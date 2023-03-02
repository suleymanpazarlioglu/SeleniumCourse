package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class actions {
    //TC #3: Hover Test
    //1. Go to https://practice.cydeo.com/hovers
    //2. Hover over to first image
    //3. Assert:
    //a. “name: user1” is displayed
    //b. “view profile” is displayed
    //4. Hover over to second image
    //5. Assert:
    //a. “name: user2” is displayed
    //b. “view profile” is displayed
    //6. Hover over to third image
    //7. Confirm:
    //a. “name: user3” is displayed
    //b. “view profile” is displayed

    @Test
    public void test() throws InterruptedException {

        Driver.getDriver().get("https://practice.cydeo.com/hovers");
        Actions actions=new Actions(Driver.getDriver());

        WebElement image1=Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement image2=Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement image3=Driver.getDriver().findElement(By.xpath("(//img)[3]"));

        WebElement user1=Driver.getDriver().findElement(By.xpath("(//h5)[1]"));
        WebElement user2=Driver.getDriver().findElement(By.xpath("(//h5)[2]"));
        WebElement user3=Driver.getDriver().findElement(By.xpath("(//h5)[3]"));

        Thread.sleep(2000);

        actions.moveToElement(image1).perform();
        Assert.assertEquals(user1.getText(),"name: user1");

        Thread.sleep(2000);

        actions.moveToElement(image2).perform();
        Assert.assertEquals(user2.getText(),"name: user2");

        Thread.sleep(2000);

        actions.moveToElement(image3).perform();
        Assert.assertEquals(user3.getText(),"name: user3");

        Thread.sleep(2000);

        Driver.closeDriver();


    }
}
