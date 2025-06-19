package CogmentoApplication.Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CogmentoContacts {

     WebDriver driver ;
    private CogmentoSeleniumActions cogmentoSeleniumActions;

    public CogmentoContacts(WebDriver driver){
        this.driver = driver;
        cogmentoSeleniumActions = new CogmentoSeleniumActions(driver);
    }
    By clickOnContacts = By.xpath("//span[text()='Contacts']");
    By clickOnCreate = By.xpath("(//button[@class='ui linkedin button'])[3]");
    By enterFirstName = By.cssSelector("[name='first_name']");
    By enterLastName = By.cssSelector("[name='last_name']");

    public void implementationContacts(){
//        driver.findElement(By.cssSelector("[class='users icon']")).click();
        cogmentoSeleniumActions.clickOnElement(clickOnContacts);
        cogmentoSeleniumActions.clickOnElement(clickOnCreate);
        cogmentoSeleniumActions.typeText(enterFirstName,"HyperGrid");
        cogmentoSeleniumActions.typeText(enterLastName,"Technology");

    }
}
