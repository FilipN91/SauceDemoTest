package dataGenerator;

import org.testng.annotations.DataProvider;
import utilities.PropertyManager;

public class DataProviderData {

    @DataProvider(name="failedLogin")
    public Object[][] getDataFromDataProvider() {
        return new Object[][]
                {
                        {"",PropertyManager.getInstance().getGoodPassword(), "Epic sadface: Username is required"},
                        {PropertyManager.getInstance().getGoodUsername(),"", "Epic sadface: Password is required"},
                        {DataGenerator.username(),DataGenerator.password(),"Epic sadface: Username and password do not match any user in this service"}
                };
    }
}
