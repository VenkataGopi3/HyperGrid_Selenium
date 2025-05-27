package CogmentoApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class CogmentoFullApplication extends CogmentoTestNG {

    String year = "2026";
    String month = "September";
    String date = "17";
    String time = "18:00";


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

        WebElement clickOnDueDateInputBox = driver.findElement(By.cssSelector("input[class='calendarField']"));
        clickOnDueDateInputBox.click();

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
//        while (true) {
//            if (driver.findElements(By.xpath("//div[text()='" +date+ "']")).size()>0) {
//                break;
//            } else {
//                nextButton.click();
//            }
//        }
//        while (true) {
//            if (driver.findElements(By.xpath("//div[contains(text(),'" + date + "')]")).size() > 0) {
//                break;
//            } else {
//                nextButton.click();
//            }
//        }

//            WebElement clickOnDate = driver.findElement(By.xpath("//div[text()='"+date+"']"));
//            clickOnDate.click();
    }
}

