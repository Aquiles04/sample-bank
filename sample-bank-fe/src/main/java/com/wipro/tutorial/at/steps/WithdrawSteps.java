package com.wipro.tutorial.at.steps;

import com.wipro.tutorial.at.pages.WithdrawPage;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WithdrawSteps extends AbstractSteps{

    @Autowired
    private WithdrawPage withdrawPage;

    @Given("that a customer has a $cpfValue")
    public void userFillsCPF(@Named("cpfValue") String cpfValue ) {

        withdrawPage.cpf(cpfValue);
    }

    @When("the account manager wants to make a withdraw with the value of $valueOfWithdraw")
    public void userFillsAmount(@Named("valueOfWithdraw") String valueOfWithdraw ) {

        withdrawPage.amount(valueOfWithdraw);
    }

    @When("$valueOfWithdraw is equal to or less than amount of $balanceAmount")
    public void withdrawButton(@Named("valueOfWithdraw") String valueOfWithdraw, @Named("balanceAmount") String balanceAmount) {

        withdrawPage.amount(valueOfWithdraw);

    }

    @When("clicks on withdraw button")
    public void withdrawButton() {
        withdrawPage.clickWithdraw();
    }

    @Then("the system should show the message $messageValidation")
    public void assertCreateAccountReturnMessage(@Named("messageValidation") String message) {
        Assert.assertEquals(message, withdrawPage.getReturnMsg());
    }
}
