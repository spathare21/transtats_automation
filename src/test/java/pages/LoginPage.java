package pages;

import org.openqa.selenium.WebElement;
import utilities.UiControl;
import utilities.Utils;

/**
 * Created by spathare on 12/27/16.
 */
public class LoginPage {

    public static void loginButton() throws Exception{
        Utils.clickOn("login");
        Thread.sleep(2000);
    }

    public static void loginToTranstats() throws InterruptedException {
      WebElement email = UiControl.getWebElement("email");
      email.sendKeys("email_id");
      Thread.sleep(1000);

      WebElement password = UiControl.getWebElement("pwd");
      password.sendKeys("abcd");
      Thread.sleep(1000);

      Utils.clickOn("signin");
    }

    public static void logout(){

    }

}
