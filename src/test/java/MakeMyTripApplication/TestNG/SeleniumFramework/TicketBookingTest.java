package MakeMyTripApplication.TestNG.SeleniumFramework;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TicketBookingTest extends TicketBookingBase {

    LoginPageForBooking loginPageForBooking;

    @BeforeClass
    public void loadClasses(){
        loginPageForBooking = new LoginPageForBooking(driver);

    }
    @Test
    public void implementationBooking() throws InterruptedException{
        loginPageForBooking.implementLoginPage();

    }

}
