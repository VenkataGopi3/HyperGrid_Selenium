package HerokuApplication;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class GetScreenShotOnheroku {


    WebDriver driver;
    @BeforeSuite
    public void Browser(){
        driver = new ChromeDriver();
    }

    @BeforeTest
    public void Application(){
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @Test
    public void getScreenShot() throws IOException {
//        driver = new ChromeDriver();
//        driver.get("https://the-internet.herokuapp.com/");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        WebElement footerImage = driver.findElement(By.cssSelector(".heading"));
//        WebElement footerImage1 = driver.findElement(By.cssSelector("#content"));
        WebElement footerImage2 = driver.findElement(By.cssSelector("[class='large-4 large-centered columns']"));
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File sourceFile = footerImage2.getScreenshotAs(OutputType.FILE);
//        File destinationFile = new File(System.getProperty("user.dir")+"/ScreenShot/page1.png");
//        File destinationFile1 = new File(System.getProperty("user.dir")+"/ScreenShot/page.png");
//        File destinationFile2 = new File(System.getProperty("user.dir")+"/ScreenShot/page2.png");
        File destinationFile3 = new File(System.getProperty("user.dir")+ "/ScreenShot/Footer1.png");
        FileHandler.copy(sourceFile,destinationFile3);

        WebElement clickOnDragAndDrop = driver.findElement(By.xpath("//a[text()='Drag and Drop']"));
        clickOnDragAndDrop.click();

        WebElement aBox = driver.findElement(By.id("column-a"));
        WebElement bBox = driver.findElement(By.id("column-b"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(aBox, bBox).perform();


    }
}