package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowUtube {
    public static void main(String[] args) throws Exception{
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.salesforce.com/in/");
        driver.manage().window().maximize();
        SearchContext sr1 = driver.findElement(By.cssSelector("[style*='--nav-integration-c-header-h']")).getShadowRoot();
        Thread.sleep(3000);
//        SearchContext sr2 = driver.findElement(By.cssSelector("hgf-button[class='l1-button']")).getShadowRoot();
//        Thread.sleep(3000);
        sr1.findElement(By.cssSelector("div[class='utility-ctas cta-main']")).click();


    }
}
