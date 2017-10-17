Meta:

Narrative:

In order to make a withdraw
As a account manager
I want input the amount I want to withdraw
Ensuring that after I submit the request I check the return message saying that the operation was successful


Scenario:Withdraw

Given that a customer has a <accountNumber>
And <statusAccount> account
When the account manager wants to make a withdraw with the value of <valueOfWithdraw>
And <valueOfWithdraw> is equal to or less than amount of <balanceAmount>
And clicks on withdraw button
Then the system should show the message <messageValidation>.

Examples:
|accountNumber | statusAccount | valueOfWithdraw> | balanceAmount |	messageValidation                         |
|Valid         | Active        | 500	          | 500	          | Operation completed with success         |
|Invalid       | Active        | 500              | 500           |	The CPF information is invalid            |
|Valid         | Active        | 500              | 250           |	The ammount is invalid for the operation  |
|Valid         | Active        | NULL             | 250           |	The ammount is invalid for the operation  |






