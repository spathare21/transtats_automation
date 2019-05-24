package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import static pages.PackagesTab.*;
import static pages.SettingsPage.*;
import utilities.BaseClass;
import utilities.UiControl;

import java.util.List;

/**
 * Created by spathare on 12/20/16.
 */
public class addPackageTests extends BaseClass{

    @Test
    public void successfullPackageTest()throws Exception {
        settings();
        packageTab();
        addPackage("abrt","https://github.com/abrt/abrt");
        Thread.sleep(2000);
        Assert.assertEquals(getPackageAlertText(),"Great! Package added successfully.", "Package Added successfully");
        backToPackagesList();
        List packages = getPackageList();
        for (int i= 0; i<packages.size();i++){
            System.out.println(packages.get(i).toString() + "\n");
        }

    }


    @Test
    public void unsuccessfullPackageAddTest() throws Exception{
       settings();
       packageTab();
       addPackage("candlepin","https://github.com/candlepin/candlepin");
       Thread.sleep(2000);
       Assert.assertEquals(UiControl.getWebElement("packageNameError").getText(), "Not found at selected translation platform", "Package does not exist on translation platform");
       backToPackagesList();

    }

}
