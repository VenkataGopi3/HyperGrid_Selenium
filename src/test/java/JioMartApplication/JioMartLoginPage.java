package JioMartApplication;


import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class JioMartLoginPage extends JioMartBase {
    private final WebDriver driver;
    private JioMartSeleniumActions jioMartSeleniumActions;

    public JioMartLoginPage(WebDriver driver) {
        this.driver = driver;
        jioMartSeleniumActions = new JioMartSeleniumActions(driver);
    }


    By clickOnEnableLoc = By.xpath("//button[text()='Enable Location']");
    By clickOnSignIn = By.cssSelector("[id='sign_in_text']");
    By enterPhNumber = By.cssSelector("[id='phoneNumber']");
    By clickOnSearchBar = By.cssSelector("[id='autocomplete-0-input']");
    By clickOnLabel = By.xpath("//div[text()='Vallhabha Paneer 400 g']");
    By clickOnAddCart = By.cssSelector("[class='product-image-cta cart-holder']");
    By articleId = By.xpath("//div[text()=' Article ID: ']");
    //By clickOnMiniCart = By.xpath("//div[@class='header-main-user']//button[@id='btn_minicart']");
    By clickOnMiniCart = By.cssSelector("[class='header-main-user-cart-count counter-number']");
    //    By ClickOnMiniCart = By.cssSelector("button[id='btn_minicart']");
    By clickOnProceed = By.xpath("//div[@class='header-main-user']//button[text()=' Proceed to Cart ']");
    //    By clickOnPlus = By.cssSelector("name='plus'");
    By clickOnPlaceOrder = By.cssSelector("[name='placeorder']");
//    By clickOnConfirmLoc = By.cssSelector("[name='jds-button']");
//    By clickOnSaveAndProceed = By.cssSelector("[type='submit']");

    public void loginAsUser(String phNumber) throws InterruptedException {

        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(clickOnEnableLoc));
        jioMartSeleniumActions.clickOnElement(clickOnEnableLoc);
        Thread.sleep(5000);
        jioMartSeleniumActions.clickOnElement(clickOnSignIn);
        jioMartSeleniumActions.clickOnElement(enterPhNumber);
        jioMartSeleniumActions.typeText(enterPhNumber, phNumber);
        Thread.sleep(10000);
        WebDriverWait webDriverWait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        webDriverWait1.until(ExpectedConditions.visibilityOfElementLocated(clickOnSearchBar));
        jioMartSeleniumActions.typeText(clickOnSearchBar, "paneer");
        jioMartSeleniumActions.clickOnElement(clickOnLabel);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(articleId)).perform();
        jioMartSeleniumActions.clickOnElement(clickOnAddCart);
        Thread.sleep(5000);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
//        jse.(driver.findElement(clickOnMiniCart)).perform();
       // JavascriptExecutor jse = (JavascriptExecutor)driver;
        //WebElement clickOnMiniCart = driver.findElement(By.cssSelector("button[id='btn_minicart']"));
       // jse.executeScript("arguments[0].moveToElement(true).perform",clickOnMiniCart);
//        try{
//        WebElement clickOnMiniCart = driver.findElement(By.cssSelector("button[id='btn_minicart']"));
//        actions.moveToElement(clickOnMiniCart).build().perform();
//        }
//        catch (ElementClickInterceptedException ecie){
//            System.out.println("element try to click" +ecie.getMessage());
//
//        }
//        actions.scrollToElement(driver.findElement(By.xpath("//div[@class='header-main-user']//button[@id='btn_minicart']"))).perform();
//        actions.scrollToElement(driver.findElement(ClickOnMiniCart)).perform();
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("arguments[0].click()", clickOnMiniCart);
//        try {
//            webDriverWait1.until(ExpectedConditions.visibilityOfElementLocated(clickOnMiniCart));
//            WebElement clickOnMiniCart = driver.findElement(By.cssSelector("button[id='btn_minicart']"));
//            actions.moveToElement(clickOnMiniCart).build().perform();
//        }
//        catch (ElementNotInteractableException elementNotInteractableException){
////            actions.moveToElement(driver.findElement(By.xpath("//div[@class='header-main-user']//button[@id='btn_minicart']"))).perform();
//            System.out.println("Exception Handled");
//        }
        Thread.sleep(5000);
//        jioMartSeleniumActions.clickOnElement(clickOnMiniCart);
//        actions.moveToElement(driver.findElement(clickOnMiniCart)).perform();
//        jioMartSeleniumActions.clickOnElement(clickOnMiniCart);
//        Thread.sleep(2000);
        jioMartSeleniumActions.clickOnElement(clickOnProceed);
        Thread.sleep(3000);
        actions.moveToElement(driver.findElement(clickOnPlaceOrder)).perform();
        jioMartSeleniumActions.clickOnElement(clickOnPlaceOrder);
//        jioMartSeleniumActions.clickOnElement(clickOnConfirmLoc);
//        jioMartSeleniumActions.clickOnElement(clickOnSaveAndProceed);

    }

}
