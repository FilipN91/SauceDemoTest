package testWithLogin;

import method.BuyItemMethod;
import method.VerifyMethod;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SuccessfulBoughtItemTest extends BaseTestWithLogin{


    @Test
    public void successfulBoughtItem() {
        BuyItemMethod buyItemMethod = new BuyItemMethod(driver);
        VerifyMethod verifyMethod = new VerifyMethod(driver);
        buyItemMethod.successfulBoughtItem();

        try {
            verifyMethod.verifyCheckoutComplete("Checkout: Complete!");
        }
        catch (Exception e){
            Assert.fail();
        }
    }

}
