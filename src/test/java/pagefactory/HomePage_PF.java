package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Clock;

public class HomePage_PF {

    @FindBy(id = "logout")
    WebElement btn_logout;

    WebDriver navigator;

    public HomePage_PF(WebDriver navigator){
        this.navigator = navigator;
        PageFactory.initElements(navigator, this);
    }

    public void checkLogoutIsDisplayed(){

        btn_logout.isDisplayed();
    }

}
