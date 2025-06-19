package AutomationCucumberFramework;

import io.cucumber.java.en.*;

public class LoginPageSteps {
    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("user_is_on_login_page");
    }

    @When("user enter valid credentials data")
    public void user_enter_valid_credentials_data() {
        System.out.println("user_enter_valid_credentials_data");
    }

    @When("user click on login")
    public void user_click_on_login() {
        System.out.println("user_click_on_login");
    }

    @Then("user verify number of products on the products page")
    public void user_verify_number_of_products_on_the_products_page() {
        System.out.println("user_verify_number_of_products_on_the_products_page");
    }

    @Then("user verify heading of the page")
    public void user_verify_heading_of_the_page() {
        System.out.println("user_verify_heading_of_the_page");
    }

    @When("user enter valid credentials data {string} and {string}")
    public void userEnterValidCredentialsDataAnd(String usn, String pasd) {
        System.out.println("username :: "+usn+" and password :: "+pasd);
    }
}
