package tests;

import org.testng.annotations.Test;
import utilities.BaseClass;

import java.util.List;
import static pages.GraphRuleTab.*;
import static pages.SettingsPage.*;

/**
 * Created by spathare on 12/29/16.
 */
public class addGraphRuleTest extends BaseClass{

    @Test
    public void graphruletest() throws InterruptedException {
        System.out.println("Adding graph rule");
        settings();
        graphRuleTab();
        addGraphRuleButton();
        addGraphRule();
        backToGraphRuleList();
        List rules = getGraphRules();
        for (int i= 0; i<rules.size();i++){
            System.out.println(rules.get(i).toString());
        }

    }

}
