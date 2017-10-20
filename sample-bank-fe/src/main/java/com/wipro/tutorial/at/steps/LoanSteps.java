package com.wipro.tutorial.at.steps;

import com.wipro.tutorial.at.pages.LoanPage;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoanSteps extends AbstractSteps{


    @Autowired
    private LoanPage loanPage;

    @Given("Cardholder clicks on $loan menu")
    public void clickLoanMenu() throws InterruptedException {
        loanPage.selectLoanMenu();
    }

    @Given("Cardholder clicks on $loan submenu")
    public void clickMakeLoanMenu(){
        loanPage.selectLoanSubMenu();
    }


    @Given("that a cardholder has a active account $accountNumber")
    public void userFillAccount(@Named("accountNumber") String accountNumber){
        loanPage.fillAccount(accountNumber);
    }

    @When("the customer input for a value less or equal to $valueOfRequest (30% of total amount)")
    public void userFillLoanAmount(@Named("valueOfRequest") String valueOfRequest){
        loanPage.fillAmount(valueOfRequest);
    }

    @When("clicks on request button")
    public void userClicksLoanButton(){
        loanPage.clickMakeLoan();
    }

    @Then("it should show the message for the request $messageValidation")
    public void returnMessage(@Named("messageValidation") String messageValidation){
        Assert.assertEquals(loanPage.getReturnMsg(),messageValidation);
    }
}
