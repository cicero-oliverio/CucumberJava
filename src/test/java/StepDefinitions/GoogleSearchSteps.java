package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Chrome;

public class GoogleSearchSteps {

    Chrome chrome = new Chrome();
    public WebDriver navigator = chrome.createChrome();
    public String baseUrl = "https://www.google.com";


    @Given("browser is open")
    public void browser_is_open() {
        System.out.println("Inside Step - browser is open");
    }

    @And("user is on google search page")
    public void user_is_on_google_search_page() {
        System.out.println("Inside Step - user is on google search page");
        navigator.get(baseUrl);
    }

    @When("user enters a text in search box")
    public void user_enters_a_text_in_search_box() {
        System.out.println("Inside Step - user enters a text in search box");
        WebElement searchbox = navigator.findElement(By.name("q"));
        searchbox.sendKeys("Automation Step by Step");
    }

    @And("hits enter")
    public void hits_enter() {
        System.out.println("Inside Step - hits enter");
        WebElement searchbox = navigator.findElement(By.name("q"));
        searchbox.sendKeys(Keys.ENTER);
    }

    @Then("user is navigated to search results")
    public void user_is_navigated_to_search_results() {
        System.out.println("user is navigated to search results");
        navigator.getPageSource().contains("Online Courses");
        navigator.close();
        navigator.quit();
    }
}
