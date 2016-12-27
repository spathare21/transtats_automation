package tests;

import org.testng.annotations.Test;
import static pages.Packages.*;
import static utilities.Utils.clickOn;

import utilities.BaseClass;

/**
 * Created by spathare on 12/20/16.
 */
public class addPackageTests extends BaseClass{

    @Test
    public void packagetest(){
        System.out.println("in package test");
        clickOn("addpackages");
    }

}
