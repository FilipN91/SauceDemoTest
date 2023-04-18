package test;

import method.LoginMethod;
import method.VerifyMethod;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.PropertyManager;

public class LoginTest extends BaseTest{

    @Test
    public void successfulLogin(){
        LoginMethod loginMethod = new LoginMethod(driver);
        VerifyMethod verifyMethod = new VerifyMethod(driver);
        loginMethod.login(PropertyManager.getInstance().getGoodUsername(), PropertyManager.getInstance().getGoodPassword());
        try {
            verifyMethod.verifySuccessfulLogin("Logout");
        }
        catch (Exception e) {
            Assert.fail();
        }
    }
}
