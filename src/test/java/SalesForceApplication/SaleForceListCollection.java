package SalesForceApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class SaleForceListCollection {

    WebDriver driver;

    @Test
    public void DropDownList(){


        driver = new ChromeDriver();
        driver.get("https://www.salesforce.com/in/form/signup/sales-ee/?d=topnav2-btn-ft");
        driver.manage().window().maximize();

        WebElement firstNameInputBox = driver.findElement(By.cssSelector("input[name='UserFirstName']"));
        firstNameInputBox.sendKeys("Chandu");

        WebElement secondNameInputBox = driver.findElement(By.cssSelector("input[name='UserLastName']"));
        secondNameInputBox.sendKeys("30 years Youth");

        WebElement jobTitleInputBox = driver.findElement(By.cssSelector("input[name='UserTitle']"));
        jobTitleInputBox.sendKeys("Software Test Engineer");

        String jobTitleGet = jobTitleInputBox.getDomAttribute("value");
        System.out.println(jobTitleGet);

        WebElement nextButton = driver.findElement(By.cssSelector("a[class*='btn btn-primary salesforce']"));
        nextButton.click();

        WebElement employeesDropDown = driver.findElement(By.cssSelector("select[name='CompanyEmployees']"));

        Select selectOption = new Select(employeesDropDown);
        selectOption.selectByValue("15000");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
        //Thread.sleep(3000);
        selectOption.selectByIndex(2);
        String selectedText = selectOption.getFirstSelectedOption().getText();// Doubt//
        System.out.println(selectedText);

       //Assert.assertEquals(selectedText,"10,001+ employees");

        WebElement companyName = driver.findElement(By.cssSelector("input[name='CompanyName']"));
        companyName.sendKeys("HyperGrid");

        WebElement countryDropDown = driver.findElement(By.cssSelector("select[name='CompanyCountry']"));

        Select selectCountryName = new Select(countryDropDown);
        selectCountryName.selectByVisibleText("United States");

        WebElement stateNamesDropDownList = driver.findElement(By.cssSelector("select[name='CompanyState']"));
        //stateNamesDropDownList.sendKeys("California");

        Select selectStateName = new Select(stateNamesDropDownList);
        selectStateName.selectByValue("CA");

        String selectedStateName = selectStateName.getFirstSelectedOption().getText();
        System.out.println(selectedStateName);


        //WebElement backButton = driver.findElement(By.cssSelector("a[class*='btn btn-light']"));
       // backButton.click();

        WebElement nextButton1 = driver.findElement(By.cssSelector("a[class*='btn btn-primary salesforce']"));
        nextButton1.click();

        WebElement phoneNumber = driver.findElement(By.cssSelector("input[name='UserPhone']"));
        phoneNumber.sendKeys("8106913830");

        WebElement email = driver.findElement(By.cssSelector("input[name='UserEmail']"));
        email.sendKeys("chandu@gmail.com");

        //WebElement checkBox = driver.findElement(By.xpath("(//div/div[@class='checkbox-ui'])[2]"));
        WebElement checkBox = driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[2]"));
        System.out.println(checkBox.isSelected());
        checkBox.click();
        WebElement checkBoxInput = driver.findElement(By.xpath("(//input[@class='sr-only'])[1]"));

        System.out.println(checkBoxInput.isSelected());

//        JavascriptExecutor jse = (JavascriptExecutor)driver;
//
//        jse.executeScript("arguments[0].click()", checkBox);
//        //clickOnCheckBox.click();
//        System.out.println(checkBox.isSelected());


//        System.out.println(checkBox.isEnabled());
//        System.out.println(checkBox.isDisplayed());
//        System.out.println(checkBox.isSelected());
//
//        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
//        checkBox.click();

//        JavascriptExecutor jse = (JavascriptExecutor)driver;
//
//        jse.executeScript("arguments[0].click()",checkBox);
        //checkBox.click();
        //System.out.println(checkBox.isSelected());
        //System.out.println(checkBox.isSelected());
//        WebElement checkBox = driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[2]"));
//        System.out.println(checkBox.isSelected());
//        checkBox.click();
//        System.out.println("**********************************");
//        boolean isChecked = checkBox.isSelected();
//        System.out.println(isChecked);

    }

    public static class ShadowDOMTest {

        private WebDriver driver;
        private WebDriverWait wait;

        @BeforeClass
        public void setUp() {
            driver = new ChromeDriver(); // Ensure chromedriver is in your system PATH or configured properly
            driver.manage().window().maximize();
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            driver.get("https://www.salesforce.com/in/form/signup/sales-ee/?d=topnav2-btn-ft"); // 🔁 Replace this with the actual URL you're testing
        }

        @Test
        public void testClickButtonInsideShadowDom() {
            try {
                // Step 1: Click on the Salesforce image
                WebElement image = wait.until(ExpectedConditions.elementToBeClickable(
                        By.cssSelector("[class^='img-responsive margin-30-top-lg']")));
                image.click();

                // Step 2: Find shadow host element
                WebElement shadowHost = wait.until(ExpectedConditions.presenceOfElementLocated(
                        By.cssSelector("[search='true']")));

                // Step 3: Use JavaScript to access and click inside Shadow DOM
                String script = """
                    const shadowRoot = arguments[0].shadowRoot;
                    const button = shadowRoot.querySelector("a.hgf-button");
                    if (button) {
                        button.click();
                        return 'Clicked';
                    } else {
                        return 'Button not found';
                    }
                """;

                JavascriptExecutor js = (JavascriptExecutor) driver;
                Object result = js.executeScript(script, shadowHost);
                System.out.println("JavaScript result: " + result);
                assert result.equals("Clicked") : "Failed to click the button inside Shadow DOM";

            } catch (Exception e) {
                e.printStackTrace();
                assert false : "Test failed due to exception: " + e.getMessage();
            }
        }

    //    @AfterClass
    //    public void tearDown() {
    //        if (driver != null) {
    //            driver.quit();
    //        }
    //    }
    }
}
