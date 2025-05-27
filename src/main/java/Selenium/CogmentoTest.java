package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CogmentoTest {

    public static void main(String[] args) {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://cogmento.com/en");
        driver.manage().window().maximize();
        WebElement emailInputBox = driver.findElement(By.cssSelector("[placeholder='Your email']"));
        emailInputBox.sendKeys("vits.19735a0333@gmail.com");

        WebElement getFreeClaim = driver.findElement(By.xpath("(//button[@type=\"button\"])[2]"));
        getFreeClaim.click();

//        WebElement clickOnCheckBox = driver.findElement(By.cssSelector("label[aria-label='checkbox-label']"));
//        clickOnCheckBox.click();

        //WebElement clickOnRobotButton = driver.findElement(By.cssSelector("[class='recaptcha-checkbox-border']"));
        WebElement click = driver.findElement(By.id("#recaptcha-anchor-label"));
        //clickOnRobotButton.click();
        click.click();
    }
}
