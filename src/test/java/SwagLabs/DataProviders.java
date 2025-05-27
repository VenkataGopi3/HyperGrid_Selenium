package SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
    WebDriver driver;
    @DataProvider(name="swaglabs")
    public Object[][] saucedemo(){
        return new Object[][]{
                {"standard_user","secret_sauce"},{"locked_out_user","secret_sauce"},{"problem_user","secret_sauce"}
        };
    }
    @Test(dataProvider="swaglabs")
    public void testrun(String username,String password){

        driver=new ChromeDriver();
        driver.navigate().to("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();
        WebElement userNameInputBox = driver.findElement(By.cssSelector("[name='user-name']"));
        userNameInputBox.sendKeys(username);
        WebElement passwordInputBox = driver.findElement(By.cssSelector("[name='password']"));
        passwordInputBox.sendKeys(password);
        WebElement clickOnLoginButton =driver.findElement(By.cssSelector("[id='login-button']"));
        clickOnLoginButton.click();

    }

    @Test(dataProvider="swaglabs")
    public void testrun1(String username1,String password1) {

        driver=new EdgeDriver();
        driver.navigate().to("https://www.saucedemo.com/v1/");//https://www.saucedemo.com/v1/
        driver.manage().window().maximize();
        WebElement userNameInputBox = driver.findElement(By.cssSelector("[name='user-name']"));
        userNameInputBox.sendKeys(username1);
        WebElement passwordInputBox = driver.findElement(By.cssSelector("[name='password']"));
        passwordInputBox.sendKeys(password1);
        WebElement clickOnLoginButton =driver.findElement(By.cssSelector("[id='login-button']"));
        clickOnLoginButton.click();
    }
}

