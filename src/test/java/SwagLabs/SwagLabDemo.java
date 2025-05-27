package SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SwagLabDemo {

    WebDriver driver;

    @BeforeSuite
    public void Browser(){
        driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();
    }

    @Test
    public void swagLAb(){

        driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();

        //WebElement UsernameInput = driver.findElement(By.cssSelector("input[id='user-name']"));

        WebElement StandardUser = driver.findElement(By.cssSelector("input[id='user-name']"));
        System.out.println(StandardUser.getText());
        String actualHeading = StandardUser.getText();

        System.out.println(actualHeading);

        boolean isHeadingDisplayed = StandardUser.isDisplayed();

        Assert.assertEquals(actualHeading, "standard_user");
        Assert.assertTrue(isHeadingDisplayed);


    }
}
