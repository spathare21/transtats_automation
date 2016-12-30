package tests;

import org.testng.annotations.Test;
import static pages.HomePage.*;

/**
 * Created by spathare on 12/30/16.
 */
public class graphTest {

    @Test
    public void graphtest1() throws Exception {
        homePage();
        graphs();
        viewPackageWise();
        selectPackage();
        getStats();

        viewBasedOnGraphRule();
        selectPackage();
        getStats();

    }

}
