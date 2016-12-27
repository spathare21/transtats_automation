package pages;


import utilities.Utils;

/**
 * Created by spathare on 12/20/16.
 */
public class SettingsPage {

    public static void settings(){
        Utils.clickOn("settings");
    }


    public static void summaryTab() throws InterruptedException {
        Utils.clickOn("summary");
        Thread.sleep(2000);
    }

    public static void packageTab() throws InterruptedException {
        Utils.clickOn("packages");
        Thread.sleep(2000);
    }

    public static void releaseStreamTab() throws InterruptedException {
        Utils.clickOn("relstream");
        Thread.sleep(2000);
    }

    public static void languagesTab() throws InterruptedException {
        Utils.clickOn("languages");
        Thread.sleep(2000);
    }

    public static void transPlatformTab() throws InterruptedException {
        Utils.clickOn("transplatform");
        Thread.sleep(2000);
    }

    public static void jobsTab() throws InterruptedException {
        Utils.clickOn("jobs");
        Thread.sleep(2000);
    }

    public static void graphRuleTab() throws InterruptedException {
        Utils.clickOn("graphrule");
        Thread.sleep(2000);
    }

    public static void notificationTab() throws InterruptedException {

        Utils.clickOn("notification");
        Thread.sleep(2000);
    }

    public static void logsTab() throws InterruptedException {
        Utils.clickOn("logs");
        Thread.sleep(2000);
    }


}
