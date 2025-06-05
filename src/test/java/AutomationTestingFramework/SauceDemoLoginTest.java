package AutomationTestingFramework;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SauceDemoLoginTest extends SauceDemoApplicationBase{
    SauceDemoLoginPage sauceDemoLoginPage;
    SauceDemoProducts sauceDemoProducts;


    @BeforeClass
    public void initializePages(){
        sauceDemoLoginPage = new SauceDemoLoginPage(driver);
        sauceDemoProducts = new SauceDemoProducts(driver);

    }

    @Test
    public void verifyLoginWithValidCredentials() {
        sauceDemoLoginPage.sauceLabDemoLogin("standard_user","secret_sauce");
        String productsPageHeading = sauceDemoProducts.getProductsHeading();
        int numberOfProducts = sauceDemoProducts.getProductsLabel();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(productsPageHeading, "Products", "Products page heading is not as expected");
        softAssert.assertTrue(numberOfProducts == 6, "Number of products is not as expected");
        softAssert.assertAll();
    }
}
