package method;

import dataGenerator.Data;
import org.openqa.selenium.WebDriver;
import page.*;

public class VerifyMethod extends BasePage {
    public VerifyMethod(WebDriver driver) {
        super(driver);
    }
    LoginPage loginPage = new LoginPage(driver);
    UserLoggedInPage userLoggedInPage = new UserLoggedInPage(driver);
    CartPage cartPage = new CartPage(driver);

    public void verifyFailedLogin(String text){
        assertStringEquals(loginPage.readFailedText(), text);
    }
    public void verifySuccessfulLogin(String text){
        userLoggedInPage.clickOnMenuButton();
        assertStringEquals(userLoggedInPage.readLogoutText(),text);
    }
    public void verifyItemAtTheCart(String selectedItemText, String cartItemText){
        assertStringEquals(selectedItemText, cartItemText);
    }
    public void verifyUserIsLoggedOut(String text){
        assertStringEquals(text,loginPage.readTextFromLoginButton());
    }
    public void verifyNumberOfItemsInTheCart(){
        assertStringEquals(Boolean.toString(cartPage.verifyNumberOfItems()),"true");
    }
    public void verifyCheckoutComplete(String text){
        assertStringEquals(cartPage.readTextForCheckoutComplete(),text);
    }
    public void verifySelectedProductsInTheCart(){

        var selectedProductsList = cartPage.getSelectedProducts();
        boolean result = true;
        for(int i=0; i<= Data.randomSelectedProductsList.size()-1; i++){
           if(!selectedProductsList.contains(Data.randomSelectedProductsList.get(i))){
               result=false;
               break;
           }
        }assertStringEquals(Boolean.toString(result),"true");
    }
}
