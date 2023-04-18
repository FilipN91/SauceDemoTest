package method;

import org.openqa.selenium.WebDriver;
import page.LoginPage;

public class LoginMethod extends LoginPage {
    public LoginMethod(WebDriver driver) {
        super(driver);
    }
    public void login(String username, String password){
        writeUsername(username);
        writePassword(password);
        clickOnLoginButton();
    }
}
