package Testng;

import org.testng.annotations.*;

public class TestNgPractice {
    @Test
    public void test1() {
        System.out.println("Test Case 1");
    }
    @Test
    public void test2() {
        System.out.println("Test Case 2");
    }
    @Test
    public void test3() {
        System.out.println("Test Case 3");
    }
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("This will Execute Before Method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("This will Execute After Method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("This will Execute Before Class Execution");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("This will Execute After Class Execution");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("This will Execute Before Test ");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("This will Execute After Test ");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("This will Execute Before Suite ");
    }
    @BeforeSuite
    public void beforeSuite1(){
        System.out.println("Before Suite");
    }


    @AfterSuite
    public void afterSuite() {
        System.out.println("This will Execute After Suite ");
    }

}
