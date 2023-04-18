package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserLoggedInPage extends BasePage{
    public UserLoggedInPage(WebDriver driver) {
        super(driver);
    }
    By logoutButtonBy = By.id("logout_sidebar_link");
    By menuButtonBy = By.id("react-burger-menu-btn");

    public void clickOnLogoutButton(){
        click(logoutButtonBy);
    }
    public void clickOnMenuButton(){
        click(menuButtonBy);
    }
    public String readLogoutText(){
        return readText(logoutButtonBy);
    }
}
