package BStackAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class verifyLogin {
    WebDriver driver;

    @BeforeSuite
    public void openBrowser(){

        driver = new ChromeDriver();
    }

    @BeforeTest
    public void launchApplication(){
        driver.navigate().to("https://bstackdemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void verifyUserNameAndPassowrd(){
        driver.findElement(By.cssSelector("[id='signin']")).click();
        driver.findElement(By.xpath("//div[text()='Select Username']")).click();
        driver.findElement(By.xpath("//div[text()='demouser']")).click();
        driver.findElement(By.xpath("//div[text()='Select Password']")).click();
        driver.findElement(By.xpath("//div[text()='testingisfun99']")).click();
        driver.findElement(By.cssSelector("[id='login-btn']")).click();

    }

    @Test
    public void verifyOnePlusButtonClicking(){
        driver.findElement(By.xpath("//span[text()='Apple']")).click();
        List<WebElement> numberOfItems = driver.findElements(By.cssSelector("[class='shelf-item__buy-btn']"));
        System.out.println(numberOfItems);
        String itemName = "iPhone 12 Pro Max";

        for (WebElement items : numberOfItems){
            String itemNames = items.getText();
            if(itemName.equals(itemNames)){
                driver.findElement(By.xpath("//div[text()='Add to cart']")).click();
            }
        }
    }
}
