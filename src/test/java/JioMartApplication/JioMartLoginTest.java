package JioMartApplication;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JioMartLoginTest extends JioMartBase {
    JioMartLoginPage jioMartLoginPage;
    JioMartPaneerProduct jioMartPaneerProduct;

    @BeforeClass
    public void initializePage(){
        jioMartLoginPage = new JioMartLoginPage(driver);
        jioMartPaneerProduct = new JioMartPaneerProduct(driver);

    }
    @Test
    public void VerifyTheLoginCredentials() throws InterruptedException {
        jioMartLoginPage.loginAsUser("7989195677");
        jioMartPaneerProduct.purchasePaneerProduct();
    }

    @Test
    public void VerifyWithoutCredentials() throws InterruptedException{
        jioMartPaneerProduct.purchasePaneerProduct();
    }
}
