package ShadowRoot;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class ShadowRootElement {
    WebDriver driver;

    @Test
    public void getShadowRootElement() {
        driver = new ChromeDriver();
        driver.navigate().to("https://books-pwakit.appspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        SearchContext enterBookName = driver.findElement(By.cssSelector("[apptitle='BOOKS']")).getShadowRoot();
        enterBookName.findElement(By.cssSelector("input[id='input']")).sendKeys("Bablu");

        enterBookName.findElement(By.cssSelector("[class='icon']")).click();


    }

}
