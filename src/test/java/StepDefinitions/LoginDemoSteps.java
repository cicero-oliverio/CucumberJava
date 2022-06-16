package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.CreateChrome;

public class LoginDemoSteps {

    CreateChrome createChrome = new CreateChrome();
    WebDriver navigator = null;

    @Given("user browser is open")
    public void userBrowserIsOpen() {
        System.out.println("Inside Step - browser is open");
        navigator = createChrome.createChrome();
    }

    @And("user is on login paga")
    public void userIsOnLoginPaga() {
        navigator.navigate().to("https://example.testproject.io/web");
    }

    @When("user enters username and password")
    public void userEntersUsernameAndPassword() {
        navigator.findElement(By.id("name")).sendKeys("Raghav");
        navigator.findElement(By.id("password")).sendKeys("12345");
    }

    @And("user clicks on login")
    public void userClicksOnLogin() {
        navigator.findElement(By.id("login")).click();
    }

    @Then("user is navigated to the home page")
    public void userIsNavigatedToTheHomePage() {
        navigator.findElement(By.id("logout")).isDisplayed();

        navigator.close();
        navigator.quit();
    }
}
