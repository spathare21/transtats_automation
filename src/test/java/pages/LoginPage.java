package pages;

import org.apache.log4j.Logger;
import org.apache.xalan.xsltc.compiler.util.Util;
import org.openqa.selenium.WebElement;
import utilities.UiControl;
import utilities.Utils;

import static utilities.Utils.waitForElement;

/**
 * Created by spathare on 12/27/16.
 */
public class LoginPage {
    public static String adminPage;
    //final static Logger logger = Logger.getLogger(LoginPage.class);
    public static void login() throws InterruptedException {

      UiControl.getWebElement("adminLogin").click();
      waitForElement("username",60);

      WebElement username = UiControl.getWebElement("username");
      username.sendKeys("transtats");

      WebElement password = UiControl.getWebElement("pwd");
      password.sendKeys("transtats");

      Utils.clickOn("signin");
      adminPage = UiControl.getWebDriver().getCurrentUrl();
    }

    public static void logout() throws Exception{
        UiControl.getWebDriver().get(adminPage);
        Utils.waitForElement("logout",60);
        Utils.clickOn("logout");
    }

    public static void viewTranstats() throws Exception {
        Utils.waitForElement("viewsite",60);
        Utils.clickOn("viewsite");
    }

}
