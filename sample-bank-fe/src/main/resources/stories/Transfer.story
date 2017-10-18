Meta:

Narrative:
In order to make a transfer between accounts
As a cardholder?
I want to be able to choose the two existing accounts
Input the amount I want to transfer
Ensuring that after I submit the request I check the return message saying that the operation was successful


Scenario:Transfer

Given that a cardholder has a <accountNumber>
And a balance of <valueOfBalance>
And want to select a second acoount <statusAccount> to make a transfer
When the cardholder input the value of <valueOfTransfer>
And clicks on transfer button
Then the system should show the message <messageValidation>.

Examples:
| accountNumber         | valueOfBalance | valueOfTrasfer | messageValidation                                                                     |
| 12345678910           | 2000	         | 500	          | Operation completed with success                                                      |
| -- Select Account --  | 2000	         | 500	          | The CPF information is invalid                                                        |
| 12345678910	        | 2000	         | 1000	          | The requested loan ammount exceeds the available credit limit                         |
| 12345678910	        | 1500	         | 500  	      | Insufficient balance in account for the loan operation. Minimum of $2000 is required  |
| 12345678910	        | 3000	         | Null           | The ammount is invalid for the operation should be greater than 0                     |

