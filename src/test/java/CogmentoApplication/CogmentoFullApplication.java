package CogmentoApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;
import java.time.Duration;
import java.util.Set;

public class CogmentoFullApplication extends CogmentoTestNG {

    String year = "2025";
    String month = "September";
    String date = "17";
    String time = "18:00";

    String closeYear = "2026";
    String closeMonth = "September";
    String closeDate = "17";
    String closeTime = "00:00";



    @Test
    public void implementationOfCogmento() throws InterruptedException {

        WebElement clickOnLoginButton = driver.findElement(By.xpath("//a[text()='Login']"));
        clickOnLoginButton.click();
        String cogmentoWindow = driver.getWindowHandle();
        System.out.println(cogmentoWindow);
        System.out.println("*************************************");

        Set<String> allWindows = driver.getWindowHandles();

        for (String tab : allWindows) {
            System.out.println(tab);
            driver.switchTo().window(tab);
        }

        WebElement enterEmailId = driver.findElement(By.cssSelector("[name='email']"));
        enterEmailId.sendKeys("bablu19735@gmail.com");

        WebElement enterPassword = driver.findElement(By.cssSelector("[name='password']"));
        enterPassword.sendKeys("Bablu@333");

        WebElement LoginButton = driver.findElement(By.xpath("//div[text()='Login']"));
        LoginButton.click();

//        WebElement clickOnContact = driver.findElement(By.xpath("(//span[text()='Contacts'])[1]"));
//        clickOnContact.click();
//
//        WebElement clickOnCreateButton = driver.findElement(By.xpath("//button[text()='Create']"));
//        clickOnCreateButton.click();
//
//        WebElement enterFirstName = driver.findElement(By.cssSelector("[name='first_name']"));
//        enterFirstName.sendKeys("Venkata");
//
//        WebElement enterLastName = driver.findElement(By.cssSelector("[name='last_name']"));
//        enterLastName.sendKeys("Gopi");
//
//        WebElement enterCompanyName = driver.findElement(By.xpath("(//input[@class='search'])[1]"));
//        enterCompanyName.sendKeys("HyperGrid ");

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
//        Actions actions = new Actions(driver);
//        actions.scrollToElement(clickOnDueDateInputBox).perform();

        WebElement nextButton = driver.findElement(By.cssSelector("button[aria-label='Next Month']"));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        while (true) {
            if (driver.findElements(By.xpath("//div[contains(text(),'" + year + "')]")).size()>0) {
                break;
            } else {
                nextButton.click();
            }
        }
        while (true) {
            if (driver.findElements(By.xpath("//div[contains(text(),'" + month + "')]")).size()>0) {
                break;
            } else {
                nextButton.click();
            }
        }
        WebElement clickOnDate = driver.findElement(By.xpath("//div[text()='17']"));
        clickOnDate.click();
        WebElement clickOnTime = driver.findElement(By.xpath("//li[text()='14:00']"));
        clickOnTime.click();

//        WebElement clickContact = driver.findElement(By.xpath("(//input[@class='search'])[1]"));
//        clickContact.click();
//        WebElement clickOnContact = driver.findElement(By.xpath("//span[text()='9989202181 ']"));
//        clickOnContact.sendKeys("9989202181");
//        WebElement clickOnCompanyName = driver.findElement(By.xpath("(//input[@class='search'])[2]"));
//        clickOnCompanyName.sendKeys("HyperGrid", Keys.ENTER);
////        JavascriptExecutor jse = (JavascriptExecutor) driver;
////        jse.executeScript("arguments[0].value='HyperGrid Technology'", clickOnCompanyName);
//
//        WebElement clickOnContactInputBox = driver.findElement(By.xpath("(//input[@class='search'])[1]"));
////        clickOnContactInputBox.sendKeys("7989195677");
//        clickOnContactInputBox.sendKeys("8919086683", Keys.ENTER);
//        Actions  actions1 = new Actions(driver);
//        actions1.keyUp().
//        WebElement clickOnContact = driver.findElement(By.xpath("//span[text()='7989195677 ']"));
//        clickOnContact.click();
//        WebElement clickCompanyName = driver.findElement(By.cssSelector("input[fdprocessedid='gom76']"));
//        clickCompanyName.click();
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("argument[0], click()");
//        WebElement clickOnCompanyName = driver.findElement(By.cssSelector("[name='company']"));
////        clickOnCompanyName.sendKeys("HyperGrid Technology", Keys.ENTER);
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("arguments[0].value='HyperGrid Technology'", clickOnCompanyName);

//        WebElement clickOnCompany = driver.findElement(By.xpath("//span[text()='HyperGrid ']"));
//        clickOnCompany.cli
        WebElement clickOnContactInputBox = driver.findElement(By.xpath("(//input[@class='search'])[1]"));
        clickOnContactInputBox.sendKeys("8919086683", Keys.ENTER);
        WebElement clickOnCompanyName = driver.findElement(By.xpath("(//input[@class='search'])[2]"));
        clickOnCompanyName.sendKeys("HyperGrid", Keys.ENTER);
        WebElement clickOnDealInputBox =driver.findElement(By.xpath("(//input[@class='search'])[3]"));
        clickOnDealInputBox.sendKeys("GuideWire",Keys.ENTER);
        WebElement clickOnCaseInputBox = driver.findElement(By.xpath("(//input[@class='search'])[4]"));
        clickOnCaseInputBox.sendKeys("Testing", Keys.ENTER);

        Actions actions1 = new Actions(driver);
        actions1.scrollToElement(driver.findElement(By.cssSelector("[class='ui right labeled input']"))).perform();

        WebElement nextButton1 = driver.findElement(By.cssSelector("button[class^='react-datepicker__navigation react-datepicker__navigation--n']"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        while (true) {
            if (driver.findElements(By.xpath("//div[contains(text(),'" + closeYear + "')]")).size()>0) {
                break;
            } else {
                nextButton1.click();
            }
        }
        while (true) {
            if (driver.findElements(By.xpath("//div[contains(text(),'" + closeMonth + "')]")).size()>0) {
                break;
            } else {
                nextButton1.click();
            }
            WebElement clickOnCloseDate = driver.findElement(By.xpath("//div[text()='16']"));
            clickOnCloseDate.click();
            WebElement clickOnCloseTime = driver.findElement(By.xpath("//li[text()='00:00']"));
            clickOnCloseTime.click();
        }
    }
}

