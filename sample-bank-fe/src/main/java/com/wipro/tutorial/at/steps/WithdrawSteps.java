package com.wipro.tutorial.at.steps;

import com.wipro.tutorial.at.pages.AccountInformationPage;
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

    @Autowired
    private AccountInformationPage accountInformationPage;

    @Given("that a customer has a $accountNumber")
    public void userFillsCPF(@Named("accountNumber") String accountNumber ) {

        withdrawPage.accountNumber(accountNumber);
    }

    @When("the account manager wants to make a withdraw with the value of $valueOfWithdraw")
    public void userFillsAmount(@Named("valueOfWithdraw") String valueOfWithdraw ) {

        withdrawPage.amount(valueOfWithdraw);
    }

    @When("$valueOfWithdraw is equal to or less than amount of $initialBalance")
    public void withdrawButton(@Named("valueOfWithdraw") String valueOfWithdraw, @Named("initialBalance") String initialBalance) {

        double valueWithdraw = Double.parseDouble(valueOfWithdraw);
        double valueBalance = Double.parseDouble(initialBalance);

        if(valueWithdraw <= valueBalance)
        {
            withdrawPage.amount(valueOfWithdraw);
            accountInformationPage.getBalanceInfo(initialBalance);
        }
        else
        {
            // send error?
        }

    }

    @When("clicks on withdraw button")
    public void withdrawButton() {
        withdrawPage.clickWithdraw();
    }

    @Then("system should show the message $messageValidation for withdraw")
    public void assertCreateAccountReturnMessage(@Named("messageValidation") String message) {
        Assert.assertEquals(message, withdrawPage.getReturnMsg());
    }


}
