Meta:

Narrative:

In order to make a withdraw
As a account manager
I want input the amount I want to withdraw
Ensuring that after I submit the request I check the return message saying that the operation was successful

GivenStories: stories/Login.story
GivenStories: stories/CreateAccount.story
GivenStories: stories/Deposit.story

Scenario: Open Account Information Page
When User clicks on menu Account Information
And User already has an <accountNumber>
And clicks on get information button
Then the system should show the message <messageValidation>
Then get the balance value of <initialBalance>

Examples:
| accountNumber         | inicialBalance | messageValidation                         |
| 12345678910           | 100000         | Operation completed with success          |


Scenario: Open Withdraw Page
When User clicks on menu Withdrawn

Scenario:Withdraw

Given that a customer has a <accountNumber>
When the account manager wants to make a withdraw with the value of <valueOfWithdraw>
And <valueOfWithdraw> is equal to or less than amount of <initialBalance>
And clicks on withdraw button
Then system should show the message <messageValidation> for withdraw

Examples:
| accountNumber         | valueOfWithdraw  | initialBalance  | messageValidation                         |
| 12345678910           | 50000	           | 100000          | Operation completed with success          |
| -- Select Account --  | 50000            | 50000           | The CPF information is invalid            |
| 12345678910           | 150000           | 100000          | The ammount is invalid for the operation  |
| 12345678910           | NULL             | 25000           | The ammount is invalid for the operation  |






