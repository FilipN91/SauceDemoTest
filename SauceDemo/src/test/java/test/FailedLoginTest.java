package test;

import dataGenerator.DataProviderData;
import method.LoginMethod;
import method.VerifyMethod;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.PropertyManager;

public class FailedLoginTest extends BaseTest{

    @Test(dataProvider = "failedLogin", dataProviderClass = DataProviderData.class)
    public void failedLoginTest(String username, String password, String expectedText) {
        LoginMethod emptyUsernameFieldLogin = new LoginMethod(driver);
        VerifyMethod verifyMethod = new VerifyMethod(driver);
        emptyUsernameFieldLogin.login(username,password);

        try{
            verifyMethod.verifyFailedLogin(expectedText);
            PropertyManager.changeProperty("badUsername",username);
            PropertyManager.changeProperty("badPassword",password);
        }
        catch (Exception e){
            Assert.fail();
        }
    }
}
