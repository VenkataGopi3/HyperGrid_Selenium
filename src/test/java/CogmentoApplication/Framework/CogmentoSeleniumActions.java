package CogmentoApplication.Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CogmentoSeleniumActions {
    private WebDriver driver;

    public CogmentoSeleniumActions(WebDriver driver){
        this.driver=driver;
    }

    public void clickElement(WebElement element){
        element.click();
    }
    public void typeText(WebElement element, String data){
        element.sendKeys(data, Keys.ENTER);
    }
    public void clickOnElement(By by){
        driver.findElement(by).click();
    }
    public void writeText(By by, String data){
        driver.findElement(by).sendKeys(data);
    }
    public void typeText(By locator, String value) {
        driver.findElement(locator).sendKeys(value, Keys.ENTER);
    }
}
