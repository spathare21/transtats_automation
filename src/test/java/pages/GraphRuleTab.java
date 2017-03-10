package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.UiControl;
import utilities.Utils;

import java.util.ArrayList;
import java.util.List;

import static utilities.Utils.*;

/**
 * Created by spathare on 12/28/16.
 */
public class GraphRuleTab {

    public static void addGraphRuleButton() throws InterruptedException {
        Thread.sleep(5000);
        clickOn("addgraphrule");
        waitForElement("rulename",60);
        Thread.sleep(5000);
    }

    public static void backToGraphRuleList() throws InterruptedException {
        clickOn("backtogrulelist");
        waitForElement("addgraphrule",60);
        Thread.sleep(2000);
    }

    public static List<String> getGraphRules(){

        List<String> graphRules = new ArrayList<String>();

        List packagelist = UiControl.getWebDriver().findElements(By.xpath(".//*[@id='packages-table']/tbody/tr"));
        System.out.println("Number of rules in Graph Rule List are : " + packagelist.size());

        for(int i = 1; i <= packagelist.size();i++){
            graphRules.add(UiControl.getWebDriver().findElement(By.xpath(".//*[@id='packages-table']/tbody/tr["+ i +"]/td[1]")).getText());
        }

        return graphRules;


    }

    public static void editGraphRule(String graphRuleName){
        String rulename;
        List<WebElement> rulelist = UiControl.getWebDriver().findElements(By.xpath(".//*[@id='packages-table']/tbody/tr"));

        for(int i = 1; i <= rulelist.size();i++){
            rulename = "";
            rulename = UiControl.getWebDriver().findElement(By.xpath(".//*[@id='packages-table']/tbody/tr["+ i +"]/td[1]")).getText();
            if(rulename.equalsIgnoreCase(graphRuleName)){
                UiControl.getWebDriver().findElement(By.xpath(".//*[@id='packages-table']/tbody/tr["+ i +"]//span[contains(@class,'glyphicon-pencil')]")).click();
            }
        }

    }

    public static void deleteGraphrule(String graphRuleName){

        List ruleslist = UiControl.getWebDriver().findElements(By.xpath(".//*[@id='packages-table']/tbody/tr"));

        for(int i = 1; i <= ruleslist.size();i++) {
            if(UiControl.getWebDriver().findElement(By.xpath(".//*[@id='packages-table']/tbody/tr["+ i +"]/td[1]")).getText().equalsIgnoreCase(graphRuleName)) {
                UiControl.getWebDriver().findElement(By.xpath(".//*[@id='packages-table']/tbody/tr[" + i + "]//span[contains(@class,'glyphicon-trash')]")).click();
            }
        }

    }

    public static void addGraphRule() throws InterruptedException {

        UiControl.getWebElement("rulename").sendKeys(" ");

        Select select = new Select(UiControl.getWebElement("rulereleasebranch"));
        select.selectByIndex(0);
        Thread.sleep(2000);

        List<WebElement> rulePackages = UiControl.getWebElements("rulepackages");
        rulePackages.get(0).click();

        List<WebElement> ruleLanguages = UiControl.getWebElements("rulelanguages");
        ruleLanguages.get(1).click();

        clickOn("submitgraphrule");
        Thread.sleep(2000);

    }


    public static void resetGraphRuleField() throws InterruptedException {
        Utils.clickOn("reset");
        Thread.sleep(2000);
    }

}
