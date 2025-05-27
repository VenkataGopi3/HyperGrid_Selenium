package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgLambdaTest {

    WebDriver driver;

    @BeforeSuite
    public void BrowserLambda() {
        driver = new ChromeDriver();
    }

    @BeforeTest
    public void ApplicationLambda(){

        driver.get("https://ecommerce-playground.lambdatest.io/");
        driver.manage().window().maximize();
    }

    @Test
    public void LambdaTest() {
        WebElement AllCategory = driver.findElement(By.cssSelector("button[class='btn dropdown-toggle']"));
        AllCategory.click();

        WebElement Category = driver.findElement(By.cssSelector("a[data-category_id='18']"));
        Category.click();
    }
}
