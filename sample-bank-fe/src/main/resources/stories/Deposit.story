Meta:

Narrative:
In order to make a deposit
As a account manager / user
I want to be able to select the account
I want to be able to input the value for the deposit
Ensuring that after I submit the request I check the return message saying that the operation was successful

GivenStories: stories/Login.story
GivenStories: stories/CreateAccount.story

Scenario: Open Deposit Page
When User clicks on menu Deposit

Scenario: Make deposit
When a cardholder has a <cpfValue>
When the account manager wants to make a deposit with the value of <valueOfDeposit>
And clicks on deposit button
Then the system should show the message <messageValidation>

Examples:
|cpfValue              | valueOfDeposit |messageValidation
| 12345678910          | 1000	        | Operation completed with success
| -- Select Account -- | 500	        | The CPF information is invalid
| 12345678910          | 0   	        | The ammount is invalid for the operation

