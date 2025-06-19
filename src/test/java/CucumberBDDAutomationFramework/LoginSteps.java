package CucumberBDDAutomationFramework;
import io.cucumber.java.en.*;

public class LoginSteps {

    @Given("user is on login screen")
    public void user_is_on_login_screen() {
        System.out.println("user_is_on_login_screen");
    }

    @When("user enter valid credentials")
    public void user_enter_valid_credentials() {
        System.out.println("user_enter_valid_credentials");
    }

    @When("user click on login button")
    public void user_click_on_login_button() {
        System.out.println("user_click_on_login_button");
    }

    @Then("user verify number of products on the products screen")
    public void user_verify_number_of_products_on_the_products_screen() {
        System.out.println("user_verify_number_of_products_on_the_products_screen");
    }

    @Then("user verify heading of the screen")
    public void user_verify_heading_of_the_screen() {
        System.out.println("user_verify_heading_of_the_screen");
    }

    @When("user enter valid credentials {string} and {string}")
    public void userEnterValidCredentialsAnd(String un, String pwd) {
        System.out.println("username :: " + un + " and password :: " + pwd);
    }
}
