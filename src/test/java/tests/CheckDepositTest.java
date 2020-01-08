package tests;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;

public class CheckDepositTest extends ProviderTest {
    @When("I can login successfully with account as (.*)")
    public void loginSuccess(String username) throws InterruptedException {
        Thread.sleep(3000);
        getLoginPage().setUserSelect(username);
        Thread.sleep(3000);
        getLoginPage().setBtnSubmit();
        Thread.sleep(3000);
        getLoginPage().setCheckInfoLogin();
        Thread.sleep(3000);
        getLoginPage().setCheckLoginSuccess();
    }
    @And("I click Deposit button")
    public void clickDeposit() throws InterruptedException {
        Thread.sleep(3000);
        getCheckDepositPage().setBtnDeposit();
    }
    @And("I input Amount to be Deposited as (.*)")
    public void inputDeposit(String deposit) throws InterruptedException {
        Thread.sleep(3000);
        getCheckDepositPage().setInputAmount(deposit);
    }
}
