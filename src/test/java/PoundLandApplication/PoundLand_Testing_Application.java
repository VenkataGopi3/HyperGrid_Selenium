package PoundLandApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class PoundLand_Testing_Application {

    WebDriver driver;

    public void clickElement(By locator){
        driver.findElement(locator).click();
    }
    public void typeText(By locator, String data){
        driver.findElement(locator).sendKeys(data);
    }

    @BeforeSuite
    public void poundLandApplication(){
        driver = new ChromeDriver();
    }

    @BeforeTest
    public void openPoundLandApplication(){
        driver.navigate().to("https://www.poundland.co.uk/?srsltid=AfmBOopFwiMqWF1lqXUhGHRonuLGU3-bBinrYFs6ckd6qO_mYLGX8E4K");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test
    public void implementationOfPoundLandApplication(){
        clickElement(By.cssSelector("[data-cky-tag=\"accept-button\"]"));
        clickElement(By.cssSelector("[class='top-nav__link']"));
        clickElement(By.cssSelector("[title='Sign In']"));
        typeText(By.cssSelector("[id='signInName']"),"bablu19735@gmail.com");
//        clickElement(By.cssSelector("[id='signInName']"));
        typeText(By.cssSelector("[id='password']"),"Bablu@3337");
//        clickElement(By.cssSelector("[id='password']"));
        clickElement(By.cssSelector("[id='next']"));
        clickElement(By.xpath("//a[@data-menu='menu-3191']"));

        List<WebElement> productNames = driver.findElements(By.cssSelector("[class='rrp item product product-item']"));
        int productIndex = 333;

        for (int i=0; i<productNames.size(); i++){
            WebElement items = productNames.get(i);
            productIndex = i;
            System.out.println(items);
            String productNamesOFFather = items.findElement(By.cssSelector("[class='product-item-link']")).getText();
            System.out.println(productNamesOFFather);
            if (productNamesOFFather.equals("Father's Day Badge Hanging Plaque - Best Dad Ever")){
                clickElement(By.xpath("//a[text()=\"Father's Day Badge Hanging Plaque - Best Dad Ever\"]"));
                System.out.println(productIndex);
                break;
            }
//            if (productIndex == 18){
//                System.out.println(productIndex);
//                break;
//            }
//            System.out.println(productIndex);
        }
        clickElement(By.cssSelector("[title='Add to Basket']"));

    }
}
