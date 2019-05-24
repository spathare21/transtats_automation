package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;

/**
 * Created by spathare on 12/28/17.
 */
public class test {
    WebDriver driver;
    public WebDriver getDriver(String locale){
        System.setProperty("webdriver.chrome.driver", "./src/lib/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--test-type");
        options.addArguments("--lang=" + locale);
        return new ChromeDriver(options);
    }

    @Test
    public void initializeSelenium() throws Exception{
        driver = getDriver("es"); // two letters to represent the locale, or two letters + country
        driver.manage().window().maximize();
        driver.get("http://google.com");
    }

    @DataProvider()
    public Object[][] data() {

    }
}
