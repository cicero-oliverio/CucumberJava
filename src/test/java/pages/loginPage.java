package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

    protected WebDriver navigator;

    private By txt_username = By.id("name");
    private By txt_password = By.id("password");
    private By btn_login = By.id("login");

    private By btn_loggout = By.id("logout");

    public loginPage(WebDriver navigator) {

        this.navigator = navigator;

        if (!navigator.getTitle().equals("TestProject Demo")) {
            navigator.close();
            navigator.quit();
            throw new IllegalStateException("This is not LoginPage,the current page is " + navigator.getCurrentUrl());
        }
    }

    public void enterUsername(String username){
        navigator.findElement(txt_username).sendKeys(username);
    }

    public void enterPassword(String password){
        navigator.findElement(txt_password).sendKeys(password);
    }

    public void clickLogin(){
        navigator.findElement(btn_login).click();
    }

    public void checkLogoutIsDisplayed(){
        navigator.findElement(btn_loggout).isDisplayed();
    }

    public void loginValidUser(String username,String password){
        navigator.findElement(txt_username).sendKeys(username);
        navigator.findElement(txt_password).sendKeys(password);
        navigator.findElement(btn_login).click();
    }
}
