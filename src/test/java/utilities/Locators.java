package utilities;

import org.openqa.selenium.By;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by spathare on 12/16/16.
 */
public class Locators {

    private FileInputStream stream;
    private String RepositoryFile;
    private Properties propertyFile = new Properties();

    public static enum ElementLocator {
        className, xpath, id, LINK, CSS, NAME,TagName
    }

    public Locators(String fileName)
    {
        try {
            this.RepositoryFile = fileName;
            stream = new FileInputStream(RepositoryFile);
            propertyFile.load(stream);
        }
        catch (IOException io){
            io.printStackTrace();
        }
    }

    public By getbjectLocator(String locatorName)
    {
        String locatorProperty = propertyFile.getProperty(locatorName);
        //System.out.println(locatorProperty.toString());
        String locatorType1 = locatorProperty.split(":")[0];
        String locatorValue = locatorProperty.split(":")[1];

        ElementLocator locatorType = ElementLocator.valueOf(locatorType1);

        By locator = null;
        switch(locatorType)
        {
            case id:
                locator = By.id(locatorValue);
                break;
            case className:
                locator = By.className(locatorValue);
                break;
            case NAME:
                locator = By.name(locatorValue);
                break;
            case CSS:
                locator = By.cssSelector(locatorValue);
                break;
            case LINK:
                locator = By.linkText(locatorValue);
                break;
            case TagName:
                locator = By.tagName(locatorValue);
                break;
            case xpath:
                locator = By.xpath(locatorValue);
                break;
        }
        return locator;
    }

}
