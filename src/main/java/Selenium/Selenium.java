package Selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        //driver.get("https://testautomationpractice.blogspot.com/");
        driver.get("https://the-internet.herokuapp.com/");

        driver.manage().window().maximize();

    }
}
