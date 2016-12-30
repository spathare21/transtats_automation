package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.UiControl;

import java.util.List;

import static utilities.Utils.*;

/**
 * Created by spathare on 12/29/16.
 */
public class HomePage {

    public static void homePage() throws Exception {

        clickOn("homepage");
        waitForElement("graphtab",60);
        Thread.sleep(2000);
    }

    public static void graphs() throws Exception {
        clickOn("graphtab");
        Thread.sleep(2000);

    }

    public static void comparison() throws Exception{
        clickOn("comparetab");
        Thread.sleep(2000);
    }

    public static void selectPackage() throws Exception {

        Select selectpkg = new Select(UiControl.getWebElement("packagedropdown"));
        //selectpkg.selectByVisibleText();
        selectpkg.selectByIndex(1);
        Thread.sleep(5000);
    }

    public static void viewBasedOnGraphRule() throws Exception {
        clickOn("basedongraphrule");
        Thread.sleep(2000);
    }

    public static void viewPackageWise() throws Exception{
        clickOn("packagewise");
        Thread.sleep(2000);
    }


    public static void getStats() throws Exception {

        List<WebElement> legends = UiControl.getWebElements("legends");
        for(int i=1 ; i<=legends.size();i++){
            System.out.println(legends.get(i).getText());
        }

        Thread.sleep(5000);
    }


}
