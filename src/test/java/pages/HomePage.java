package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.UiControl;

import java.util.List;

import static pages.SettingsPage.languagesTab;
import static pages.SettingsPage.settings;
import static utilities.Utils.*;

/**
 * Created by spathare on 12/29/16.
 */
public class HomePage {

    public static void homePage() throws Exception {

        clickOn("homepage");
        waitForElement("trans_pos",60);
        Thread.sleep(2000);
    }

    public static void graphs() throws Exception {
        clickOn("trans_pos");
        Thread.sleep(2000);

    }

    public static void coverage() throws Exception{
        clickOn("trans_coverage");
        Thread.sleep(2000);
    }

    public static void selectPackage() throws Exception {

        Select selectpkg = new Select(UiControl.getWebElement("packagedropdown"));
        //selectpkg.selectByVisibleText();
        selectpkg.selectByIndex(1);
        Thread.sleep(5000);
    }

    public static void selectRule() throws Exception {
        Select selectrule = new Select(UiControl.getWebElement("rulenamedd"));
        //selectrule.selectByVisibleText();
        selectrule.selectByIndex(1);
        Thread.sleep(5000);
    }


    public static void getStats() throws Exception {

        List<WebElement> legends = UiControl.getWebElements("legends");
        System.out.println("Number of lagends/branches for the selected package are :" + legends.size());
        for(int i=0 ; i<legends.size();i++){
            System.out.println(legends.get(i).getText());
        }

        Thread.sleep(5000);
    }

    public static void adminPage() throws Exception {
          settings();
          languagesTab();

    }


}
