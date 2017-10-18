package com.wipro.tutorial.at.pages;

import com.wipro.tutorial.at.configuration.pageobjects.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@PageObject
public class AccountInformationPage extends AbstractPage {


    @FindBy (id = "ownerCpfSelect")
    private WebElement cpfInput;

    @FindBy (className = "sb-table-button-row")
    private WebElement getInformationButton;



}
