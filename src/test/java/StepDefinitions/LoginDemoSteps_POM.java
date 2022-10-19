package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.loginPage;
import utils.Chrome;

public class LoginDemoSteps_POM {

//    Chrome chrome = new Chrome();
//    loginPage login;
//
//    WebDriver navigator = null;
//
//    @Given("user browser is open")
//    public void userBrowserIsOpen() {
//        System.out.println("Rodando PAGE OBJECTS");
//        System.out.println("Inside Step - browser is open");
//        navigator = chrome.createChrome();
//    }
//
//    @And("user is on login paga")
//    public void userIsOnLoginPaga() {
//
//        navigator.navigate().to("https://example.testproject.io/web");
//    }
//
//    @When("^user enters (.*) and (.*)$")
//    public void userEntersUsernameAndPassword(String username,String password) {
//
//        login = new loginPage(navigator);
//        login.enterUsername(username);
//        login.enterPassword(password);
//
////        navigator.findElement(By.id("name")).sendKeys(username);
////        navigator.findElement(By.id("password")).sendKeys(password);
//    }
//
//    @And("user clicks on login")
//    public void userClicksOnLogin() {
//
//        login.clickLogin();
//
////        navigator.findElement(By.id("login")).click();
//    }
//
//    @Then("user is navigated to the home page")
//    public void userIsNavigatedToTheHomePage() {
//
//        login.checkLogoutIsDisplayed();
//
////        navigator.findElement(By.id("logout")).isDisplayed();
//
//        chrome.closeChrome(navigator);
//        chrome.quitChrome(navigator);
//    }
}
