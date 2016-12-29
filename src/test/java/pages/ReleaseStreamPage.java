package pages;

import org.openqa.selenium.support.ui.Select;
import utilities.UiControl;

import static utilities.Utils.*;

/**
 * Created by spathare on 12/29/16.
 */
public class ReleaseStreamPage {

  public static void addReleaseStream() throws Exception {
      clickOn("addreleasestream");
      Thread.sleep(5000);
  }

  public static void backToReleaseStreams() throws Exception {
      clickOn("backtoreleasestream");
      waitForElement("addreleasestream",60);
      Thread.sleep(2000);
  }

  public static void backToRhelBranches() throws Exception {
      clickOn("backtorhelbranches");
      waitForElement("addbranch",60);
      Thread.sleep(2000);
  }

  public static void backToFedoraBranches() throws Exception {
      clickOn("backtofedorabranches");
      waitForElement("addbranch",60);
      Thread.sleep(2000);
  }


  public static void selectReleaseStream(String streamName) throws Exception {

      if(streamName.equalsIgnoreCase("rhel")){
          clickOn("rhelstream");
          waitForElement("backtoreleasestream",60);
          Thread.sleep(2000);
      }

      else if(streamName.equalsIgnoreCase("fedora")){
          clickOn("fedorastream");
          waitForElement("backtoreleasestream",60);
          Thread.sleep(2000);
      }

      else {
          clickOn("rhelstream");
          waitForElement("backtoreleasestream",60);
          Thread.sleep(2000);
      }

  }

  public static void addReleaseBranch() throws Exception {

      clickOn("addbranch");
      Thread.sleep(5000);

      UiControl.getWebElement("releasebranchname").sendKeys("master");

      Select select = new Select(UiControl.getWebElement("currentphase"));
      select.selectByIndex(1);
      Thread.sleep(2000);

      UiControl.getWebElement("calurl").sendKeys("calenderurl");

      clickOn("submitrelbranch");
      Thread.sleep(2000);

  }





}
