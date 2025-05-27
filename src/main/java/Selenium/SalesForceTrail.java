package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SalesForceTrail {

        public static void main(String[] args) throws Exception {
            WebDriver driver = new ChromeDriver();

            driver.get("https://www.salesforce.com/in/form/signup/sales-ee/?d=topnav2-btn-ft");
            driver.manage().window().maximize();

            //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
           WebElement firstNameInputBox = driver.findElement(By.name("UserFirstName"));
            firstNameInputBox.sendKeys("RPA");

            WebElement lastNameInputBox = driver.findElement(By.name("UserLastName"));
            lastNameInputBox.sendKeys("Selenium");

            WebElement jobTitle = driver.findElement(By.name("UserTitle"));
            jobTitle.sendKeys("Director");
            Thread.sleep(5000);

            //WebElement next = driver.findElement(By.className("btn-container"));
            
            //WebElement next1 = driver.findElement(By.cssSelector(""))
              WebElement next1 = driver.findElement(By.cssSelector("a[class^='btn btn-primary']"));
              next1.click();
            /**WebElement next2 = driver.findElement(By.xpath("//a[@class='btn btn-primary salesforce-sans-regular\n" +
            "            btn-lg']"));
           next2.click();**/

           WebElement employeesDropDown = driver.findElement(By.xpath("//select[@name ='CompanyEmployees'] /option[4]"));
           employeesDropDown.click();

           WebElement companyName = driver.findElement(By.cssSelector("input[name='CompanyName']"));
           companyName.sendKeys("HyperGrid Technologies");

            //driver.findElement(By.cssSelector("input[aria-describedby$='errMsg']")).sendKeys("HyperGrid ");


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
            //div[class='checkbox-ui']----> cssSelector (//div[@class='checkbox-ui'])[2]----->xpath
            checkBox.click();
            //System.out.println(checkBox.isSelected());


          //WebElement submit =driver.findElement(By.xpath("//button[@class='submit btn btn-primary salesforce-sans-regular btn-lg']"));
          //submit.click();
          WebElement submit1 =driver.findElement(By.xpath("//button[@class='submit btn btn-primary salesforce-sans-regular btn-lg']"));
          submit1.click();
            //button[@class='submit btn btn-primary salesforce-sans-regular btn-lg']------> xpath
            //button[@type='submit']----->xpath



driver.quit();
//driver.close();



        }

}


