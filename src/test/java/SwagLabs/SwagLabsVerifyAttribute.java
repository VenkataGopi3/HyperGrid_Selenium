package SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class SwagLabsVerifyAttribute {

    WebDriver driver;
    @Test
    public void verifyAttributeOfWebElement() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement userNameInputBox = driver.findElement(By.cssSelector("[placeholder='Username']"));
        userNameInputBox.sendKeys("performance_glitch_user");

        String userNameInputBoxValue = userNameInputBox.getDomProperty("value");
        System.out.println(userNameInputBoxValue);

        WebElement passwordInputBox = driver.findElement(By.cssSelector("[name='password']"));
        passwordInputBox.sendKeys("secret_sauce");

        String passwordInputBoxValue = passwordInputBox.getDomAttribute("value");
        System.out.println(passwordInputBoxValue);



    }
}
