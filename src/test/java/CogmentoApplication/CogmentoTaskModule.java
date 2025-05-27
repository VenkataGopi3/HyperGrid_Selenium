package CogmentoApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class CogmentoTaskModule extends CogmentoTestNG{

    String year = "2026";
    String month = "September";
    String date = "17";
    String time = "18:00";

    @Test
    public void implementationOfCogmento() throws InterruptedException {

        WebElement clickOnLoginButton = driver.findElement(By.xpath("//a[text()='Login']"));
        clickOnLoginButton.click();
        String cogmentoLoginButton = driver.getWindowHandle();
        System.out.println(cogmentoLoginButton);
        System.out.println("*************************************");

        Set<String> allWindows = driver.getWindowHandles();

        for (String tab : allWindows) {
            driver.switchTo().window(tab);
        }

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

        WebElement clickOnDueDateInputBox = driver.findElement(By.cssSelector("input[class='calendarField']"));
        clickOnDueDateInputBox.click();
        Thread.sleep(2000);

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
//
    }
}
