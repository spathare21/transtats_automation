package pages;

import static utilities.UiControl.*;

/**
 * Created by spathare on 12/30/16.
 */
public class SignUpPage {

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
