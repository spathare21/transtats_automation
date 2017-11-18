package pages;


import utilities.Utils;

import static utilities.Utils.*;

/**
 * Created by spathare on 12/20/16.
 */
public class SettingsPage {


    public static void settings() throws InterruptedException {
        clickOn("settings");
        waitForElement("addlang",60);
    }

    public static void statsPage() throws Exception {
        clickOn("graphhome");
        waitForElement("translation_status",60);
    }

    public static void packageTab() throws InterruptedException {
        clickOn("packages");
        waitForElement("addpackages",60);
    }

    public static void productsTab() throws InterruptedException {
        clickOn("products");
        waitForElement("addProduct",60);
    }

    public static void languagesTab() throws InterruptedException {
        clickOn("languages");
        waitForElement("addlang",60);
    }

    public static void transPlatformTab() throws InterruptedException {
        clickOn("transplatform");
        waitForElement("addTPinstance",60);
    }

}
