package MakeMyTripApplication.TestNG.SeleniumFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;

import java.time.Duration;

public class TicketBookingBase {

    WebDriver driver;


    @BeforeSuite
    public void openBrowser(@Optional("chrome") String browserName){
        launchBrowser(browserName);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public void launchBrowser(String browserName){
        switch (browserName) {
            case "chrome" :
                driver = new ChromeDriver();
                break;
            case "edge" :
                driver = new EdgeDriver();
                break;
            case "firefox" :
                driver = new FirefoxDriver();
                break;
            case "safari" :
                driver = new SafariDriver();
                break;
            default:
                System.out.println("Select correct Browser ");
        }
    }

    @BeforeTest
    public void launchApplication(@Optional("https://www.makemytrip.com/flights/") String url){
        driver.navigate().to(url);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
    }

}
