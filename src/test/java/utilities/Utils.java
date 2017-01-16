package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

/**
 * Created by spathare on 12/20/16.
 */

public class Utils {

      public static void clickOn(String elementName){

        UiControl.getWebElement(elementName).click();

    }

    public static WebDriverWait waitForElement(String element,int timeout){

        return new WebDriverWait(UiControl.getWebDriver(),timeout);

    }

    public static boolean isElementPresent(WebDriver driver,String elementName) {
        WebElement element;
        try {
            element = UiControl.getWebElement(elementName);

        } catch (NoSuchElementException e) {
            return false;
        }
        return true;
    }


    public static void closeSubTabs()
    {
        String originalWin = UiControl.getWebDriver().getWindowHandle();
        for(String handle : UiControl.getWebDriver().getWindowHandles()) {
            if (!handle.equals(originalWin)) {
                UiControl.getWebDriver().switchTo().window(handle);
                UiControl.getWebDriver().close();
            }
        }
        UiControl.getWebDriver().switchTo().window(originalWin);
    }

    public static String getScreenShot(String Screenshotname) {

        try {
            TakesScreenshot ts = (TakesScreenshot) UiControl.getWebDriver();
            File source = ts.getScreenshotAs(OutputType.FILE);
            String dest = "./target/screenshots/" + Screenshotname + ".png";
            String imgname = Screenshotname + ".png";
            File destination = new File(dest);
            FileUtils.copyFile(source, destination);
            System.out.println("\n Screenshot Taken Successfully...!!!");
            return destination.getAbsolutePath();
        } catch (Exception e) {
            System.out.println(" \n Exception while taking scren shot: " + e.getMessage());
            return e.getMessage();
        }

    }


    public static void scrollTo(String element) {
        WebElement elem = UiControl.getWebElement(element);
        ((JavascriptExecutor) UiControl.getWebDriver()).executeScript(
                "arguments[0].scrollIntoView();", elem);
    }

    public static String readPropertyOrEnv(String key, String defaultValue) {
        String v = System.getProperty(key);
        if (v == null)
            v = System.getenv(key);
        if (v == null)
            v = defaultValue;
        return v;
    }


}
