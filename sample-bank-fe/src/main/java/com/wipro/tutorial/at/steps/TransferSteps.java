package com.wipro.tutorial.at.steps;

import com.wipro.tutorial.at.pages.TransferPage;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransferSteps extends AbstractSteps{

    @Autowired
    private TransferPage transferPage;

    @When("a cardholder has a valid account $accountNumber to make a transfer to a second $accountNumber2")
    public void userFillsSourceAccount(@Named("accountNumber") String accountNumber, @Named("accountNumber2") String accountNumber2 ) {

        transferPage.fillSourceAccount(accountNumber);
        transferPage.fillTargetAccount(accountNumber2);

    }

    @When("the cardholder input the value of $valueOfTransfer")
    public void userFillsAmount(@Named("valueOfTransfer") String valueOfTransfer ) {

        transferPage.amount(valueOfTransfer);
    }

    @When("clicks on transfer button")
    public void transferButton() {
        transferPage.clickTransfer();
    }

    @Then("the system should show the transfer message $messageValidation")
    public void assertTransferReturnMessage(@Named("messageValidation") String message) {
        Assert.assertEquals(message, transferPage.getReturnMsg());
    }

}
