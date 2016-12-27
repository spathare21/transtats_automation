package pages;


import utilities.Utils;

import static utilities.Utils.*;

/**
 * Created by spathare on 12/20/16.
 */
public class SettingsPage {

    public static void settings() throws InterruptedException {
        clickOn("settings");
        waitForElement("summary",60);
        Thread.sleep(2000);
    }


    public static void summaryTab() throws InterruptedException {
        clickOn("summary");
        Thread.sleep(2000);
    }

    public static void packageTab() throws InterruptedException {
        clickOn("packages");
        waitForElement("addpackages",60);
        Thread.sleep(2000);
    }

    public static void releaseStreamTab() throws InterruptedException {
        clickOn("relstream");
        Thread.sleep(2000);
    }

    public static void languagesTab() throws InterruptedException {
        clickOn("languages");
        Thread.sleep(2000);
    }

    public static void transPlatformTab() throws InterruptedException {
        clickOn("transplatform");
        Thread.sleep(2000);
    }

    public static void jobsTab() throws InterruptedException {
        Utils.clickOn("jobs");
        Thread.sleep(2000);
    }

    public static void graphRuleTab() throws InterruptedException {
        clickOn("graphrule");
        Thread.sleep(2000);
    }

    public static void notificationTab() throws InterruptedException {

        clickOn("notification");
        Thread.sleep(2000);
    }

    public static void logsTab() throws InterruptedException {
        clickOn("logs");
        Thread.sleep(2000);
    }


}
