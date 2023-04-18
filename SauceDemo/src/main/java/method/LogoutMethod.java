package method;

import org.openqa.selenium.WebDriver;
import page.BasePage;
import page.UserLoggedInPage;

public class LogoutMethod extends BasePage {
    public LogoutMethod(WebDriver driver) {
        super(driver);
    }
    public void logout(){
        UserLoggedInPage userLoggedInPage = new UserLoggedInPage(driver);
        userLoggedInPage.clickOnMenuButton();
        userLoggedInPage.clickOnLogoutButton();
    }
}
