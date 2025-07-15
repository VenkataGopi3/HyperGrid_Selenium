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
    By clickOnCompanyName = By.cssSelector("[name='company']");
    By enterHyperGrid = By.xpath("(//input[@aria-autocomplete=\"list\"])[1]");
    By enterTagName = By.xpath("(//input[@aria-autocomplete=\"list\"])[2]");
    By enterEmail = By.cssSelector("[placeholder='Email address']");
    By clickOnCategory = By.xpath("(//i[@class='dropdown icon'])[2]");
    By clickOnAffiliate = By.xpath("//span[text()='Affiliate']");
    By clickOnSocialChannel = By.cssSelector("[name='channel_type']");
    By clickOnInstagram = By.xpath("//span[text()='Instagram']");
    By clickOnInstagramInputBox = By.cssSelector("[placeholder='Instagram user']");
    By enterAddress = By.cssSelector("[placeholder='Street Address']");
    By enterCity = By.cssSelector("[placeholder='City']");
    By clickOnCountryDropDown = By.cssSelector("[name='country']");
    By clickOnSave = By.cssSelector("[class='ui linkedin button']");


    public void implementationContacts(){
//        driver.findElement(By.cssSelector("[class='users icon']")).click();
        cogmentoSeleniumActions.clickOnElement(clickOnContacts);
        cogmentoSeleniumActions.clickOnElement(clickOnCreate);
        cogmentoSeleniumActions.typeText(enterFirstName,"HyperGrid");
        cogmentoSeleniumActions.typeText(enterLastName,"Technology");
        cogmentoSeleniumActions.clickOnElement(clickOnCompanyName);
        cogmentoSeleniumActions.typeText(enterHyperGrid,"HyperGrid Technology pvt Ltd.");
        cogmentoSeleniumActions.typeText(enterTagName,"#HyperGrid");
        cogmentoSeleniumActions.typeText(enterEmail,"bablu19735@gmail.com");
        cogmentoSeleniumActions.clickOnElement(clickOnCategory);
        cogmentoSeleniumActions.clickOnElement(clickOnAffiliate);
        cogmentoSeleniumActions.clickOnElement(clickOnSocialChannel);
        cogmentoSeleniumActions.clickOnElement(clickOnInstagram);
        cogmentoSeleniumActions.typeText(clickOnInstagramInputBox,"#chanduyadav_tallapally");
        cogmentoSeleniumActions.typeText(enterAddress,"Housing Board Colony,Chevella,RangaReddy,TS");
        cogmentoSeleniumActions.typeText(enterCity,"Hyderabad");
        cogmentoSeleniumActions.clickOnElement(clickOnCountryDropDown);
        cogmentoSeleniumActions.clickOnElement(clickOnSave);



    }
}
