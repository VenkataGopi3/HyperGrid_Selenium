package AutomationTestingFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoLoginPage {

    private final WebDriver driver;
    private SeleniumActionsForSauceDemo seleniumActionsForSauceDemo;


    public SauceDemoLoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
        seleniumActionsForSauceDemo = new SeleniumActionsForSauceDemo(driver);

    }


    private final By usernameInputBox  = By.id("user-name");
    private final By passwordInputBox = By.id("password");
    private final By loginButton = By.id("login-button");
    private final By errorMessage = By.cssSelector("h3[data-test='error']");

    @FindBy(id="user-name")
    private WebElement usernameText;
    @FindBy(css= "#password")
    private WebElement passwordText;
    @FindBy(id="login-button")
    private WebElement clickOnLogin;

    public void sauceLabDemoLogin(String username, String password){
        driver.findElement(usernameInputBox).clear();

        seleniumActionsForSauceDemo.typeValue(usernameInputBox, username);
        seleniumActionsForSauceDemo.typeValue(passwordInputBox,password);
        seleniumActionsForSauceDemo.clickOnWebElement(loginButton);

    }
}
