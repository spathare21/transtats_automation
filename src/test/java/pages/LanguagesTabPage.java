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
        waitForElement("locale_id",60);
        Thread.sleep(2000);
    }

    public static void EditLanguage() throws Exception {
        settings();
        languagesTab();
        waitForElement("editlang",60);
        clickOn("editlang");
    }

    public static void addLanguage() throws Exception {
        UiControl.getWebElement("locale_id").sendKeys();

        UiControl.getWebElement("lang_name").sendKeys();

        UiControl.getWebElement("locale_alias").sendKeys();

        UiControl.getWebElement("enable").click();

        UiControl.getWebElement("save_lang").click();

    }

    public static void getAllLang() throws Exception {

    }


}
