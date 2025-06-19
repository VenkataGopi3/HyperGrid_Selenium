package CogmentoApplication.Framework;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class CogmentoLoginTest extends CogmentoBase{

    CogmentoLoginPage cogmentoLoginPage;
    CogmentoCalendar cogmentoCalendar;
    CogmentoContacts cogmentoContacts;

    @BeforeClass
    public void initializePage(){
        cogmentoLoginPage = new CogmentoLoginPage(driver);
        cogmentoCalendar = new CogmentoCalendar(driver);
        cogmentoContacts = new CogmentoContacts(driver);

    }

    @Test
    public void VerifyTheCredentials() throws InterruptedException{
        cogmentoLoginPage.loginAsUser("bablu19735@gmail.com", "Bablu@333");
        cogmentoCalendar.calendarImplmentation();
        Thread.sleep(5000);
        cogmentoContacts.implementationContacts();
    }


}
