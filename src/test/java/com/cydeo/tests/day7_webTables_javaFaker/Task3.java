package com.cydeo.tests.day7_webTables_javaFaker;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import org.testng.annotations.Test;


//TC #3: Login scenario
// 1. Create new test and make set ups
//2. Go to : http://login1.nextbasecrm.com/
//3. Enter valid username
//4. Enter valid password
//5. Click to `Log In` button
//6. Verify title is as expected:
//Expected: Portal

public class Task3 extends TestBase {


    @Test
    public void test(){
        driver.get("http://login1.nextbasecrm.com/");

        CRM_Utilities.crm_login(driver);

        BrowserUtils.verifyTitle(driver,"My tasks");
    }

}
