package com.wipro.tutorial.at.pages;

import com.wipro.tutorial.at.configuration.pageobjects.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

@PageObject
public class AccountInformationPage extends AbstractPage {



    @FindBy(id="ownerCpfSelect")
    private WebElement dropdownSelect;

    @FindBy (className = "sb-button")
    private WebElement getInformationButton;

    @FindBy(xpath = "//*[contains(text(),'Balance:')]/following-sibling::*[1]")
    private WebElement getBalance;

    @FindBy (id = "sb-return-message")
    private WebElement returnMsg;

    public AccountInformationPage selectAccountInfo(String cpf){
        Select dropdown = new Select(dropdownSelect);
        dropdown.selectByVisibleText(cpf);

        return this;
    }

    //Isso tem que acontecer apos o click do botao
    public AccountInformationPage getBalanceInfo(String balance){

        getBalance.sendKeys(balance);
        return this;
    }

    public AccountInformationPage clickInformationButton(){
        getInformationButton.click();
        return this;
    }


    public String getReturnMsg() {
        return returnMsg.getText();
    }


}
