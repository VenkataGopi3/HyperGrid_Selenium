package CogmentoApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class CogmentoTaskModule extends CogmentoTestNG {

    String year = "2025";
    String month = "August";
    String date = "26";
    String time = "18:00";

    String closeYear = "August 2026";
    String closeMonth = "August";
    String closeDate = "26";
    String closeTime = "18:00";

    public void clickElement(By locator) {
        driver.findElement(locator).click();
    }

    public void typeText(By locator, String value) {
        driver.findElement(locator).sendKeys(value, Keys.ENTER);
    }

    @Test
    public void implementationOfCogmento() throws InterruptedException {

        WebElement enterEmailId = driver.findElement(By.cssSelector("[name='email']"));
        enterEmailId.sendKeys("bablu19735@gmail.com");

        WebElement enterPassword = driver.findElement(By.cssSelector("[name='password']"));
        enterPassword.sendKeys("Bablu@333");

        WebElement LoginButton = driver.findElement(By.xpath("//div[text()='Login']"));
        LoginButton.click();
        WebElement clickOnTask = driver.findElement(By.xpath("(//span[text()='Tasks'])[1]"));
        clickOnTask.click();

        WebElement clickOnCreateButton = driver.findElement(By.xpath("//button[text()='Create']"));
        clickOnCreateButton.click();

        WebElement clickOnTitleInput = driver.findElement(By.cssSelector("[name='title']"));
        clickOnTitleInput.sendKeys("Cogmento Web Application");

        WebElement clickOnAssignedInput = driver.findElement(By.xpath("(//i[@class='dropdown icon'])[2]"));
        clickOnAssignedInput.click();

        WebElement clickOnText = driver.findElement(By.xpath("(//span[text()='Venkata Gopi'])[3]"));
        clickOnText.click();

        WebElement clickOnTypeDropDownInputBox = driver.findElement(By.xpath("(//i[@class=\"dropdown icon\"])[3]"));
        clickOnTypeDropDownInputBox.click();

        WebElement clickOnTechnicalText = driver.findElement(By.xpath("//span[text()='Technical Support']"));
        clickOnTechnicalText.click();
        Actions actions = new Actions(driver);
        actions.scrollToElement(driver.findElement(By.cssSelector("[class='ui right labeled input']"))).perform();

        WebElement clickOnDueDateInputBox = driver.findElement(By.cssSelector("input[class='calendarField']"));
        clickOnDueDateInputBox.click();
        Thread.sleep(2000);

        WebElement nextButton = driver.findElement(By.cssSelector("button[aria-label='Next Month']"));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        while (true) {
            if (driver.findElements(By.xpath("//div[contains(text(),'" + year + "')]")).size() > 0) {
                break;
            } else {
                nextButton.click();
            }
        }
        while (true) {
            if (driver.findElements(By.xpath("//div[contains(text(),'" + month + "')]")).size() > 0) {
                break;
            } else {
                nextButton.click();
            }
        }
        WebElement clickOnDate = driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--008']"));
        clickOnDate.click();
        WebElement clickOnTime = driver.findElement(By.xpath("//li[text()='14:45']"));
        clickOnTime.click();
        WebElement clickOnContactInputBox = driver.findElement(By.xpath("(//input[@class='search'])[1]"));
        clickOnContactInputBox.sendKeys("8919086683", Keys.ENTER);
        WebElement clickOnCompanyName = driver.findElement(By.xpath("(//input[@class='search'])[2]"));
        clickOnCompanyName.sendKeys("HyperGrid", Keys.ENTER);
        WebElement clickOnDealInputBox = driver.findElement(By.xpath("(//input[@class='search'])[3]"));
        clickOnDealInputBox.sendKeys("GuideWire", Keys.ENTER);
        WebElement clickOnCaseInputBox = driver.findElement(By.xpath("(//input[@class='search'])[4]"));
        clickOnCaseInputBox.sendKeys("Testing", Keys.ENTER);
        Actions actions1 = new Actions(driver);
        actions1.scrollToElement(driver.findElement(By.cssSelector("[name='identifier']"))).perform();
        WebElement clickOnCloseDateInputBox = driver.findElement(By.xpath("(//input[@class='calendarField'])[2]"));
        clickOnCloseDateInputBox.click();

        WebElement nextCloseDataButton = driver.findElement(By.cssSelector("button[class^='react-datepicker__navigation react-datepicker__navigation--n']"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        while (true) {
            if (driver.findElements(By.xpath("//div[contains(text(),'" + closeYear + "')]")).size() > 0) {
                break;
            } else {
                nextCloseDataButton.click();
            }
        }
        while (true) {
            if (driver.findElements(By.xpath("//div[contains(text(),'" + closeMonth + "')]")).size() > 0) {
                break;
            } else {
                nextCloseDataButton.click();
            }
        }

            WebElement clickOnCloseDate = driver.findElement(By.cssSelector("div[class^='react-datepicker__day react-datepicker__day--026']"));
            clickOnCloseDate.click();
            WebElement clickOnCloseTime = driver.findElement(By.xpath("//li[text()='21:15']"));
            clickOnCloseTime.click();
            typeText(By.xpath("(//input[@aria-autocomplete=\"list\"])[5]"), "#HyperGrid ");
            typeText(By.cssSelector("[name='description']"), "Chandu Is not working well in office times. But Im trying to tell to work properly.");
            typeText(By.cssSelector("[name='completion']"), "75");
            clickElement(By.xpath("(//i[@class='dropdown icon'])[4]"));
            clickElement(By.xpath("//span[text()='Reviewing']"));
            clickElement(By.xpath("(//div[@name='priority'])[1]"));
            clickElement(By.xpath("//span[text()='High']"));
            typeText(By.cssSelector("[name='identifier']"), "bablu19735@gmail.com");
            clickElement(By.cssSelector("[class='ui linkedin button']"));

    }
}

