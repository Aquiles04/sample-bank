package com.wipro.tutorial.at.pages;

import com.wipro.tutorial.at.configuration.pageobjects.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

@PageObject
public class MakeDepositPage extends AbstractPage{

    @FindBy(id="targetAccount")
    private WebElement dropdownSelect;

    @FindBy(id = "ammount")
    private WebElement amountInput;

    @FindBy (xpath = "//*[@value='Deposit']")
    private WebElement makeDepositButton;

    @FindBy (id = "sb-return-message")
    private WebElement returnMsg;

    public MakeDepositPage cpf (String cpf) {
        //Select drpAccount = new Select(driver.findElement(By.id("targetAccount")));
        //drpAccount.selectByVisibleText("17891023564");
        Select dropdown = new Select(dropdownSelect);
        //dropdown.getOptions().get(1).click();
        dropdown.selectByVisibleText(cpf);

        //cpfInput.clear();
        //cpfInput.sendKeys(cpf);
        return this;
    }

    public MakeDepositPage amount (String amount) {
        //Select drpAccount = new Select(driver.findElement(By.id("targetAccount")));
        //drpAccount.selectByVisibleText("17891023564");
        //Select depositAccount = new Select();
        amountInput.clear();
        amountInput.sendKeys(amount);
        return this;
    }

    public MakeDepositPage clickMakeDeposit() {
        makeDepositButton.click();
        return this;
    }

    public String getReturnMsg() {
        return returnMsg.getText();
    }
}
