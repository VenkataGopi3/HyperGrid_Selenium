package SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SwagLabsForLoop extends SwagLabsTestNg {

    @Test
    public void MaxCostOfProduct() {
        WebElement userNameInputBox = driver.findElement(By.cssSelector("[name='user-name']"));
        userNameInputBox.sendKeys("standard_user");
        WebElement passwordInputBox = driver.findElement(By.cssSelector("[name='password']"));
        passwordInputBox.sendKeys("secret_sauce");
        WebElement clickOnLoginButton =driver.findElement(By.cssSelector("[id='login-button']"));
        clickOnLoginButton.click();
        Set<String> productNames = new HashSet<>();
        List<Double> productPrice = new ArrayList<>();

        List<WebElement> prices = driver.findElements(By.className("inventory_item"));

        double maxPrice = 0.0;
        int maxIndex = 100;

        for (int i=0; i<prices.size(); i++){
            WebElement items = prices.get(i);
//            System.out.println(items);
            String itemNames = items.findElement(By.className("inventory_item_name")).getText();
            System.out.println(itemNames);
            String productPrices = items.findElement(By.className("inventory_item_price")).getText();
//            System.out.println(productPrices);
//            System.out.println("****************************************");
            String pricesOfProducts = items.findElement(By.className("inventory_item_price")).getText().replace("$","");
            double productPricesInCart = Double.parseDouble(pricesOfProducts);
            System.out.println("$"+productPricesInCart);

            productNames.add(itemNames);
            productPrice.add(productPricesInCart);

            if (productPricesInCart>maxPrice){
                maxPrice = productPricesInCart;
                maxIndex = i;
//                System.out.println(maxIndex);
            }
        }
        System.out.println("****************************************");

        System.out.println("Maximum price of the product is  $"+ maxPrice);
        System.out.println("Index Value for Maximum Price is " +maxIndex);

        WebElement MaxItemAddToCart = prices.get(maxIndex);
        MaxItemAddToCart.findElement(By.tagName("button")).click();

        System.out.println("Item Added To Cart : $" + productPrice.get(maxIndex));
    }
}
