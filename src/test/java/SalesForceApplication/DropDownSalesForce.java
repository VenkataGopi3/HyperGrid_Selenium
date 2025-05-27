package SalesForceApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class DropDownSalesForce {
    WebDriver driver;

    @Test
    public void handleDropDown() {
        driver = new ChromeDriver();
        driver.get("https://www.salesforce.com/in/form/signup/sales-ee/?d=topnav2-btn-ft");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        WebElement firstNameInputBox = driver.findElement(By.name("UserFirstName"));
        firstNameInputBox.sendKeys("RPA");

        WebElement lastNameInputBox = driver.findElement(By.name("UserLastName"));
        lastNameInputBox.sendKeys("Selenium");

        WebElement jobTitle = driver.findElement(By.name("UserTitle"));
        jobTitle.sendKeys("Director");
       // Thread.sleep(5000);

        //WebElement next = driver.findElement(By.className("btn-container"));

        //WebElement next1 = driver.findElement(By.cssSelector(""))
        WebElement next1 = driver.findElement(By.cssSelector("a[class^='btn btn-primary']"));
        next1.click();

        WebElement employeesDropDown = driver.findElement(By.cssSelector("select[id^='CompanyEmployees']"));
        Select employeesSelect = new Select(employeesDropDown);
        employeesSelect.selectByVisibleText("1 - 20 employees");
        //employeesSelect.selectByValue("500");
        //employeesSelect.selectByContainsVisibleText("10,001");
        //employeesSelect.selectByIndex(1);

        String selectedOptionText = employeesSelect.getFirstSelectedOption().getText();
        System.out.println(selectedOptionText);

        Assert.assertEquals(selectedOptionText, "1 - 20 employees");

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
        //input[@name='UserPhone']----> cssSelector

        WebElement emailInputBox = driver.findElement(By.cssSelector("input[name='UserEmail']"));
        emailInputBox.sendKeys("venkata19735@gmail.com");

        WebElement checkBox = driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[2]"));
        checkBox.click();

        WebElement submit = driver.findElement(By.cssSelector("button[type='submit']"));
        submit.click();

        driver.quit();
    }

}
