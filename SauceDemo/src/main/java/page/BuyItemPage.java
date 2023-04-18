package page;

import dataGenerator.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.Random;

public class BuyItemPage extends LoginPage {
    public BuyItemPage(WebDriver driver) {
        super(driver);
    }
    private String selectedItemText;
    By inventoryContainerBy = By.className("inventory_list");
    By inventoryListBy = By.className("inventory_item");
    By clickAddToCartButtonBy = By.cssSelector(".btn.btn_primary.btn_small.btn_inventory");
    By itemNameBy = By.className("inventory_item_name");
    By CartButtonBy = By.className("shopping_cart_link");

    public void selectRandomProduct(){
        var inventoryContainer = driver.findElement(inventoryContainerBy);
        var itemList = inventoryContainer.findElements(inventoryListBy);
        Random random = new Random();
        int randomItemNumber = random.nextInt(itemList.size());
        var selectedItemName = itemList.get(randomItemNumber);
        var itemButton = selectedItemName.findElement(clickAddToCartButtonBy);
        String itemName = selectedItemName.findElement(itemNameBy).getText();
        selectedItemText = itemName;
        itemButton.click();
    }
    public void clickOnCartButton(){
        click(CartButtonBy);
    }
    public String getSelectedItemName(){
        return selectedItemText;
    }
    public void selectRandomProducts(int n){
        var itemList = driver.findElements(inventoryListBy);
        Random random = new Random();
        if(n > itemList.size())
            n = itemList.size();

        for (int i=0; i<n; i++){
            int randomItemNumber = random.nextInt(itemList.size());
            var selectedItem = itemList.get(randomItemNumber);
            String itemName = selectedItem.findElement(itemNameBy).getText();
            var itemButton = selectedItem.findElement(clickAddToCartButtonBy);
            itemButton.click();
            Data.randomSelectedProductsList.add(itemName);
            itemList.remove(randomItemNumber);
        }
    }
}

