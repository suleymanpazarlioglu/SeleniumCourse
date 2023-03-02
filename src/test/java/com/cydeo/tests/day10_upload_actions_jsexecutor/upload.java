package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class upload {

    //TC #2 Upload Test
    //1. Go to https://practice.cydeo.com/upload
    //2. Find some small file from your computer, and get the path of it.
    //3. Upload the file.
    //4. Assert:
    //-File uploaded text is displayed on the page

    @Test
    public void test() throws InterruptedException {

        Driver.getDriver().get("https://practice.cydeo.com/upload");

        WebElement chooseFile=Driver.getDriver().findElement(By.xpath("//input[@id='file-upload']"));
        chooseFile.sendKeys("/Users/suleymanpazarlioglu/Desktop/TÜM SKU lar/2004/black.png");

        Thread.sleep(2000);

        WebElement uploadButton=Driver.getDriver().findElement(By.id("file-submit"));
        uploadButton.click();

        WebElement message=Driver.getDriver().findElement(By.tagName("h3"));

        Assert.assertEquals(message.getText(),"File Uploaded!");

        Driver.closeDriver();


    }

}
