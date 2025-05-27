package SwagLabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SwagLabsTestNg {

    public WebDriver driver;

    @BeforeSuite
    public void launchBrowser(){
        driver = new ChromeDriver();

    }

    @BeforeTest
    public void launchApplication() {
        driver.navigate().to("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();
    }
}
