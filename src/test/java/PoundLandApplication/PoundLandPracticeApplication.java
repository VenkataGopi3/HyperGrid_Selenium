package PoundLandApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class PoundLandPracticeApplication {

    WebDriver driver;

    public void clickElement(By locator) {
        driver.findElement(locator).click();
    }
    public void typeText(By locator, String data) {
        driver.findElement(locator).sendKeys(data);
    }
    @BeforeSuite
    public void poundLandApplication() {
        driver = new ChromeDriver();
    }
    @BeforeTest
    public void openPoundLandApplication() {
        driver.navigate().to("https://www.poundland.co.uk/?srsltid=AfmBOopFwiMqWF1lqXUhGHRonuLGU3-bBinrYFs6ckd6qO_mYLGX8E4K");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void testingPractice() {

        clickElement(By.cssSelector("[data-cky-tag=\"accept-button\"]"));
        clickElement(By.cssSelector("[class='top-nav__link']"));
        clickElement(By.cssSelector("[title='Sign In']"));
        typeText(By.cssSelector("[id='signInName']"),"bablu19735@gmail.com");
        typeText(By.cssSelector("[id='password']"),"Bablu@3337");
        clickElement(By.cssSelector("[id='next']"));
        clickElement(By.xpath("//a[@data-menu='menu-3191']"));

        List<WebElement> ProductsList = driver.findElements(By.cssSelector("[class='product-item-link']"));
        System.out.println(ProductsList.size());
        for (WebElement product : ProductsList) {
            System.out.println(product.getText());
            int indexToAdd = 0;
            if (indexToAdd >= 5 && indexToAdd < ProductsList.size()) {
                ProductsList.get(indexToAdd).click();

                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Add to Basket']")));

                clickElement(By.xpath("//span[text()='Add to Basket']"));

            }
        }
//        clickElement(By.xpath("//span[text()='Add to favourites']"));
    }
}
