package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("Passo 1");
        // Write code here that turns the phrase above into concrete actions
    }

    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
        System.out.println("Passo 2");
        // Write code here that turns the phrase above into concrete actions
    }

    @And("clicks on login button")
    public void clicks_on_login_button() {
        System.out.println("Passo 3");
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        System.out.println("Passo 4");
        // Write code here that turns the phrase above into concrete actions
    }
}

