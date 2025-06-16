package CogmentoApplication.Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class CogmentoContacts {

     WebDriver driver ;
    private CogmentoSeleniumActions cogmentoSeleniumActions;

    public CogmentoContacts(WebDriver driver){
        this.driver = driver;
        cogmentoSeleniumActions = new CogmentoSeleniumActions(driver);
    }
    By clickOnContacts = By.xpath("//span[text()='Companies']");
    By clickOnCreate = By.xpath("(//button[@class='ui linkedin button'])[2]");

    public void implementationContacts(){
//        driver.findElement(By.cssSelector("[class='users icon']")).click();
        cogmentoSeleniumActions.clickOnElement(clickOnContacts);
        cogmentoSeleniumActions.clickOnElement(clickOnCreate);



    }
}
