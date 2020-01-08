package tests;

import org.openqa.selenium.support.PageFactory;
import pages.CheckDepositPage;
import pages.LoginPage;
import runner.TestRunner;

public class ProviderTest {

    private static LoginPage loginPage;
    private static CheckDepositPage checkDepositPage;


    public static LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = PageFactory.initElements(TestRunner.driver, LoginPage.class);
        }
        return loginPage;
    }
    public static CheckDepositPage getCheckDepositPage() {
        if (checkDepositPage == null) {
            checkDepositPage = PageFactory.initElements(TestRunner.driver, CheckDepositPage.class);
        }
        return checkDepositPage;
    }
}
