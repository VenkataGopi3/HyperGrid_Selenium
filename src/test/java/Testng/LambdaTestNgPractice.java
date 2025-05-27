package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LambdaTestNgPractice {

    WebDriver driver;
    @Test
    public void LambdaTest() {

        driver = new ChromeDriver();
        driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=product/category&path=25");
        driver.manage().window().maximize();

        WebElement clickOnCheckBox = driver.findElement(By.xpath("//label[contains(text(),'Monitors')]/preceding-sibling::input"));
        //clickOnCheckBox.isSelected();
        System.out.println(clickOnCheckBox.isSelected());
        JavascriptExecutor jse = (JavascriptExecutor)driver;

        jse.executeScript("arguments[0].click()", clickOnCheckBox);
        //clickOnCheckBox.click();
        System.out.println(clickOnCheckBox.isSelected());

//        WebElement shopByCategory = driver.findElement(By.cssSelector("a[class='icon-left both text-reset']"));
//        shopByCategory.click();
//
//        WebElement components = driver.findElement(By.xpath("(//span[@class='title'])[1]"));

        WebElement addCart = driver.findElement(By.xpath("//button[@title='Quick view'][1]"));



    }
}
