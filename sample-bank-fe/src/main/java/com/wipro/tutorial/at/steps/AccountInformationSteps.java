package com.wipro.tutorial.at.steps;

import com.wipro.tutorial.at.pages.AccountInformationPage;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountInformationSteps  extends AbstractSteps{

    @Autowired
    private AccountInformationPage accountInformationPage;

    @When("When User has an $accountNumber and a positive $balance")
    public void clickOnMenu(@Named("menu") String menu) {
        //accountInformationPage.clickMenu(menu);
    }
}
