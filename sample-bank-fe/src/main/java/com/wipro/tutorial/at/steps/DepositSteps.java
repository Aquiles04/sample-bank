package com.wipro.tutorial.at.steps;

import com.wipro.tutorial.at.pages.DepositPage;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DepositSteps extends AbstractSteps{

    @Autowired
    private DepositPage depositPage;

    @When("a cardholder has a $cpfValue")
    public void userFillsCPF(@Named("cpfValue") String cpfValue ) {

        depositPage.cpf(cpfValue);
    }

    @When("the account manager wants to make a deposit with the value of $valueOfDeposit")
    public void userFillsAmount(@Named("valueOfDeposit") String valueOfDeposit ) {

        depositPage.amount(valueOfDeposit);
    }
    @When("clicks on deposit button")
    public void depositButton() {
        depositPage.clickDeposit();
    }

    @Then("the system should show the message $messageValidation")
    public void assertCreateAccountReturnMessage(@Named("messageValidation") String message) {
        Assert.assertEquals(message, depositPage.getReturnMsg());
    }

}
