package testWithLogin;

import method.LogoutMethod;
import method.VerifyMethod;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LogoutTest extends BaseTestWithLogin {

    @Test
    public void logoutTest() {
        LogoutMethod logoutMethod = new LogoutMethod(driver);
        VerifyMethod verifyMethod = new VerifyMethod(driver);
        logoutMethod.logout();
        try{
            verifyMethod.verifyUserIsLoggedOut("Login");

        }
        catch (Exception e){
            Assert.fail();
        }
    }
}
