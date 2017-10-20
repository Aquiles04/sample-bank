package com.wipro.tutorial.at.pages;

import com.wipro.tutorial.at.configuration.pageobjects.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

@PageObject
public class TransferPage extends AbstractPage {

    @FindBy(id = "sourceAccount")
    private WebElement dropdownSelectSourceAccount;

    @FindBy(id = "targetAccount")
    private WebElement dropdownSelectTargetAccount;

    @FindBy(id = "ammount")
    private WebElement amountInput;

    @FindBy (xpath = "//*[@value='Transfer']")
    private WebElement transferButton;

    @FindBy (id = "sb-return-message")
    private WebElement returnMsg;

    public TransferPage fillSourceAccount (String sourceAccount) {

        Select dropdown = new Select(dropdownSelectSourceAccount);
        dropdown.selectByVisibleText(sourceAccount);
        return this;
    }

    public TransferPage fillTargetAccount (String targetAccount) {

        Select dropdown = new Select(dropdownSelectTargetAccount);
        dropdown.selectByVisibleText(targetAccount);
        return this;

    }
//
    public TransferPage amount (String amount) {
        //Select drpAccount = new Select(driver.findElement(By.id("targetAccount")));
        //drpAccount.selectByVisibleText("17891023564");
        //Select depositAccount = new Select();
        amountInput.clear();
        amountInput.sendKeys(amount);
        return this;
    }

    public TransferPage clickTransfer() {
        transferButton.click();
        return this;
    }

    public String getReturnMsg() {
        return returnMsg.getText();
    }
}
