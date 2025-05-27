package HerokuApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AuthAlertHandling extends AlertsHandling{
    WebDriver driver;

    @Test
    public void getAuthAlerts(){
        driver = new ChromeDriver();
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
//        driver.navigate().to("https://the-internet.herokuapp.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//        WebElement clickOnBasicAuth = driver.findElement(By.cssSelector("[href='/basic_auth']"));
//        clickOnBasicAuth.click();

        boolean b = driver.findElement(By.tagName("p")).getText().contains("Congratulations! You must have the proper credentials");
        System.out.println(b);
        Assert.assertTrue(b);
    }
}
