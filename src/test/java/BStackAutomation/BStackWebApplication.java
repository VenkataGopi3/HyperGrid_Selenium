package BStackAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class BStackWebApplication {

        WebDriver driver;
        WebDriverWait wait;
        @BeforeClass
        public void setup(){
            driver = new ChromeDriver();
            driver.get("https://bstackdemo.com/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        }
        public WebElement waitForElementToClickable(By locator){
            return wait.until(ExpectedConditions.elementToBeClickable(locator));
        }
        public void clickElement(By locator){
            WebElement element= waitForElementToClickable(locator);
            element.click();
        }
        public void enterText(By locator, String text){
            WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            inputField.clear();
            inputField.sendKeys("text");
            System.out.println("Entered text is : " +text+ "into the field" + locator);
        }
        @Test(priority = 1)
        public void loginStackDemo(){
            By signInLink = By.xpath("//span[@id='signin']");
            clickElement(signInLink);
            By userName = By.xpath("//div[@id='username']");
            clickElement(userName);
            By userOption = By.xpath("//div[@id='username']//div[text()='demouser']");
            clickElement(userOption);
            By passWord = By.xpath("//div[@id='password']");
            clickElement(passWord);
            By passWordOption = By.xpath("//div[@id='password']//div[text()='testingisfun99']");
            clickElement(passWordOption);
            By loginButton = By.xpath("//button[text()='Log In']");
            clickElement(loginButton);
            boolean logoutVisibility = driver.findElement(By.xpath("//span[@id='signin' and @role='link']")).isDisplayed();
            Assert.assertTrue(logoutVisibility,"Logout not Visible");
        }
        @Test(priority = 2,dependsOnMethods = {"loginStackDemo"})
        public void checkOut(){
            String expectedDevice = "iPhone 12 Pro Max";
            By filterElement = By.xpath("//div[@class='filters']//span[text()='Apple']");
            clickElement(filterElement);
            By selectItem = By.xpath("//p[text()='iPhone 12 Pro Max']/following-sibling::div[@class='shelf-item__buy-btn']");
            clickElement(selectItem);
            WebElement cartItem = driver.findElement(By.xpath("//div[@class='shelf-item__details']/p"));
            String actualDeviceName = cartItem.getText();
            Assert.assertEquals(actualDeviceName,expectedDevice);
            By checkOut = By.xpath("//div[@class='buy-btn']");
            clickElement(checkOut);
            Assert.assertTrue(driver.findElement(By.xpath("//h2[@class='checkoutHeader-heading']")).isDisplayed(),"Not in the Shipping page");
        }
        @Test(priority = 3,dependsOnMethods = {"checkOut"})
        public void shippingAddress(){
            By firstNameInput = By.xpath("//input[@id='firstNameInput']");
            enterText(firstNameInput,"test");
            By lastNameInput = By.xpath("//input[@id='lastNameInput']");
            enterText(lastNameInput,"test2");
            By addressInput = By.xpath("//input[@id='addressLine1Input']");
            enterText(addressInput,"test3");
            By provinceInput = By.xpath("//input[@id='provinceInput']");
            enterText(provinceInput,"test4");
            By postalCode = By.xpath("//input[@id='postCodeInput']");
            enterText(postalCode,"test5");
            By submitAddress = By.xpath("//button[@id='checkout-shipping-continue' and @type='submit']");
            clickElement(submitAddress);
            boolean orderReceipt = driver.findElement(By.xpath("//a[@id='downloadpdf']")).isDisplayed();
            Assert.assertTrue(orderReceipt,"orderReceipt Not generated");
            By headerLink = By.xpath("//a[@class='checkoutHeader-link' and text()='StackDemo']");
            clickElement(headerLink);
            boolean logoutVisibility = driver.findElement(By.xpath("//span[@id='signin' and @role='link']")).isDisplayed();
            Assert.assertTrue(logoutVisibility,"Logout not Visible");
        }
        @Test(priority = 4,dependsOnMethods = {"shippingAddress"})
        public void orderVerification(){
            String expectedDevice = "iPhone 12 Pro Max";
            By orderList = By.xpath("//a[@id='orders']");
            clickElement(orderList);
            WebElement userInfo = driver.findElement(By.xpath("//span[@class='username']"));
            String loginUser = userInfo.getText();
            WebElement userInfo1 = driver.findElement(By.xpath("//span[text()='Ship to']/parent::div/following-sibling::div/span[@class='a-color-secondary value']"));
            String shippingUser = userInfo1.getText();
//        WebElement orderItem = driver.findElement(By.xpath("//strong[text()='Title:']/parent::div/text()[2]"));
//        String actualDevice = orderItem.getText();
            Assert.assertEquals(loginUser,shippingUser,"Inappropriate User login");
//        Assert.assertEquals(expectedDevice,actualDevice,"Wrong order has been placed");
            By headerLink = By.xpath("//a[@class='Navbar_logo__26S5Y']");
            clickElement(headerLink);
            boolean logoutVisibility = driver.findElement(By.xpath("//span[@id='signin' and @role='link']")).isDisplayed();
            Assert.assertTrue(logoutVisibility,"Logout not Visible");
        }
        @Test(priority = 5,dependsOnMethods = {"orderVerification"})
        public void favItems(){
            String expectedDevice = "iPhone 12";
            WebElement selectItem = driver.findElement(By.xpath("//p[text()='iPhone 12']"));
            String actualItem = selectItem.getText();
            By item1 = By.xpath("//p[text()='iPhone 12']/parent::div//button[@class='MuiButtonBase-root MuiIconButton-root Button ']");
            clickElement(item1);
            By favList = By.xpath("//a[@id='favourites']");
            clickElement(favList);
            Assert.assertEquals(expectedDevice,actualItem);
            By logout = By.xpath("//span[@id='signin' and @role='link']");
            clickElement(logout);
        }

    @Test
    public void productsList() {

        List<WebElement> productsList = driver.findElements(By.cssSelector(".shelf-item__title"));
        List<WebElement> priceOfProducts = driver.findElements(By.cssSelector("[class='val']"));
        System.out.println(productsList.size());
        System.out.println(priceOfProducts.size());

        for (int i = 0; i < productsList.size(); i++) {
            String productName = productsList.get(i).getText();
            String productPrice = priceOfProducts.get(i).getText();
            System.out.println("Product: " + productName);
              System.out.println("Price: " + productPrice);
        }
    }
        @AfterClass

        public void closeSession(){
            driver.close();
            driver.quit();
        }
}

