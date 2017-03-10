package pages;

import org.apache.xalan.xsltc.compiler.util.Util;
import org.openqa.selenium.WebElement;
import utilities.UiControl;
import utilities.Utils;

/**
 * Created by spathare on 12/27/16.
 */
public class LoginPage {
    public static String adminPage;

      public static void login() throws InterruptedException {
      WebElement username = UiControl.getWebElement("username");
      username.sendKeys("transtats");
      Thread.sleep(1000);

      WebElement password = UiControl.getWebElement("pwd");
      password.sendKeys("transtats");
      Thread.sleep(1000);

      Utils.clickOn("signin");
      Thread.sleep(2000);
      adminPage = UiControl.getWebDriver().getCurrentUrl();
    }

    public static void logout() throws Exception{
        UiControl.getWebDriver().get(adminPage);
        Utils.waitForElement("logout",60);
        Utils.clickOn("logout");
        Thread.sleep(5000);
    }

    public static void viewTranstats() throws Exception {
        Utils.waitForElement("viewsite",60);
        Utils.clickOn("viewsite");
        Thread.sleep(2000);
    }

}
