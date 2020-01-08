package tests;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest extends ProviderTest{
    @When("I choose account as (.*)")
    public void chooseAccount(String username) throws InterruptedException {
        Thread.sleep(3000);
        getLoginPage().setUserSelect(username);
    }
    @And("Click button Login")
    public void clickSubmit() throws InterruptedException {
        Thread.sleep(3000);
        getLoginPage().setBtnSubmit();
    }
    @Then("Verify information of user logged correctly")
    public void verifyInfoCorrect() throws InterruptedException {
        Thread.sleep(3000);
        getLoginPage().setCheckInfoLogin();
    }
}
