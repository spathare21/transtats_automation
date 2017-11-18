package tests;

import org.testng.annotations.Test;

import static pages.LoginPage.login;
import static pages.LoginPage.viewTranstats;
import static pages.PackagesTab.*;
import static pages.SettingsPage.*;

import pages.LoginPage;
import utilities.BaseClass;
import java.util.List;

/**
 * Created by spathare on 12/20/16.
 */
public class addPackageTests extends BaseClass{

    @Test
    public void packagetest()throws Exception {
        System.out.println("in package test");
        login();
        viewTranstats();
        settings();
        packageTab();
        addPackage();
        backToPackagesList();
        List packages = getPackageList();
        for (int i= 0; i<packages.size();i++){
            System.out.println(packages.get(i).toString() + "\n");
        }

    }

}
