package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by spathare on 12/27/16.
 */

public class UiControl {

    private static WebDriver driver;
    private static Locators locators;

    public static WebDriver getWebDriver(){
        return driver;
    }

    public static WebElement getWebElement(String locatorName) {

        WebElement webElement = null ;

        locators = new Locators("./src/test/resources/locators.properties");

        webElement = UiControl.getWebDriver().findElement(locators.getbjectLocator(locatorName));

        return webElement;

    }

    public static WebDriver getBrowser(String browserName){

        switch(browserName){
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "./src/lib/geckodriver");
                driver = new FirefoxDriver();
                break;

            case "chrome":
                System.setProperty("webdriver.chrome.driver", "./src/lib/chromedriver");
                driver = new ChromeDriver();
                break;
        }
        return driver;


    }

    public static void setUrl(){
        String appUrl = "http://transtats.devlab.redhat.com/settings/packages";
        UiControl.getWebDriver().get(appUrl);
    }

    public static void maxBrowser(){
        UiControl.getWebDriver().manage().window().maximize();
    }


}