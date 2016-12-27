package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import utilities.UiControl;
import utilities.Utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by spathare on 12/27/16.
 */
public class PackagesTab {


    public static void addPackageButton() throws InterruptedException {
        Utils.clickOn("addpackages");
        Thread.sleep(2000);
    }

    public static void backToPackagesList() throws InterruptedException {
        Utils.clickOn("backtopkglist");
        Thread.sleep(2000);
    }

    public static void addPackage() throws InterruptedException {

        UiControl.getWebElement("packagename").sendKeys("demo");
        Thread.sleep(1000);

        UiControl.getWebElement("upstream_url").sendKeys("http://demo.com");
        Thread.sleep(1000);

        Select select = new Select(UiControl.getWebElement("translationplatform"));
        select.selectByIndex(1);
        Thread.sleep(2000);


        if(!UiControl.getWebElement("rhelrelstream").isSelected()){
            UiControl.getWebElement("rhelrelstream").click();
        }

        if(!UiControl.getWebElement("langsetdefault").isSelected()){
            UiControl.getWebElement("langsetdefault").click();
        }

        if(!UiControl.getWebElement("updatetransstats").isSelected()){
            UiControl.getWebElement("updatetransstats").click();
        }

        Thread.sleep(2000);
        Utils.clickOn("addpackage");
        Thread.sleep(2000);

    }

    public static void resetPackagefield() throws InterruptedException {
        Utils.clickOn("reset");
        Thread.sleep(2000);
    }

    public static List<String> getPackageList(){

        List<String> packages = new ArrayList<String>();

        List packagelist = UiControl.getWebDriver().findElements(By.xpath(".//*[@id='packages-table']/tbody/tr"));
        System.out.println("Number of packages in Package List are : " + packagelist.size());

        for(int i = 0; i < packagelist.size();i++){
           packages.add(UiControl.getWebDriver().findElement(By.xpath(".//*[@id='packages-table']/tbody/tr["+ i +"]/td["+ i+ "]")).getText());
        }

     return packages;

    }

    public static void editPackage(String packageName){
        String pkgname;
        List packagelist = UiControl.getWebDriver().findElements(By.xpath(".//*[@id='packages-table']/tbody/tr"));

        for(int i = 0; i < packagelist.size();i++){
            pkgname = "";
            pkgname = UiControl.getWebDriver().findElement(By.xpath(".//*[@id='packages-table']/tbody/tr["+ i +"]/td["+ i+ "]")).getText();
            if(pkgname.equalsIgnoreCase(packageName)){
                UiControl.getWebDriver().findElement(By.xpath(".//*[@id='packages-table']/tbody/tr["+ i +"]//span[contains(@class,'glyphicon-pencil')]")).click();
            }
        }

    }

    public static void deletePackage(String packageName){

        List packagelist = UiControl.getWebDriver().findElements(By.xpath(".//*[@id='packages-table']/tbody/tr"));

        for(int i = 0; i < packagelist.size();i++) {
          if(UiControl.getWebDriver().findElement(By.xpath(".//*[@id='packages-table']/tbody/tr["+ i +"]/td["+ i+ "]")).getText().equalsIgnoreCase(packageName)) {
              UiControl.getWebDriver().findElement(By.xpath(".//*[@id='packages-table']/tbody/tr[" + i + "]//span[contains(@class,'glyphicon-trash')]")).click();
          }
        }

    }


}
