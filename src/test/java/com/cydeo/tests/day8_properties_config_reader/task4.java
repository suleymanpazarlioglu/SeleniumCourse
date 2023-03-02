package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class task4 {

    //TC #4: Google search
    //1- Open a chrome browser
    //2- Go to: https://google.com
    //3- Write “apple” in search box
    //4- Verify title:
    //Expected: apple - Google Search
    //
    //Use `configuration.properties` for the following:
    //1. The browser type
    //2. The URL
    //3. The search keyword
    //4. Make title verification dynamic. If search value changes, title
    //assertion should not fail.
/*
    WebDriver driver;

    @BeforeMethod
    public void init() {
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void tearDown(){

        driver.quit();
    }

 */

    @Test
    public void test(){

        Driver.getDriver().get(ConfigurationReader.getProperty("URL"));
        WebElement searchBox= Driver.getDriver().findElement(By.cssSelector("input[name='q']"));
        searchBox.sendKeys(ConfigurationReader.getProperty("keyword")+ Keys.ENTER);
        BrowserUtils.verifyTitle(Driver.getDriver(),ConfigurationReader.getProperty("keyword")+" - Google'da Ara");
        Driver.closeDriver();
    }

}
