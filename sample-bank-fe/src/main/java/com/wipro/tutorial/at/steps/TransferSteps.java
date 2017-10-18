package com.wipro.tutorial.at.steps;

import com.wipro.tutorial.at.pages.TransferPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransferSteps extends AbstractSteps{

    @Autowired
    private TransferPage transferPage;
//
//    @When("a cardholder has a $cpfValue")
//    public void userFillsCPF(@Named("cpfValue") String cpfValue ) {
//
//        depositPage.cpf(cpfValue);
//    }
//
//    @When("the account manager wants to make a deposit with the value of $valueOfDeposit")
//    public void userFillsAmount(@Named("valueOfDeposit") String valueOfDeposit ) {
//
//        depositPage.amount(valueOfDeposit);
//    }
//    @When("clicks on deposit button")
//    public void depositButton() {
//        depositPage.clickDeposit();
//    }
//
//    @Then("the system should show the message $messageValidation")
//    public void assertCreateAccountReturnMessage(@Named("messageValidation") String message) {
//        Assert.assertEquals(message, depositPage.getReturnMsg());
//    }
}
