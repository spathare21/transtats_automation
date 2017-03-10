package pages;

import utilities.UiControl;
import utilities.Utils;

import static pages.SettingsPage.*;
import static utilities.Utils.*;

/**
 * Created by spathare on 12/30/16.
 */
public class LanguagesTabPage {

    public static void addLangButton() throws Exception {
        clickOn("addlang");
        waitForElement("languages",60);
        Thread.sleep(2000);
    }

    public static void manageLanguage() throws Exception {
        settings();
        languagesTab();
        waitForElement("managelang",60);
        clickOn("managelang");
    }

    public static void addLanguage() throws Exception {
        if(Utils.isElementPresent(UiControl.getWebDriver(),"addlang")){
            clickOn("addlang");
        }

    }

    public static void getAllLang() throws Exception {

    }

    public static void addAlias() throws Exception {

    }

    public static void onOffLang() throws Exception {

    }



}
