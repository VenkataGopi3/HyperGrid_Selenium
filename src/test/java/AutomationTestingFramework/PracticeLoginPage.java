package AutomationTestingFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeLoginPage {

    private final WebDriver driver;
    private SeleniumActionsForSauceDemo seleniumActionsForSauceDemo;

    public PracticeLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        seleniumActionsForSauceDemo = new SeleniumActionsForSauceDemo(driver);

    }

//    By usernameInputBox  = By.id("user-name");
//    By passwordInputBox = By.id("password");
//    By loginButton = By.id("login-button");
//    By errorMessage = By.cssSelector("h3[data-test='error']");

    private final By usernameInputBox = By.id("user-name");
    private final By passwordInputBox = By.id("password");
    private final By loginButton = By.id("login-button");
    private final By errorMessage = By.cssSelector("h3[data-test='error']");

    @FindBy(id = "user-name")
    private WebElement usernameText;
    @FindBy(css = "#password")
    private WebElement passwordText;
    @FindBy(id = "login-button")
    private WebElement clickOnLogin;

    public void loginAsUser(String username, String password) {
        seleniumActionsForSauceDemo.typeValue(usernameText, username);
        seleniumActionsForSauceDemo.typeValue(passwordText, password);
        seleniumActionsForSauceDemo.clickOnWebElement(clickOnLogin);
    }

    public void sauceLabDemoLogin(String username, String password) {
        driver.findElement(usernameInputBox).clear();
        /*driver.findElement(usernameInputBox).sendKeys(username);
        driver.findElement(passwordInputBox).sendKeys(password);
        driver.findElement(loginButton).click();*/

        seleniumActionsForSauceDemo.typeValue(usernameInputBox, username);
        seleniumActionsForSauceDemo.typeValue(passwordInputBox, password);
        seleniumActionsForSauceDemo.clickOnWebElement(loginButton);

    }
}

