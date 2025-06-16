package CogmentoApplication.Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CogmentoLoginPage extends CogmentoBase {
    private final WebDriver driver;
    private CogmentoSeleniumActions cogmentoSeleniumActions;

    public CogmentoLoginPage(WebDriver driver) {

        PageFactory.initElements(driver , this);
        this.driver = driver;
        cogmentoSeleniumActions = new CogmentoSeleniumActions(driver);
    }

     private final By emailInputBox = By.cssSelector("[name='email']");
//     private final By passwordInputBox = By.cssSelector("[name='password']");
//     private final By loginButton = By.xpath("//div[text()='Login']");

    @FindBy(css = "[name='email']")
    private WebElement emailField ;
    @FindBy(css = "[name='password']")
    private WebElement passwordField;
    @FindBy(xpath = "//div[text()='Login']")
    private WebElement loginField;

    public void loginAsUser(String email, String password){
        driver.findElement(emailInputBox).clear();
//        driver.findElement(emailInputBox).sendKeys(email);
//        driver.findElement(passwordInputBox).sendKeys(password);
//        driver.findElement(loginButton).click();

        cogmentoSeleniumActions.typeText(emailField, email);
        cogmentoSeleniumActions.typeText(passwordField, password);
        cogmentoSeleniumActions.clickElement(loginField);
    }

}
