package AutomationTestingFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumActionsForSauceDemo {

    private WebDriver driver;

    public SeleniumActionsForSauceDemo(WebDriver driver){
        this.driver = driver;

    }
    public void clickOnWebElement(WebElement element){
        element.click();
    }

    public void clickOnWebElement(By by){
        driver.findElement(by).click();
    }

    public void typeValue(WebElement element, String data){
        element.sendKeys(data);
    }

    public void typeValue(By by, String data){
        driver.findElement(by).sendKeys(data);
    }

    public void typeAndEnter(By by, String data){
        driver.findElement(by).sendKeys(data,Keys.ENTER);
    }
}
