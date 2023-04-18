package testWithLogin;

import method.LoginMethod;
import org.testng.annotations.BeforeMethod;
import test.BaseTest;
import utilities.PropertyManager;

public class BaseTestWithLogin extends BaseTest {

    @BeforeMethod
    public void setup(){
        LoginMethod loginPage = new LoginMethod(super.driver);
        loginPage.login(PropertyManager.getInstance().getGoodUsername(), PropertyManager.getInstance().getGoodPassword());
    }
}

