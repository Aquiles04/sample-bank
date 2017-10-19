Meta:

Narrative:
In order to make a transfer between accounts
As a cardholder?
I want to be able to choose the two existing accounts
Input the amount I want to transfer
Ensuring that after I submit the request I check the return message saying that the operation was successful

GivenStories: stories/Login.story
GivenStories: stories/CreateAccount.story
GivenStories: stories/Deposit.story

Scenario: Open Withdraw Page
When User clicks on menu <Transfer>

Scenario:Transfer

Given that a cardholder has a valid account <accountNumber>
When he wants to select a second account <accountNumber2> to make a transfer
And the cardholder input the value of <valueOfTransfer>
And clicks on transfer button
Then the system should show the transfer message <messageValidation>

Examples:
| accountNumber         | initialBalance | accountNumber2   | valueOfTrasfer | messageValidation                                                                     |
| 12345678910           | 100000	     | 01234567899      | 50000	         | Operation completed with success                                                      |
| -- Select Account --  | 100000	     | 01234567899      | 50000	         | The CPF information is invalid                                                        |
| 12345678910	        | 100000	     | 01234567899      | 200000         | The requested loan ammount exceeds the available credit limit                         |
| 12345678910	        | 100000	     | 01234567899      | 5000000  	     | Insufficient balance in account for the loan operation. Minimum of $2000 is required  |
| 12345678910	        | 100000	     | 01234567899      | Null           | The ammount is invalid for the operation should be greater than 0                     |

