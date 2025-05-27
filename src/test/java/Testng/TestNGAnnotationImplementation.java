package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotationImplementation {

    WebDriver driver;

    @BeforeSuite
    public void openBrowser(){
        driver = new ChromeDriver();
        //driver = new EdgeDriver();
    }

    @BeforeTest
    public void openApplication(){

        driver.get("https://www.salesforce.com/in/form/signup/sales-ee/?d=topnav2-btn-ft");
        driver.manage().window().maximize();
        //driver.get("https://login.salesforce.com/");
        //driver.manage().window().maximize();
    }
    @Test
    public void salesForceTrail() throws Exception  {

        WebElement firstNameInputBox = driver.findElement(By.name("UserFirstName"));
        firstNameInputBox.sendKeys("RPA");

        WebElement lastNameInputBox = driver.findElement(By.name("UserLastName"));
        lastNameInputBox.sendKeys("Selenium");

        WebElement jobTitle = driver.findElement(By.name("UserTitle"));
        jobTitle.sendKeys("Director");
        Thread.sleep(5000);

        WebElement next2 = driver.findElement(By.xpath("//a[@class='btn btn-primary salesforce-sans-regular\n" +
                "            btn-lg']"));
        next2.click();

        WebElement employeesDropDown = driver.findElement(By.xpath("//select[@name ='CompanyEmployees'] /option[4]"));
        employeesDropDown.click();

        WebElement companyName = driver.findElement(By.cssSelector("input[name='CompanyName']"));
        companyName.sendKeys("HyperGrid Technologies");

        WebElement countryDropDown = driver.findElement(By.xpath("//select[@name='CompanyCountry']/option[98]"));
        //select[@name='CompanyCountry']/option[98]
        //option[@value='IN']
        countryDropDown.click();

        WebElement nextButton = driver.findElement(By.cssSelector("a[class^='btn btn-primary']"));
        nextButton.click();

        WebElement phoneNumber = driver.findElement(By.name("UserPhone"));
        phoneNumber.sendKeys("7989195677");

        WebElement emailInputBox = driver.findElement(By.cssSelector("input[name='UserEmail']"));
        emailInputBox.sendKeys("venkata19735@gmail.com");

        WebElement checkBox = driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[2]"));
        checkBox.click();

        WebElement submit1 =driver.findElement(By.xpath("//button[@class='submit btn btn-primary salesforce-sans-regular btn-lg']"));
        submit1.click();
    }

    @AfterSuite
    public void killSession() {
        driver.quit();
    }
}
