package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

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

    public static List<WebElement> getWebElements(String locatorName){

        List<WebElement> webElements = null;

        locators = new Locators("./src/test/resources/locators.properties");

        webElements = UiControl.getWebDriver().findElements(locators.getbjectLocator(locatorName));

        return webElements;

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

    public static void setUrl(String env) throws Exception{

        String applicationUrl = ReadProperty.getConfig(env);
        UiControl.getWebDriver().get(applicationUrl);

    }

    public static void maxBrowser(){
        UiControl.getWebDriver().manage().window().maximize();
    }


}
