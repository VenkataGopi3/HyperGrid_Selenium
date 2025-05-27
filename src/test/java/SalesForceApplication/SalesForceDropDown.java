package SalesForceApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SalesForceDropDown {

    WebDriver driver;

    @Test
    public void SalesforceBrowser(){

        driver = new ChromeDriver();
        driver.get("https://www.salesforce.com/in/form/signup/sales-ee/?d=topnav2-btn-ft");
        driver.manage().window().maximize();

        WebElement firstNameInputBox = driver.findElement(By.cssSelector("input[name='UserFirstName']"));
        firstNameInputBox.sendKeys("Chandu");

        WebElement secondNameInputBox = driver.findElement(By.cssSelector("input[name='UserLastName']"));
        secondNameInputBox.sendKeys("30 years Youth");

        WebElement jobTitleInputBox = driver.findElement(By.cssSelector("input[name='UserTitle']"));
        jobTitleInputBox.sendKeys("Software Test Engineer");

        WebElement nextButton = driver.findElement(By.cssSelector("a[class*='btn btn-primary salesforce']"));
        nextButton.click();

        WebElement employeesDropDown = driver.findElement(By.cssSelector("select[name='CompanyEmployees']"));

        Select selectOption = new Select(employeesDropDown);

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
        //Thread.sleep(3000);
        selectOption.selectByIndex(2);
        selectOption.selectByValue("15000");
        String selectedText = selectOption.getFirstSelectedOption().getText();// Doubt
        //String selectAllText = selectOption.getAllSelectedOptions();

        System.out.println(selectedText);

        Assert.assertEquals(selectedText,"10,001+ employees");

        List<WebElement> allListItems = selectOption.getOptions();

        //System.out.println(allListItems);
        List<String> actualList = new ArrayList<>();

        WebElement firstOption = allListItems.get(0);

        String firstOptionText = allListItems.get(3).getText();
        System.out.println(firstOptionText);
        System.out.println(firstOption.getText());

        WebElement secondOption = allListItems.get(1);
        System.out.println(secondOption.getText());

        for(int i=1; i<allListItems.size(); i++){
            actualList.add(allListItems.get(i).getText());
        }

        System.out.println("actualList :: " + actualList);

        List<String> expectedList = Arrays.asList("1 - 20 employees", "21 - 200 employees", "201 - 10,000 employees", "10,001+ employees");

        Assert.assertEquals(actualList, expectedList);
    }
}
