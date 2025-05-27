package Testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class TestngAnnotations {

    WebDriver driver;
     @BeforeSuite
    public void launchBrowser(){
         System.out.println("Launched Browser");
         //driver = new ChromeDriver();
     }

     @Test
    public void login(){
         System.out.println("Login Successfully");
     }

     @BeforeTest
    public void launchApplication(){
         System.out.println("Application Launched");
     }

     @BeforeClass
    public void FirstClass(){
         System.out.println("FirstClass is created");
     }

     @BeforeMethod
    public void FirstMethod(){
         System.out.println("First Method is implemented");
     }

     @Test
    public void logout(){
         System.out.println("Logged out Successfully");
     }


}
