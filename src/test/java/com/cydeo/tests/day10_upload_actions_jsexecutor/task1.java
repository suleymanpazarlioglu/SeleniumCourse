package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class task1 {

    //TC#1: Registration form confirmation
    //Note: Use JavaFaker OR read from configuration.properties file when possible.
    //1. Open browser
    //2. Go to website: https://practice.cydeo.com/registration_form
    //3. Enter first name
    //4. Enter last name
    //5. Enter username
    //6. Enter email address
    //7. Enter password
    //8. Enter phone number
    //9. Select a gender from radio buttons
    //10. Enter date of birth
    //11. Select Department/Office
    //12. Select Job Title
    //13. Select programming language from checkboxes
    //14. Click to sign up button
    //15. Verify success message “You’ve successfully completed registration.” is
    //displayed.

    //Note:
    //1. Use new Driver utility class and method
    //2. User JavaFaker when possible
    //3. User ConfigurationReader when it makes sense

    @Test
    public void test(){

        Faker faker=new Faker();
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

        WebElement firstName=Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys(ConfigurationReader.getProperty("firstName"));

        WebElement lastName=Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys(ConfigurationReader.getProperty("lastName"));

        WebElement userName=Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        userName.sendKeys(ConfigurationReader.getProperty("userName"));

        WebElement email=Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        email.sendKeys(ConfigurationReader.getProperty("email"));

        WebElement password=Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        password.sendKeys(ConfigurationReader.getProperty("password"));

        WebElement phoneNumber=Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        phoneNumber.sendKeys(faker.numerify("571-###-####"));

        WebElement gender=Driver.getDriver().findElement(By.xpath("//input[@value='male']"));
        gender.click();

        WebElement birthDay=Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        birthDay.sendKeys(ConfigurationReader.getProperty("birthday"));

        Select selectDepartment=new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        selectDepartment.selectByIndex(1);

        Select selectJobTitle=new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
        selectJobTitle.selectByVisibleText("SDET");

        WebElement programmingLanguage=Driver.getDriver().findElement(By.id("inlineCheckbox2"));
        programmingLanguage.click();

        WebElement signUpButton=Driver.getDriver().findElement(By.xpath("//button[.='Sign up']"));
        signUpButton.click();


        WebElement message=Driver.getDriver().findElement(By.xpath("//*[@id=\"content\"]/div/div/p"));

        Assert.assertEquals(message.getText(),"You've successfully completed registration!");

        Driver.closeDriver();

    }
}
