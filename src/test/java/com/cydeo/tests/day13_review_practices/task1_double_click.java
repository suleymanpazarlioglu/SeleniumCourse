package com.cydeo.tests.day13_review_practices;

import com.cydeo.pages.DoubleClickPage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class task1_double_click {

    //TC #1: Double Click Test
    //1. Go to
    //https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblcli
    //ck2
    //2. Switch to iframe.
    //3. Double click on the text “Double-click me to change my text color.”
    //4. Assert: Text’s “style” attribute value contains “red”.

    @Test
    public void test() throws InterruptedException {
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");

        Driver.getDriver().switchTo().frame("iframeResult");

        Actions actions=new Actions(Driver.getDriver());

        DoubleClickPage doubleClickPage=new DoubleClickPage();

        actions.doubleClick(doubleClickPage.textToDoubleClick).perform();

        Thread.sleep(2000);

        Assert.assertEquals(doubleClickPage.textToDoubleClick.getAttribute("style"),"color: red;");

        Driver.closeDriver();



    }
}
