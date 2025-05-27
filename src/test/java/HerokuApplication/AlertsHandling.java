package HerokuApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertsHandling {

    WebDriver driver;

    @Test
    public void GetAlert() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement clickOnAlert = driver.findElement(By.cssSelector("[href='/javascript_alerts']"));
        clickOnAlert.click();

        WebElement jsConfirmButton = driver.findElement(By.cssSelector("[onclick^='jsConfirm']"));
        jsConfirmButton.click();
        String text = driver.switchTo().alert().getText();
        System.out.println(text);
        Thread.sleep(2000);
//        driver.switchTo().alert().accept();

        Thread.sleep(3000);
        driver.switchTo().alert().dismiss();
    }
}
