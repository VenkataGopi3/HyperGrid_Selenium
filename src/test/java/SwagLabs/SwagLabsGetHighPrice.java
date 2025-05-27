package SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class SwagLabsGetHighPrice extends SwagLabsTestNg {

    @Test
    public void GetHighestPrice() {
        WebElement userNameInputBox = driver.findElement(By.cssSelector("[name='user-name']"));
        userNameInputBox.sendKeys("standard_user");
        WebElement passwordInputBox = driver.findElement(By.cssSelector("[name='password']"));
        passwordInputBox.sendKeys("secret_sauce");
        WebElement clickOnLoginButton =driver.findElement(By.cssSelector("[id='login-button']"));
        clickOnLoginButton.click();

//        driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[4]")).click();
//        driver.findElement(By.cssSelector("[fill=\"currentColor\"]")).click();

//        List<WebElement> highPrice = driver.findElements(By.xpath("//div[@class='pricebar']"));
        List<WebElement> prices = driver.findElements(By.className("inventory_item_price"));

        double maxPrice = 0.0;
        for (WebElement priceElement : prices) {
//            String priceText = priceElement.getText().replace("$", "");
            String priceTextDouble = priceElement.getText().replace("$","");

            double price = Double.parseDouble(priceTextDouble);
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        System.out.println("Highest product price is: $" + maxPrice);



        WebElement clickOnAddCartButton =driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[4]"));
        clickOnAddCartButton.click();
        WebElement clickOnAddCartIcon =driver.findElement(By.cssSelector("[fill='currentColor']"));
        clickOnAddCartIcon.click();
        WebElement clickOncheckOutButton = driver.findElement(By.xpath("//a[text()='CHECKOUT']"));
        clickOncheckOutButton.click();
    }
}
//    @AfterClass
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }





