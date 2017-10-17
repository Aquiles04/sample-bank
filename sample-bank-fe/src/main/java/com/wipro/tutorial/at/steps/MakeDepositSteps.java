package com.wipro.tutorial.at.steps;

import com.wipro.tutorial.at.pages.MakeDepositPage;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MakeDepositSteps extends AbstractSteps{

    @Autowired
    private MakeDepositPage makeDepositPage;

    @When("a cardholder has a $cpfValue")
    public void userFillsCPF(@Named("cpfValue") String cpfValue ) {

        makeDepositPage.cpf(cpfValue);
    }

    @When("the account manager wants to make a deposit with the value of $valueOfDeposit")
    public void userFillsAmount(@Named("$valueOfDeposit") String $valueOfDeposit ) {

        makeDepositPage.amount($valueOfDeposit);
    }
    @When("clicks on deposit button")
    public void clickMakeDepositButton() {
        makeDepositPage.clickMakeDeposit();
    }

    @Then("the system should show the message $messageValidation")
    public void assertCreateAccountReturnMessage(@Named("messageValidation") String message) {
        Assert.assertEquals(message, makeDepositPage.getReturnMsg());
    }

}
