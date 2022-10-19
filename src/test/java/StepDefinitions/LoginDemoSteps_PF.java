package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pagefactory.HomePage_PF;
import pagefactory.LoginPage_PF;
import utils.Chrome;

public class LoginDemoSteps_PF {

    Chrome chrome = new Chrome();
    WebDriver navigator = null;
    LoginPage_PF login;
    HomePage_PF home;

    @Given("user browser is open")
    public void userBrowserIsOpen() {
        System.out.println(" === I am inside LoginDemoSteps_PF class ===");
        System.out.println("Inside Step - browser is open");
        navigator = chrome.createChrome();
    }

    @And("user is on login paga")
    public void userIsOnLoginPaga() {
        navigator.navigate().to("https://example.testproject.io/web");
    }

    @When("^user enters (.*) and (.*)$")
    public void userEntersUsernameAndPassword(String username,String password) {

        login = new LoginPage_PF(navigator);

        login.enterUsername(username);
        login.enterPassword(password);

//        navigator.findElement(By.id("name")).sendKeys(username);
//        navigator.findElement(By.id("password")).sendKeys(password);

    }

    @And("user clicks on login")
    public void userClicksOnLogin() {

        login.clickOnLogin();
//        navigator.findElement(By.id("login")).click();
    }

    @Then("user is navigated to the home page")
    public void userIsNavigatedToTheHomePage() {
        home = new HomePage_PF(navigator);
        home.checkLogoutIsDisplayed();

//        navigator.findElement(By.id("logout")).isDisplayed();
        navigator.close();
        navigator.quit();
    }
}
