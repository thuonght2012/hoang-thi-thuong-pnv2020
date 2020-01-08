package tests;

import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;
import runner.TestRunner;

public class ProviderTest {

    private static LoginPage loginPage;


    public static LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = PageFactory.initElements(TestRunner.driver, LoginPage.class);
        }
        return loginPage;
    }
}
