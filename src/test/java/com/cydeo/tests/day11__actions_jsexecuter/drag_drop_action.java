package com.cydeo.tests.day11__actions_jsexecuter;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class drag_drop_action {

    //TC #: Drag and drop
    //1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
    //2. Drag and drop the small circle to bigger circle.
    //3. Assert:
    //-Text in big circle changed to: “You did great!”

    @Test
    public void test() throws InterruptedException {

        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        WebElement smallBall= Driver.getDriver().findElement(By.xpath("//div[@id='draggable']"));
        WebElement circle= Driver.getDriver().findElement(By.xpath("//div[@id='droptarget']"));


        Actions actions=new Actions(Driver.getDriver());

        //actions.dragAndDrop(smallBall,circle).perform();

        actions.clickAndHold(smallBall)
                .pause(2000)
                .moveToElement(circle)
                .pause(2000)
                .release()
                .perform();


        Thread.sleep(2000);

        Assert.assertEquals(circle.getText(),"You did great!");

        Driver.closeDriver();
    }

}
