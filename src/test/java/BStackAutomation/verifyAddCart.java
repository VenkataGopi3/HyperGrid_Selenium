package BStackAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
public class verifyAddCart {

        WebDriver driver;
        WebDriverWait wait;
        @BeforeClass
        public void setup(){
            driver = new ChromeDriver();
            driver.get("https://bstackdemo.com/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        }
    @Test(priority = 1)
    public void loginStackdemo(){
//        new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("//span[@class='Navbar_link__3Blki logout-link mt-2']")));
        WebElement signInLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='Navbar_link__3Blki logout-link mt-2']")));
        signInLink.click();
//        WebElement signButton = driver.findElement(By.cssSelector("//span[@class='Navbar_link__3Blki logout-link mt-2']"));
//        signButton.click();
        WebElement userName = driver.findElement(By.xpath("//div[@id='username']//div[@class=' css-tlfecz-indicatorContainer']"));
        userName.click();
        WebElement userOptions = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='username']//div[text()='demouser']")));
        userOptions.click();
        WebElement passWord = driver.findElement(By.xpath("//div[@id='password']//div[@class=' css-tlfecz-indicatorContainer']"));
        passWord.click();
        WebElement passWordOptions = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='password']//div[text()='testingisfun99']")));
        passWordOptions.click();
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Log In']")));
        loginButton.click();
    }
    @Test(priority = 2, dependsOnMethods = {"loginStackdemo"})
    public void vendorFilter(){
        String device = "iPhone 12 Pro Max";
        WebElement filterElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='filters']//span[text()='Apple']")));
        filterElement.click();
        WebElement addToCart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='iPhone 12 Pro Max']/following-sibling::div[@class='shelf-item__buy-btn']")));
        addToCart.click();
        WebElement cartItem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='shelf-item__details']/p")));
        String selectedItem =  cartItem.getText();
        WebElement checkOut = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='buy-btn']")));
        if (device.equals(selectedItem)){
            checkOut.click();
        }else {
            System.out.println("expected" + device+ " found " + selectedItem );
        }
    }
    @AfterClass
    public void closeSession(){
        driver.close();
        driver.quit();
    }
}

