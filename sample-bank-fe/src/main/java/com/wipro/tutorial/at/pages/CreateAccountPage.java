package com.wipro.tutorial.at.pages;

import com.wipro.tutorial.at.configuration.pageobjects.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@PageObject
public class CreateAccountPage extends AbstractPage {

	@FindBy (id = "ownerCpf")
	private WebElement cpfInput;
	
	@FindBy (className = "sb-button")
	private WebElement createAccountButton;
	
	@FindBy (id = "sb-return-message")
	private WebElement returnMsg;
	
	public CreateAccountPage cpf (String cpf) {
		cpfInput.clear();
		for(char c : cpf.toCharArray())
		{
			String cpfAux = String.valueOf(c);
			cpfInput.sendKeys(cpfAux);
		}
		return this;
	}
	
	public CreateAccountPage clickCreateButton() {
		createAccountButton.click();
		return this;
	}
	
	public String getReturnMsg() {
		return returnMsg.getText();
	}
}
