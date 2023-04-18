package method;

import dataGenerator.DataGenerator;
import org.openqa.selenium.WebDriver;
import page.BasePage;
import page.BuyItemPage;
import page.CartPage;

public class BuyItemMethod extends BasePage {
    public BuyItemMethod(WebDriver driver) {
        super(driver);
    }

    BuyItemPage buyItemPage = new BuyItemPage(driver);
    CartPage cartPage = new CartPage(driver);

    public void buyItem(){
        buyItemPage.selectRandomProduct();
        buyItemPage.clickOnCartButton();
    }

    public String getSelectedItemText(){
        return buyItemPage.getSelectedItemName();
    }

    public String getCartItemText(){
        return cartPage.readItemName();
    }

    public void clickOnRemoveItemFromTheCart(){cartPage.clickOnRemoveItemButton();
    }

    public void successfulBoughtItem(){
        buyItem();
        cartPage.clickOnCheckoutButton();
        cartPage.writeFirstName(DataGenerator.firstName());
        cartPage.writeLastName(DataGenerator.lastName());
        cartPage.writeZipcode(DataGenerator.zipcode());
        cartPage.clickOnContinueButton();
        cartPage.clickOnFinishButton();
    }

    public void buyRandomProducts(int n){
        buyItemPage.selectRandomProducts(n);
        buyItemPage.clickOnCartButton();
    }
}

