package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        //driver.get("https://testautomationpractice.blogspot.com/");

        driver.get("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        //driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[3]/div[3]/button")).click();
        //driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]")).click();

        //driver.findElement(By.cssSelector("#item_1_title_link > div")).click();
        //driver.findElement(By.id("item_1_title_link")).click();
        //driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();
        driver.findElement(By.className("inventory_item_name")).click();
        driver.findElement(By.className("")).click();


    }
}

