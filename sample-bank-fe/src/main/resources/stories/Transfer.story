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

Scenario: Open Transfer Page
When User clicks on menu Transfer

Scenario: Transfer

When a cardholder has a valid account <accountNumber> to make a transfer to a second <accountNumber2>
And the cardholder input the value of <valueOfTransfer>
And clicks on transfer button
Then the system should show the transfer message <messageValidation>

Examples:
| accountNumber         | initialBalance | accountNumber2       | valueOfTransfer | messageValidation                        |
| 12345678910           | 100000	     | 01234567899          | 50000	          | Operation completed with success         |
| -- Select Account --  | 100000	     | 01234567899          | 50000	          | The CPF information is invalid           |
| 12345678910           | 100000	     | -- Select Account -- | 50000	          | The CPF information is invalid           |
| 12345678910	        | 100000	     | 01234567899          | 200000          | The ammount is invalid for the operation |
| 01234567899	        | 0	             | 12345678910          | 5000  	      | The ammount is invalid for the operation |
| 12345678910	        | 100000	     | 01234567899          | 0               | The ammount is invalid for the operation |

