Meta:

Narrative:
In order to make a loan process
As an account manager
I want to make a loan process for a client filling the account and value input,
So that he can receive a certain amount of money
Ensuring that after I submit the request I check the return message saying that the operation was successful

GivenStories: stories/Login.story
GivenStories: stories/CreateAccount.story
GivenStories: stories/Deposit.story

Scenario: Open Loan Menu
Given Cardholder clicks on Loan menu

Scenario: Open Make Loan Submenu
Given Cardholder clicks on Make Loan submenu

Scenario: Make Loan

Given that a cardholder has a active account <accountNumber>
When the customer input for a value less or equal to <valueOfRequest> (30% of total amount)
And clicks on request button
Then it should show the message for the request <messageValidation>

Examples:
| accountNumber        | initialBalance | valueOfRequest | messageValidation                                                                     |
| 98765432100          | 200000	        | 60000          | Operation completed with success                                                      |
| -- Select Account -- | 200000         | 50000          | The CPF information is invalid                                                                        |
| 12345678910	       | 1500           | 60000          | Insufficient balance in account for the loan operation. Minimum of $2000 is required  |
| 98765432100	       | 200000	        | 150000         | There is a pending loan for this account                                              |
