package AutomationTestingFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauceDemoLoginPage {
    private WebDriver driver;

    public SauceDemoLoginPage(WebDriver driver){
        this.driver = driver;
    }

    By usernameInputBox  = By.id("user-name");
    By passwordInputBox = By.id("password");
    By loginButton = By.id("login-button");
    By errorMessage = By.cssSelector("h3[data-test='error']");

    public void sauceLabDemoLogin(String username, String password){
        driver.findElement(usernameInputBox).clear();
        driver.findElement(usernameInputBox).sendKeys(username);
        driver.findElement(passwordInputBox).sendKeys(password);
        driver.findElement(loginButton).click();

    }
}
