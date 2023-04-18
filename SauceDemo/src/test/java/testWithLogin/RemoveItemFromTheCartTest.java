package testWithLogin;

import method.BuyItemMethod;
import method.VerifyMethod;
import org.testng.Assert;
import org.testng.annotations.Test;


public class RemoveItemFromTheCartTest extends BaseTestWithLogin{

    @Test
    public void removeItemFromTheCart(){
        VerifyMethod verifyMethod = new VerifyMethod(driver);
        BuyItemMethod buyItemMethod = new BuyItemMethod(driver);
        buyItemMethod.buyItem();

        try {
            verifyMethod.verifyItemAtTheCart(buyItemMethod.getSelectedItemText(), buyItemMethod.getCartItemText());
            buyItemMethod.clickOnRemoveItemFromTheCart();
            verifyMethod.verifyNumberOfItemsInTheCart();
        }
        catch (Exception e){
            Assert.fail();
        }
    }
}
