package tests;

import org.testng.annotations.Test;
import pages.SettingsPage;
import utilities.BaseClass;
import static pages.SignUpPage.*;

/**
 * Created by spathare on 1/3/17.
 */
public class signUpTest extends BaseClass {

    @Test
    public void signuptest() throws Exception {

        clickOnSignUp();
        signUp();

    }
}
