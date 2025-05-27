package ShadowRoot;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class HandleShadowRootElements {

    WebDriver driver;


    @Test
    public  void handleShadowRootElement(){
        driver = new ChromeDriver();
        driver.navigate().to("https://www.salesforce.com/in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

//        WebElement clickOnSaleForceImage = driver.findElement(By.cssSelector("[class^='img-responsive margin-30-top-lg']"));
//        clickOnSaleForceImage.click();
//        WebElement getShadowRootElement = driver.findElement(By.xpath("//hgf-button[text()='Try for free']"));

//        SearchContext clickOnTryFreeButton = driver.findElement(By.cssSelector("[style*='--nav-integration-c-header-h']")).getShadowRoot();
//        SearchContext clickOnTryFreeButton = getShadowRootElement.getShadowRoot();
        SearchContext clickOnTryFreeButton = driver.findElement(By.cssSelector("[style*='--nav-integration-c-header-h']")).getShadowRoot();
        System.out.println(clickOnTryFreeButton);

//        clickOnTryFreeButton.findElement(By.cssSelector("hgf-button[variant='trial']")).click();//No Such Element
//        clickOnTryFreeButton.findElement(By.cssSelector("hgf-button[class='l1-button']")).click();

//        WebElement clickOnButton =  clickOnTryFreeButton.findElement(By.cssSelector("a[href*='www.salesforce.com/in/form/signup/freetrial']"));
//        clickOnButton.click();
//        System.out.println(clickOnTryFreeButton);

//        String shadowRootElement = clickOnTryFreeButton.findElement(By.xpath("//hgf-button[@text()='Try for free']")).getText();
//        System.out.println(shadowRootElement);
//        clickOnTryFreeButton.findElements(By.xpath("//a[@class='hgf-button']")).size();
//        System.out.println(clickOnTryFreeButton);
        
//        clickOnTryFreeButton.findElement(By.xpath("//a[@class='hgf-button']")).click();//Invalid Arguments Exception
//        clickOnTryFreeButton.findElement(By.xpath("//slot[@name='start']")).click();//Invalid Arguments Exception
//        clickOnTryFreeButton.findElement(By.cssSelector("[class*='hgf-button']")).click();//no such element

        clickOnTryFreeButton.findElement(By.cssSelector("div[class='utility-ctas cta-main']")).click();



    }

    @Test
    public void GetLearningPage(){

        SearchContext clickOnLearningButton = driver.findElement(By.cssSelector("[style*='--nav-integration-c-header-h']")).getShadowRoot();
        clickOnLearningButton.findElement(By.cssSelector("[aria-controls='l1-3']")).click();
        clickOnLearningButton.findElement(By.cssSelector("[aria-controls='l1-3-l2-0']")).click();


    }
}
