Meta:

Narrative:
In order to make a transfer between accounts
As a cardholder?
I want to be able to choose the existing accounts
Input the amount I want to transfer
Ensuring that after I submit the request I check the return message saying that the operation was successful


Scenario:Transfer

Given that a customer has a <accountNumber>
And <statusAccount> account
And a balance of <valueOfBalanceFrom>
When the cardholder input the value of <valueOfTransfer>
And clicks on transfer button
Then the system should show the message <messageValidation>.

Examples:
| accountNumber  | statusAccount | valueOfBalanceFrom | valueOfTrasfer | messageValidation                                                   |
| Valid	         | Active        | 2000	             | 500	          | Operation completed with success                                    |
| Invalid        | Active        | 2000	             | 500	          | The CPF information is invalid                                      |
| Valid	         | Active        | 1500	             | 3000	          | The ammount is invalid for the operation                            |
| Valid	         | Active        | 3000	             | Null           |	The ammount is invalid for the operation should be greater than 0   |

