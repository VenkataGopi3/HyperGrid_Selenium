package MakeMyTripApplication.TestNG.SeleniumFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class LoginPageForBooking  {
    private WebDriver driver;
    private BookingCommonActions bookingCommonActions;

    String year = "May 2026";
    String date = "10";


    public LoginPageForBooking(WebDriver driver){
    this.driver = driver;
    bookingCommonActions = new BookingCommonActions(driver);

    }

//    By enterMobileNumber = By.cssSelector("[placeholder='Enter Mobile Number']");
    By clickOnClose = By.cssSelector("[class='commonModal__close']");
    By clickOnFrom = By.cssSelector("input[id='fromCity']");
    By clickOnFromState = By.cssSelector("[placeholder='From']");
    By clickOnTo = By.cssSelector("input[id='toCity']");
    By clickOnToState = By.cssSelector("[placeholder='To']");
    By clickOnDeparture = By.cssSelector("[for='departure']");
    By clickOnNextButton = By.cssSelector("[aria-label='Next Month']");
    By clickOnDepartureDate = By.xpath("(//p[text()='16'])[2]");


    public void implementLoginPage() throws InterruptedException {
        bookingCommonActions.clickOnElement(clickOnClose);
//        bookingCommonActions.typeText(enterMobileNumber,"7989195677");
        bookingCommonActions.clickOnElement(clickOnFrom);
        bookingCommonActions.typeText(clickOnFromState,"New Delhi, India");
//        Thread.sleep(1000);
        bookingCommonActions.clickOnElement(clickOnTo);
        bookingCommonActions.typeText(clickOnToState,"Goa - Dabolim Airport, India");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        bookingCommonActions.clickOnElement(clickOnDeparture);

        while (true){
            if (driver.findElements(By.xpath("//div[text()='"+year+"']")).size()>0){
                break;
            }
            else {
                bookingCommonActions.clickOnElement(clickOnNextButton);
            }
        }
        bookingCommonActions.clickOnElement(clickOnDepartureDate);
    }
}
