Meta:

Narrative:
In order to make a deposit
As a account manager / user
I want to be able to select the account
I want to be able to input the value for the deposit
Ensuring that after I submit the request I check the return message saying that the operation was successful

GivenStories: stories/Login.story
GivenStories: stories/CreateAccount.story

Scenario: Open Account Information Page
When User clicks on menu Account Information
And User already has an <accountNumber>
And clicks on get information button
Then the system should show the message <messageValidation>
Then get the balance value of <initialBalance>

Examples:
| accountNumber         | inicialBalance | messageValidation                         |
| 12345678910           | 0              | Operation completed with success          |


Scenario: Open Deposit Page
When User clicks on menu Deposit

Scenario: Make deposit
When a cardholder has a <accountValue>
When the account manager wants to make a deposit with the value of <valueOfDeposit>
And clicks on deposit button
Then the system should show the message <messageValidation>

Examples:
| accountValue          | valueOfDeposit | messageValidation
| 12345678910           | 100000	     | Operation completed with success
| -- Select Account --  | 50000	         | The CPF information is invalid
| 12345678910           | 0   	         | The ammount is invalid for the operation
| 98765432100           | 200000         | Operation completed with success

Scenario:Check Balance
When User clicks on menu Account Information
And User already has an <accountNumber>
And clicks on get information button
Then the system should show the message <messageValidation>
Then get the balance value of <finalBalance>

Examples:
| accountNumber         | finalBalance  | messageValidation                         |
| 12345678910           | 100000        | Operation completed with success          |