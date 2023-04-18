package test;

import suites.browser.Browser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest extends Browser {

    @Parameters({"browser"})
    @BeforeMethod
    public void setup(String browser){
        switch (browser.toLowerCase()){
            case "chrome" :
                startChrome();
                break;
            case "firefox" :
                startFirefox();
                break;
            default:
                startChrome();
        }
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
