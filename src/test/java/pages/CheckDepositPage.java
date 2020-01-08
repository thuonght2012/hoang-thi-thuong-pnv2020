package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class CheckDepositPage {
    @FindBy(xpath = "//button[contains(text(),'Deposit')]")
    WebElement btnDeposit;
    @FindBy(xpath = "//div[4]//form//input")
    WebElement inputAmount;

    public void setBtnDeposit(){
        btnDeposit.click();
    }
    public void setInputAmount(String deposit){
        inputAmount.clear();
        inputAmount.sendKeys(deposit);
    }


    @FindBy(id = "userSelect")
    WebElement userSelect;
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement btnSubmit;
    @FindBy(xpath = "//span[contains(text(),'Harry Potter')]")
    WebElement checkInfoLogin;
    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement checkButtonLogout;

    public void setUserSelect(String username){
        userSelect.click();
        List<WebElement> listUser = userSelect.findElements(By.tagName("option"));
        for (WebElement user : listUser) {
            if (user.getText().equals(username)) {
                Select userSelects = new Select(userSelect);
                userSelects.selectByVisibleText(username);
            }
        }
    }
    public void setBtnSubmit(){
        btnSubmit.click();
    }

    public void setCheckInfoLogin() {
        Assert.assertEquals(checkInfoLogin.getText(), "Harry Potter", "The info of user is failed!");
        System.out.println(checkInfoLogin.getText());
    }
    public void setCheckLoginSuccess() {
        WebElement checkButtonLogout1 = checkButtonLogout;
        Assert.assertTrue(checkButtonLogout1.isDisplayed());
    }
}
