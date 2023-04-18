package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.ArrayList;
import java.util.List;


public class CartPage extends BasePage{
    public CartPage(WebDriver driver) {
        super(driver);
    }
    By itemNameBy = By.className("inventory_item_name");
    By cartItemListBy= By.className("cart_item");
    By checkoutButtonBy = By.id("checkout");
    By removeItemButtonBy = By.cssSelector(".btn.btn_secondary.btn_small.cart_button");
    By firstNameFieldBy = By.id("first-name");
    By lastNameFieldBy = By.id("last-name");
    By zipcodeFieldBy = By.id("postal-code");
    By continueButtonBy = By.id("continue");
    By finishButtonBy = By.id("finish");
    By checkoutCompleteFieldBy = By.className("title");

    public String readItemName(){
        return driver.findElement(itemNameBy).getText();
    }
    public void clickOnCheckoutButton(){
        click(checkoutButtonBy);
    }
    public void clickOnRemoveItemButton() {
        click(removeItemButtonBy);
    }
    public boolean verifyNumberOfItems(){
       var cartItemList = driver.findElements(cartItemListBy);
       return cartItemList.isEmpty();
    }
    public void writeFirstName(String firstName){
        writeText(firstNameFieldBy,firstName);
    }
    public void writeLastName(String lastName){
        writeText(lastNameFieldBy,lastName);
    }
    public void writeZipcode(String zipcode){
        writeText(zipcodeFieldBy,zipcode);
    }
    public void clickOnContinueButton(){
        click(continueButtonBy);
    }
    public void clickOnFinishButton(){
        click(finishButtonBy);
    }
    public String readTextForCheckoutComplete(){
        return readText(checkoutCompleteFieldBy);
    }

    public List<String> getSelectedProducts(){
        var productList = driver.findElements(itemNameBy);
        int numberOfItems = productList.size();
        List<String> getSelectedProductsList = new ArrayList<>();

        for(int i=0; i<numberOfItems; i++){
            getSelectedProductsList.add(productList.get(i).getText());
        }
        return getSelectedProductsList;
    }
}
