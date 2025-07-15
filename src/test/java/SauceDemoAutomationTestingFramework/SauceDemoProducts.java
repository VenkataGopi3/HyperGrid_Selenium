package SauceDemoAutomationTestingFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauceDemoProducts {
    private WebDriver driver;

    public SauceDemoProducts(WebDriver driver){
        this.driver = driver;
    }

    By productsHeading = By.cssSelector("[class='title']");
    By  productsLabels = By.cssSelector("[class='inventory_item_name ']");

    public String getProductsHeading() {
        return driver.findElement(productsHeading).getText();
    }

    public int getProductsLabel(){
        return driver.findElements(productsLabels).size();
    }
}
