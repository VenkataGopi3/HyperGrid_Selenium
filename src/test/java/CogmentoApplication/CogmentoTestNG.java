package CogmentoApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class CogmentoTestNG {

    WebDriver driver;

    @BeforeSuite
    public void Browser(){

        driver = new ChromeDriver();
    }

    @BeforeTest
    public void ApplicationImplementation(){
        driver.get("https://cogmento.com/en");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void CogmentoTest(){
//        WebElement emailInputBox = driver.findElement(By.cssSelector("[placeholder='Your email']"));
//        emailInputBox.sendKeys("vits.19735a0333@gmail.com");
//
//        WebElement getFreeClaim = driver.findElement(By.xpath("(//button[@type=\"button\"])[2]"));
//        getFreeClaim.click();
//
//        //WebElement clickOnCheckBox = driver.findElement(By.cssSelector("[aria-label='checkbox-label']"));
//        WebElement clickOnCheckBox1 = driver.findElement(By.xpath("//div[@aria-label='checkbox-wrapper']"));
//        System.out.println(clickOnCheckBox1.isSelected());
//        clickOnCheckBox1.click();
//
//        WebElement checkInputBoxClicked = driver.findElement(By.cssSelector("input[id='ageree']"));
//        System.out.println(checkInputBoxClicked.isSelected());

//        WebElement clickOnCheckBox = driver.findElement(By.xpath("//label[@for='ageree']"));
//        clickOnCheckBox.click();
    }

    @Test
    public void CogmentoLogin(){

//       WebElement clickOnSignupButton = driver.findElement(By.xpath("(//a[@target='_blank'])[1]"));
//       clickOnSignupButton.click();

//        String cogmentoWindow = driver.getWindowHandle();

//        System.out.println(cogmentoWindow);
//        System.out.println("*************************************");
        WebElement clickOnLoginButton = driver.findElement(By.xpath("//a[text()='Login']"));
        clickOnLoginButton.click();
        String cogmentoWindow = driver.getWindowHandle();
        System.out.println(cogmentoWindow);
        System.out.println("*************************************");

        Set<String> allWindows = driver.getWindowHandles();

        for (String tab: allWindows){
            System.out.println(tab);
            driver.switchTo().window(tab);
        }

       WebElement enterEmailId = driver.findElement(By.cssSelector("[name='email']"));
       enterEmailId.sendKeys("bablu19735@gmail.com");

       WebElement enterPassword = driver.findElement(By.cssSelector("[name='password']"));
       enterPassword.sendKeys("Bablu@333");

       WebElement LoginButton = driver.findElement(By.xpath("//div[text()='Login']"));
       LoginButton.click();

    }

    @Test
    public void navigateToURL(){
        driver.navigate().to("https://cogmento.com/en");

        String homePageTitle = driver.getTitle();
        System.out.println(homePageTitle);

        driver.get("https://ui.cogmento.com/");

        String loginPageTitle = driver.getTitle();
        System.out.println(loginPageTitle);

        driver.navigate().back();
        Assert.assertEquals(homePageTitle, "Free CRM Software - Customer Relationship Management");

        driver.navigate().forward();
        Assert.assertEquals(loginPageTitle, "Cogmento CRM");

        driver.navigate().refresh();
        Assert.assertEquals(loginPageTitle, "Cogmento CRM");


    }
}
