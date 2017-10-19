package com.wipro.tutorial.at.pages;

import com.wipro.tutorial.at.configuration.pageobjects.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

@PageObject
public class DepositPage extends AbstractPage{

//    @FindBy(xpath="//*[@id='targetAccount']")
    @FindBy(id = "targetAccount")
    private WebElement dropdownSelect;

    @FindBy(id = "ammount")
    private WebElement amountInput;

    @FindBy (xpath = "//*[@value='Deposit']")
    private WebElement depositButton;

    @FindBy (id = "sb-return-message")
    private WebElement returnMsg;

    public DepositPage cpf(String accountValue) {
        //Select drpAccount = new Select(driver.findElement(By.id("targetAccount")));
        //drpAccount.selectByVisibleText("17891023564");
        Select dropdown = new Select(dropdownSelect);
        //dropdown.getOptions().get(1).click();
        dropdown.selectByVisibleText(accountValue);

        return this;
    }

    public DepositPage amount (String amount) {
        //Select drpAccount = new Select(driver.findElement(By.id("targetAccount")));
        //drpAccount.selectByVisibleText("17891023564");
        //Select depositAccount = new Select();
        amountInput.clear();
        amountInput.sendKeys(amount);
        return this;
    }

    public DepositPage clickDeposit() {
        depositButton.click();
        return this;
    }

    public String getReturnMsg() {
        return returnMsg.getText();
    }
}
