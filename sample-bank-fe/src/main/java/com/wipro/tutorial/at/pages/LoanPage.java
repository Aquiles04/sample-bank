package com.wipro.tutorial.at.pages;

import com.wipro.tutorial.at.configuration.pageobjects.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

@PageObject
public class LoanPage extends AbstractPage{


    @FindBy(id = "targetAccount")
    private WebElement dropdownSelect;

    @FindBy(id = "ammount")
    private WebElement amountInput;

    @FindBy (className = "sb-button")
    private WebElement makeLoanButton;

    @FindBy (id = "sb-return-message")
    private WebElement returnMsg;


    @FindBy (xpath = "//*[text()='Loans']")
    private WebElement loanMenuButton;

    @FindBy(xpath = "//*[text()='Make Loan']")
    private WebElement loanSubmenuButton;

    public LoanPage selectLoanMenu() throws InterruptedException {
        loanMenuButton.click();
        Thread.sleep(5000);
        return this;
    }

    public LoanPage selectLoanSubMenu(){
        loanSubmenuButton.click();
        return this;
    }

    public LoanPage fillAccount(String accountNumber){
        Select dropdown = new Select(dropdownSelect);
        dropdown.selectByValue(accountNumber);
        return this;
    }

    public LoanPage fillAmount(String amount){
        amountInput.sendKeys(amount);
        return this;
    }

    public LoanPage clickMakeLoan(){
        makeLoanButton.click();
        return this;
    }

    public String getReturnMsg() {
        return returnMsg.getText();
    }
}
