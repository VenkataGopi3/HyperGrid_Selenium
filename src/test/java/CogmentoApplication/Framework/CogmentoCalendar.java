package CogmentoApplication.Framework;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CogmentoCalendar {
    private WebDriver driver;

    private CogmentoSeleniumActions cogmentoSeleniumActions;

    String year = "June 2026";
    String date = "27";
    String time = "15:45";

    String endYear = "June 2027";
    String endDate = "27";
    String endTime = "15:45";

    public CogmentoCalendar(WebDriver driver){
        this.driver=driver;
        cogmentoSeleniumActions = new CogmentoSeleniumActions(driver);
    }

        By clickOnCalendar = By.cssSelector("[class='calendar icon']");
        By clickOnCreate = By.xpath("(//button[@class='ui linkedin button'])[2]");
        By typeTitle = By.cssSelector("[name='title']");
        By clickOnStartDate = By.xpath("(//input[@class='calendarField'])[1]");
        By nextButton = By.cssSelector("button[aria-label='Next Month']");
        By clickOnDate = By.xpath("//div[text()='"+date+"']");
        By clickOnTime = By.xpath("//li[text()='"+time+"']");
        By clickOnEndDate = By.xpath("(//input[@class='calendarField'])[2]");
        By clickEndDate = By.xpath("//div[text()='"+endDate+"']");By clickEndTime = By.xpath("//li[text()='"+endTime+"']");
        By clickOnCategory = By.xpath("(//i[@class='dropdown icon'])[2]");
        By clickOnPrivate = By.xpath("//span[text()='Private']");
        By clickAndEnterTagName = By.xpath("(//input[@type='text'])[5]");
//        By writeTagName = By.xpath("(//div[@role='combobox'])[1]");
//        WebElement writeTag = driver.findElement(By.xpath("(//div[@role='combobox'])[1]"));
        By enterDescription = By.cssSelector("[name='description']");
        By clickOnAllDays = By.cssSelector("[class='ui toggle checkbox']");
        By clickOnAlertBefore = By.cssSelector("[name='minutesBefore']");
        By clickOnAlertTime = By.xpath("//span[text()='1 Hour']");
        By clickOnAlertVia = By.cssSelector("[name='channels']");
        By clickOnAlertMsg = By.xpath("//span[text()='SMS']");
        By clickOnSave = By.cssSelector("[class='ui linkedin button']");
//        By clickOnOk = By.cssSelector("[class='ui primary button']");
//       By clickOnAlert = By.xpath("(//button[@class='ui icon button'])[3]");



    public void calendarImplmentation() throws InterruptedException{
        cogmentoSeleniumActions.clickOnElement(clickOnCalendar);
//        driver.findElement(clickOnCalendar).click();
        cogmentoSeleniumActions.clickOnElement(clickOnCreate);
//        driver.findElement(clickOnCreate).click();
        cogmentoSeleniumActions.writeText(typeTitle, "HyperGrid Automation ");
//        driver.findElement(typeTitle).sendKeys("HyperGrid Automation ");
        cogmentoSeleniumActions.clickOnElement(clickOnStartDate);
//        driver.findElement(clickOnStartDate).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        while (true) {
            if (driver.findElements(By.xpath("//div[contains(text(),'" + year + "')]")).size() > 0) {
                break;
            } else {
                driver.findElement(nextButton).click();
            }
        }
        cogmentoSeleniumActions.clickOnElement(clickOnDate);
//        driver.findElement(clickOnDate).click();
        cogmentoSeleniumActions.clickOnElement(clickOnTime);
//        driver.findElement(clickOnTime).click();

        driver.findElement(clickOnEndDate).click();
        while (true) {
            if (driver.findElements(By.xpath("//div[contains(text(),'" + endYear + "')]")).size() > 0) {
                break;
            } else {
                driver.findElement(nextButton).click();
            }
        }
        cogmentoSeleniumActions.clickOnElement(clickEndDate);
//        driver.findElement(clickEndDate).click();
        cogmentoSeleniumActions.clickOnElement(clickEndTime);
//        driver.findElement(clickEndTime).click();
        cogmentoSeleniumActions.clickOnElement(clickOnCategory);
//        driver.findElement(clickOnCategory).click();
        cogmentoSeleniumActions.clickOnElement(clickOnPrivate);
//        driver.findElement(clickOnPrivate).click();
        cogmentoSeleniumActions.clickOnElement(clickAndEnterTagName);
        Thread.sleep(2000);
        cogmentoSeleniumActions.typeText(clickAndEnterTagName, "#HyperGrid");
        Thread.sleep(2000);
//        JavascriptExecutor jse = (JavascriptExecutor)driver;
//        jse.executeScript("arguments[0].value='#HyperGrid PVT LTD'",clickAndEnterTagName);

//        driver.findElement(By.xpath("(//div[@role='combobox'])[1]")).sendKeys("#HyperGrid", Keys.ENTER);
//        driver.findElement(clickAndEnterTagName).click();
//        WebElement clickOnTag = driver.findElement(By.xpath("(//div[@role='combobox'])[1]"));
//        cogmentoSeleniumActions.typeText(clickOnTag,"#HyperGrid Technology ");
//        cogmentoSeleniumActions.typeText(clickAndEnterTagName,"#HyperGrid");
//        cogmentoSeleniumActions.writeText(clickAndEnterTagName,"#");
//        cogmentoSeleniumActions.typeText(writeTag,"#HyperGrid Technology" );
        cogmentoSeleniumActions.typeText(enterDescription,"This is HyperGrid Calendar");
        cogmentoSeleniumActions.clickOnElement(clickOnAllDays);
        cogmentoSeleniumActions.clickOnElement(clickOnAlertBefore);
        cogmentoSeleniumActions.clickOnElement(clickOnAlertTime);
        cogmentoSeleniumActions.clickOnElement(clickOnAlertVia);
        cogmentoSeleniumActions.clickOnElement(clickOnAlertMsg);
        cogmentoSeleniumActions.clickOnElement(clickOnSave);
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
//        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement element = wait.until(
//                ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='OK']")));
//        element.click();
//        Thread.sleep(2000);
//        cogmentoSeleniumActions.clickOnElement(clickOnOk);
//        Thread.sleep(2000);
//        driver.switchTo().alert().accept();
//        cogmentoSeleniumActions.clickOnElement(clickOnAlert);




    }
}
