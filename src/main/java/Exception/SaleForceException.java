package Exception;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SaleForceException {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.salesforce.com/in/form/signup/sales-ee/?d=topnav2-btn-ft");
        driver.manage().window().maximize();
        try{
            WebElement FirstName = driver.findElement(By.name("UserFirstNae"));
            FirstName.sendKeys("Dinesh");
        }
        catch(NoSuchElementException nse){
            System.out.println("NoSuchElementException");
            throw new RuntimeException("Exception");
        }

        //WebElement FirstName = driver.findElement(By.name("UserFirstName"));
        //FirstName.sendKeys("Dinesh");

        WebElement LastName = driver.findElement(By.name("UserLastName"));
        LastName.sendKeys("Vadi");

        WebElement JobTitle = driver.findElement(By.cssSelector("input[name='UserTitle']"));
        JobTitle.sendKeys("Software Tester");

        WebElement NextButton = driver.findElement(By.xpath("(//a[@href='#'])[2]"));
        NextButton.click();

        WebElement SelectEmployees = driver.findElement(By.cssSelector("option[value='15000']"));
        SelectEmployees.click();

        WebElement CompanyName = driver.findElement(By.cssSelector("input[name='CompanyName']"));
        CompanyName.sendKeys("HyperGrid Techonolgy");

        WebElement CountryName = driver.findElement(By.cssSelector("option[value='AU']"));
        CountryName.click();

        try {
            WebElement StateName = driver.findElement(By.cssSelector("option[value='VI']"));
            StateName.click();
        }
        catch (Exception e){
            System.out.println("Exception");
        }

        WebElement NextButton1 = driver.findElement(By.xpath("(//a[@href='#'])[3]"));
        NextButton1.click();
        //driver.quit();

    }
}
