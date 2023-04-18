package testWithLogin;

import method.BuyItemMethod;
import method.VerifyMethod;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelectRandomProductsTest extends BaseTestWithLogin{

    @Test
    public void selectRandomProduct(){
        BuyItemMethod buyItemMethod = new BuyItemMethod(driver);
        VerifyMethod verifyMethod = new VerifyMethod(driver);
        buyItemMethod.buyRandomProducts(9);

        try {
            verifyMethod.verifySelectedProductsInTheCart();
        }
        catch (Exception e){
            Assert.fail();
        }
    }
}
