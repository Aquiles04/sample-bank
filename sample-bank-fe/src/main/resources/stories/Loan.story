Meta:

Narrative:
In order to make a loan process
As an account manager
I want to make a loan process for a client filling the account and value input,
So that he can receive a certain amount of money
Ensuring that after I submit the request I check the return message saying that the operation was successful

!--Fix to be used in sample-bank
Scenario: Successful Loan

Given that a customer has a <accountNumber>
!--And <statusAccount> account
!--And a balance of <valueOfBalance>
!--When the customer input for a value less or equal to <valueOfRequest> (30% of total amount)
!--And clicks on request button
!--Then the system should show a message saying that the operation is successful.

Examples:
| accountNumber  | statusAccount | valueOfBalance |	valueOfRequest |
| Valid          | Active	     | 2000	          | 600            |


Scenario: Unsuccessful Loan

Given that a customer has a <accountNumber>
!--And <statusAccount> account
!--And a balance of <valueOfBalance>
!--When the customer input the value of <valueOfRequest>
!--And clicks on request button
!--Then the system should show a message, saying the reason it was not approved based on <ruleOfError>.

Examples:
| accountNumber  | statusAccount | valueOfBalance |	valueOfRequest | ruleOfError                                         |
| Valid	         | Inactive	     | 2000           | 500            | Inactive Account                                    |
| Invalid	     | Active        | 2000	          | 500	           | Invalid Account                                     |
| Valid	         | Active	     | 1500           |	1000           | Balance should be greater than 2000                 |
| Valid	         | Active	     | 3000	          | 1500	       | Requested value should be <= 30% of Account Balance |


