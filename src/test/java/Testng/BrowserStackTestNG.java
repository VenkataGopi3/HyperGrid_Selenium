package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class BrowserStackTestNG {

    WebDriver driver;
    @BeforeSuite
    public void Browser()
    {
        driver = new ChromeDriver();
    }

    @BeforeTest
    public void Application()
    {
        driver.get("https://bstackdemo.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void Implementation() {

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        WebElement onePlusButton = driver.findElement(By.xpath("(//span[@class='checkmark'])[4]"));
        onePlusButton.click();

        WebElement addCartButton = driver.findElement(By.xpath("(//div[@class='shelf-item__buy-btn'])[2]"));
        addCartButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

        WebElement plusButton = driver.findElement(By.xpath("(//button[@class='change-product-button'])[2]"));
        plusButton.click();
    }
}
