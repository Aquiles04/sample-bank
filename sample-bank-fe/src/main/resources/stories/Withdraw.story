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

Scenario: Open AddAccount Page
When User has an <accountNumber> and a positive <balance>

Scenario:Withdraw

Given that a customer has a <cpfValue>
When the account manager wants to make a withdraw with the value of <valueOfWithdraw>
And <valueOfWithdraw> is equal to or less than amount of <balanceAmount>
And clicks on withdraw button
Then the system should show the message <messageValidation>.

Examples:
| cpfValue              | valueOfWithdraw  | balanceAmount | messageValidation                         |
| 12345678910           | 500	           | 1000	       | Operation completed with success          |
| -- Select Account --  | 500              | 500           | The CPF information is invalid            |
| 12345678910           | 1500             | 1000          | The ammount is invalid for the operation  |
| 12345678910           | NULL             | 250           | The ammount is invalid for the operation  |






