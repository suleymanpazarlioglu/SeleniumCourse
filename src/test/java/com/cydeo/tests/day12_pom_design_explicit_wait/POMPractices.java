package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POMPractices {

    //TC #1: Required field error message test
    //1- Open a chrome browser
    //2- Go to: https://library1.cydeo.com
    //3- Do not enter any information
    //4- Click to “Sign in” button
    //5- Verify expected error is displayed:
    //Expected: This field is required.

    //TC #2: Invalid email format error message test
    //1- Open a chrome browser
    //2- Go to: https://library1.cydeo.com
    //3- Enter invalid email format
    //4- Verify expected error is displayed:
    //Expected: Please enter a valid email address.

    //TC #3: Library negative login
    //1- Open a chrome browser
    //2- Go to: https://library1.cydeo.com
    //3- Enter incorrect username or incorrect password
    //4- Verify title expected error is displayed:
    //Expected: Sorry, Wrong Email or Password

    LibraryLoginPage libraryLoginPage;

    @BeforeMethod
    public void init(){

        Driver.getDriver().get("https://library1.cydeo.com");
        libraryLoginPage=new LibraryLoginPage();

    }



    @Test
    public void test1(){

        libraryLoginPage.signInButton.click();

        Assert.assertEquals(libraryLoginPage.fieldRequiredErrorMessage.getText(),"This field is required.");

        Driver.closeDriver();

    }

    @Test
    public void test2(){

        libraryLoginPage.emailAddress.sendKeys("adffsfsf"+ Keys.ENTER);

        Assert.assertEquals(libraryLoginPage.enterValidEmailErrorMessage.getText(),"Please enter a valid email address.");

        Driver.closeDriver();

    }

    @Test
    public void test3(){

        libraryLoginPage.emailAddress.sendKeys("salomonkane@cydeo.com");
        libraryLoginPage.password.sendKeys("abcdef");
        libraryLoginPage.signInButton.click();

        Assert.assertEquals(libraryLoginPage.wrongEmailOrPasswordErrorMessage.getText(),"Sorry, Wrong Email or Password");

        Driver.closeDriver();


    }

}
