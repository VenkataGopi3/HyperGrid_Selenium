package AutomationCucumberFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ApplicationSetUp {

    public static WebDriver driver;
    public static void initializeDrivers(){
        driver = new ChromeDriver();

    }
    public static void launchBrowser(){
        driver.navigate().to("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static void killSession()
    {
        driver.close();
        driver.quit();
    }
}
