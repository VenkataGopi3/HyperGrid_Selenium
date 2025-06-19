package CogmentoApplication.Framework;

import org.apache.poi.ss.formula.atp.Switch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class CogmentoBase {
    WebDriver driver;

    @Parameters("browserName")
    @BeforeSuite
    public void OpenBrowser(@Optional("chrome") String browserName){
        launchBrowser(browserName);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    public void launchBrowser(String browserName){
        switch(browserName){
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            case "fireFox" :
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("Provide Existing Browser Name ");
        }
    }

    @BeforeTest
    public void launchApplication(@Optional("https://ui.cogmento.com/")String url){
        driver.navigate().to(url);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));

    }

//    @AfterSuite
//    public void closeBrowser(){
//        driver.quit();
//    }
}
