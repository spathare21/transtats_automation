package utilities;

import org.testng.annotations.*;

/**
 * Created by spathare on 12/16/16.
 */
public class BaseClass {

    public String env;
    public String browser;


    @BeforeTest
    public void beforeTest(){

        UiControl.getBrowser("firefox");
        UiControl.setUrl();
    }

    @AfterTest
    public void afterTest(){

        System.out.println("Closing browser");
        boolean hasQuit = (UiControl.getWebDriver().toString().contains("(null)")) ? true : false;
        if(!hasQuit) {
            UiControl.getWebDriver().close();
            UiControl.getWebDriver().quit();
        }

    }


}
