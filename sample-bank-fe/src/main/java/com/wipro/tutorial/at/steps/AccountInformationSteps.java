package com.wipro.tutorial.at.steps;

import com.wipro.tutorial.at.pages.AccountInformationPage;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.junit.Assert;


@Component
public class AccountInformationSteps  extends AbstractSteps{

    @Autowired
    private AccountInformationPage accountInformationPage;

    @When("User has an $accountNumber")
    public void fillCpf(@Named("accountNumber") String accountNumber) {
        accountInformationPage.selectAccountInfo(accountNumber);
    }

    @When("clicks on get information button")
    public void userClickInfoButton(){
        accountInformationPage.clickInformationButton();
    }

    @Then("the system should show the message $messageValidation")
    public void returnAccountInfo(@Named("messageValidation") String messageValidation){
        Assert.assertEquals(accountInformationPage.getReturnMsg(), messageValidation);
    }

    @Then("get the balance value of $balance")
    public void fillBalance(@Named("balance") String balance) {
        accountInformationPage.getBalanceInfo(balance);
    }



}
