Meta:

Narrative:

In order to make a withdraw
As a account manager
I want input the amount I want to withdraw
Ensuring that after I submit the request I check the return message saying that the operation was successful

GivenStories: stories/Login.story
GivenStories: stories/CreateAccount.story
GivenStories: stories/Deposit.story

Scenario: Open Withdraw Page
When User clicks on menu Withdraw

Scenario: Open Account Information Page
When User has an <accountNumber>
And clicks on get information button
Then get the balance value of <balance>

Scenario:Withdraw

Given that a customer has a <cpfValue>
When the account manager wants to make a withdraw with the value of <valueOfWithdraw>
And <valueOfWithdraw> is equal to or less than amount of <balance>
And clicks on withdraw button
Then system should show the message <messageValidation> for withdraw
!--Then <valueOfWithdraw> is equal to or less than amount of <balance>

!--Fazer
!--Scenario:Check Balance
!--Then get the balance value of <balance> and compare with value of <balance> before withdraw


Examples:
| cpfValue              | valueOfWithdraw  | balance       | messageValidation                         |
| 12345678910           | 500	           | 1000	       | Operation completed with success          |
| -- Select Account --  | 500              | 500           | The CPF information is invalid            |
| 12345678910           | 1500             | 1000          | The ammount is invalid for the operation  |
| 12345678910           | NULL             | 250           | The ammount is invalid for the operation  |






