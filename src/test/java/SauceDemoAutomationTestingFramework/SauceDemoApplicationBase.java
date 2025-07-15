package SauceDemoAutomationTestingFramework;

import com.aventstack.chaintest.plugins.ChainTestListener;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;


public class SauceDemoApplicationBase {

    WebDriver driver;

    @Parameters("browserName")
    @BeforeSuite
    public void initializeDrivers(@Optional("chrome") String browserName) {
        launchBrowser(browserName);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    public void launchBrowser(String browserName) {
        switch (browserName) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            case "safari":
                driver = new SafariDriver();
                break;
        }
    }

    @Parameters("appUrl")
    @BeforeTest
    public void launchApplication(@Optional("https://www.saucedemo.com/") String url) {
        driver.get(url);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
    }

    @AfterMethod
    public void captureScreenshot(ITestResult iTestResult, Method method) {
        if (iTestResult.getStatus() == ITestResult.FAILURE){
            getScreenshot(method);

            ChainTestListener.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES),"image/png");
            Allure.addAttachment(method.getName(),new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
        }
    }

    public void getScreenshot(Method method) {
        TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destination = new File("ScreenShot/" + method.getName() + ".png");

        try{
            FileUtils.copyFile(source, destination);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    @AfterSuite
    public void closeBrowser() {
        driver.quit();
    }

}
