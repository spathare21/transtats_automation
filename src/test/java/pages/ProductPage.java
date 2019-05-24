package pages;

import org.openqa.selenium.support.ui.Select;
import utilities.UiControl;

import static utilities.Utils.*;

/**
 * Created by spathare on 12/29/16.
 */
public class ProductPage {


  public static void manageRelStream() throws Exception {
      clickOn("managerelstream");
      Thread.sleep(2000);
  }

  public static void addProduct() throws Exception {
      clickOn("addProduct");
  }

  public static void backToProduct() throws Exception {
      clickOn("backToProduct");
      waitForElement("addProduct",60);
  }

  public static void backToFedoraBranches() throws Exception {
      clickOn("backToFedoraRelease");
      waitForElement("addRelease",60);
  }


  public static void addRelease() throws Exception {

      clickOn("addRelease");
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
