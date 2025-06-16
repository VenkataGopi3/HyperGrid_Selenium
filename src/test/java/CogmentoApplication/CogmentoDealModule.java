package CogmentoApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class CogmentoDealModule extends CogmentoTestNG{


    public CogmentoDealModule(WebDriver driver){
        this.driver = driver;
    }

    public void clickElement(By locator) {
        driver.findElement(locator).click();
    }

    public void typeText(By locator, String value) {
        driver.findElement(locator).sendKeys(value, Keys.ENTER);
    }
    @Test
    public void implementationDealModule(){
        clickElement(By.xpath("//span[text()='Deals']"));
        clickElement(By.xpath("//button[text()='Create']"));
    }



}
