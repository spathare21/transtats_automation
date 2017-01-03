package pages;

import static utilities.UiControl.*;
import static utilities.Utils.*;

/**
 * Created by spathare on 12/30/16.
 */
public class SignUpPage {


    public static void clickOnSignUp() throws Exception {
        clickOn("signup");
        waitForElement("username",60);
        Thread.sleep(2000);

    }

    public static void signUp() throws Exception {

        getWebElement("username").sendKeys("demo_foo");
        Thread.sleep(2000);
        getWebElement("userpwd").sendKeys("abcdef");
        Thread.sleep(2000);
        getWebElement("projectname").sendKeys("demo_project");
        Thread.sleep(1000);
        getWebElement("transplatformproject").sendKeys("test123");
        getWebElement("agreeterms").click();
        Thread.sleep(1000);
        getWebElement("submit").click();
    }


}
