package JioMartApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JioMartPaneerProduct extends JioMartBase{

    private final WebDriver driver;
    private JioMartSeleniumActions jioMartSeleniumActions;

    public JioMartPaneerProduct(WebDriver driver) {
        this.driver = driver;
        jioMartSeleniumActions = new JioMartSeleniumActions(driver);
    }

    By clickOnEnableLoc = By.xpath("//button[text()='Enable Location']");
    By clickOnSearchBar = By.cssSelector("[id='autocomplete-0-input']");
    By clickOnLabel = By.xpath("//div[text()='Vallhabha Paneer 400 g']");
    By clickOnAddCart = By.cssSelector("[class='product-image-cta cart-holder']");
    By articleId = By.xpath("//div[text()=' Article ID: ']");
    By clickOnMiniCart = By.xpath("//div[@class='header-main-user']//button[@id='btn_minicart']");
    By clickOnProceed = By.xpath("//div[@class='header-main-user']//button[text()=' Proceed to Cart ']");
    By clickOnPlaceOrder = By.xpath("//div[@class=\"place-order\"]//jds-button[@name=\"placeorder\"]");

    public void purchasePaneerProduct() throws InterruptedException{

        WebDriverWait webDriverWait =new WebDriverWait(driver, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(clickOnEnableLoc));
        jioMartSeleniumActions.clickOnElement(clickOnEnableLoc);
        Thread.sleep(10000);
        WebDriverWait webDriverWait1 =new WebDriverWait(driver, Duration.ofSeconds(10));
        webDriverWait1.until(ExpectedConditions.visibilityOfElementLocated(clickOnSearchBar));
        jioMartSeleniumActions.typeText(clickOnSearchBar,"paneer");
        jioMartSeleniumActions.clickOnElement(clickOnLabel);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(articleId)).perform();
        jioMartSeleniumActions.clickOnElement(clickOnAddCart);
        Thread.sleep(5000);
        actions.scrollToElement(driver.findElement(By.xpath("//div[@class='header-main-user']//button[@id='btn_minicart']"))).perform();
        Thread.sleep(3000);
//        jioMartSeleniumActions.clickOnElement(clickOnMiniCart);
        jioMartSeleniumActions.clickOnElement(clickOnProceed);
        jioMartSeleniumActions.clickOnElement(clickOnPlaceOrder);

    }
}
