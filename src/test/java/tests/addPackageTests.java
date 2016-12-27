package tests;

import org.testng.annotations.Test;

import static pages.PackagesTab.*;
import static pages.SettingsPage.*;

import pages.SettingsPage;
import utilities.BaseClass;

/**
 * Created by spathare on 12/20/16.
 */
public class addPackageTests extends BaseClass{

    @Test
    public void packagetest()throws Exception {
        System.out.println("in package test");
        settings();
        packageTab();
        addPackageButton();
        addPackage();

    }

}
