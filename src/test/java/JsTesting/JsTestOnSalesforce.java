package JsTesting;

import SwagLabs.SwagLabsTestNg;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;

public class JsTestOnSalesforce extends SwagLabsTestNg {

    @Test
    public void salesForceJSE(){

        driver.get("https://www.salesforce.com/in/form/signup/sales-ee/?d=topnav2-btn-ft");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        WebElement userNameInputBox = driver.findElement(By.cssSelector("[name='UserFirstName']"));
        String typeUserName = "arguments[0].value='VGopi'";
        jse.executeScript(typeUserName,userNameInputBox);
        System.out.println(typeUserName);

        WebElement lastNameInputBox = driver.findElement(By.cssSelector("[name='UserLastName']"));
        String typeLastName = "arguments[0].value='Bhimavarapu'";
        jse.executeScript(typeLastName,lastNameInputBox);
        System.out.println(typeLastName);

        WebElement jobTitle = driver.findElement(By.cssSelector("[name='UserTitle']"));
        String typeJobTitle = "arguments[0].value='HyperGrid'";
        jse.executeScript(typeJobTitle,jobTitle);
        System.out.println(typeJobTitle);

        WebElement nextButton = driver.findElement(By.xpath("//span[text()='Next']"));
//        WebElement nextButton1 = driver.findElement(By.xpath("//div[@class='btn-container'][1]"));
//        WebElement nextButton2 = driver.findElement(By.xpath("//div[@class='btn-container'][2]"));
//        WebElement nextButton3 = driver.findElement(By.cssSelector("a[class^='btn btn-light salesforce-sans-regular']"));
        String clickNextButton = "arguments[0].click()";
        jse.executeScript("arguments[0].setAttribute('style','background-color:#FF0000')", nextButton);
//        jse.executeScript("arguments[0].setAttribute('style','background-color:#bbff00)", nextButton);
        jse.executeScript(clickNextButton, nextButton);


    }
}
