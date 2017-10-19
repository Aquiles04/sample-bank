package com.wipro.tutorial.at.pages;

import com.wipro.tutorial.at.configuration.pageobjects.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

@PageObject
public class WithdrawPage extends AbstractPage {

    @FindBy(id="targetAccount")
    private WebElement dropdownSelect;

    @FindBy(id = "ammount")
    private WebElement amountInput;

    @FindBy (xpath = "//*[@value='Withdraw']")
    private WebElement withdrawButton;

    @FindBy (id = "sb-return-message")
    private WebElement returnMsg;

    public WithdrawPage accountNumber (String accountNumber) {

        Select dropdown = new Select(dropdownSelect);
        dropdown.selectByVisibleText(accountNumber);

        return this;
    }

    public WithdrawPage amount (String amount) {

        amountInput.clear();
        amountInput.sendKeys(amount);
        return this;
    }

    public WithdrawPage clickWithdraw() {
        withdrawButton.click();
        return this;
    }

    public String getReturnMsg() {
        return returnMsg.getText();
    }
}
