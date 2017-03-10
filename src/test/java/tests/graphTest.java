package tests;

import org.testng.annotations.Test;
import utilities.BaseClass;

import static pages.HomePage.*;

/**
 * Created by spathare on 12/30/16.
 */
public class graphTest extends BaseClass {

    @Test
    public void graphtest1() throws Exception {
        homePage();
        graphs();
        selectPackage();
        getStats();

        coverage();
        selectRule();
        getStats();

    }

}
