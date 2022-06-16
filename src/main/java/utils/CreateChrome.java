package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class CreateChrome {

    public WebDriver createChrome() {

        String sistema = System.getProperty("os.name");

        if (sistema.equals("Linux")) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        } else {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        }

        WebDriver navigator = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        navigator.manage().window().maximize();
        navigator.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navigator.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);

        return navigator;

    }

}

