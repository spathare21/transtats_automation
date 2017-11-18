package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import utilities.UiControl;
import utilities.Utils;

import java.util.ArrayList;
import java.util.List;

import static utilities.Utils.*;

/**
 * Created by spathare on 12/27/16.
 */
public class PackagesTab {


    public static void addPackageButton() throws InterruptedException {
        waitForElement("addpackages",60);
        clickOn("addpackages");
        waitForElement("packagename",60);
    }

    public static void backToPackagesList() throws InterruptedException {
        clickOn("backtopkglist");
        waitForElement("addpackages",60);
    }

    public static void addPackage() throws InterruptedException {

        addPackageButton();

        UiControl.getWebElement("packagename").sendKeys("demo");

        UiControl.getWebElement("upstream_url").sendKeys("http://demo.com");

        Select select = new Select(UiControl.getWebElement("translationplatform"));
        select.selectByIndex(1);


        if(!UiControl.getWebElement("rhelrelstream").isSelected()){
            UiControl.getWebElement("rhelrelstream").click();
        }

        if(!UiControl.getWebElement("updatestats").isSelected()){
            UiControl.getWebElement("updatestats").click();
        }

        Utils.clickOn("addpackage");
    }

    public static void resetPackagefield() throws InterruptedException {
        Utils.clickOn("reset");
    }

    public static List<String> getPackageList(){

        List<String> packages = new ArrayList<String>();

        List packagelist = UiControl.getWebDriver().findElements(By.xpath(".//*[@id='packages-table']/tbody/tr"));
        System.out.println("Number of packages in Package List are : " + packagelist.size());

        for(int i = 1; i <= packagelist.size();i++){
           packages.add(UiControl.getWebDriver().findElement(By.xpath(".//*[@id='packages-table']/tbody/tr["+ i +"]/td[1]")).getText());
        }

     return packages;

    }

    public static void PackageDetails(String packageName){
        String pkgname;
        List packagelist = UiControl.getWebDriver().findElements(By.xpath(".//*[@id='packages-table']/tbody/tr"));

        for(int i = 1; i <= packagelist.size();i++){
            pkgname = "";
            pkgname = UiControl.getWebDriver().findElement(By.xpath(".//*[@id='packages-table']/tbody/tr["+ i +"]/td[1]")).getText();
            if(pkgname.equalsIgnoreCase(packageName)){
                UiControl.getWebDriver().findElement(By.xpath(".//*[@id='packages-table']/tbody/tr["+ i +"]/td[1]")).click();
            }
        }

    }


}
