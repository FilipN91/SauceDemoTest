package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    By usernameFieldBy = By.id("user-name");
    By passwordFieldBy = By.id("password");
    By loginButtonBy = By.id("login-button");
    By failedLoginTextBy = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3");
    public void writeUsername(String username){
        writeText(usernameFieldBy,username);
    }
    public void writePassword(String password){
        writeText(passwordFieldBy,password);
    }
    public void clickOnLoginButton(){
        click(loginButtonBy);
    }
    public String readFailedText(){
        return readText(failedLoginTextBy);
    }
    public String readTextFromLoginButton(){
        return readAttribute(loginButtonBy,"value");
    }
}
