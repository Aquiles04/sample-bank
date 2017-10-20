Narrative:
In order to create new account
As an admin
I want to fill the input, submit the form and check the return message

GivenStories: stories/Login.story

Scenario: Open AddAccount Page
When User clicks on menu Create Account

Scenario: Invalid CPF information
When User fills the CPF input with value <cpfValue>
And User clicks on Create Account button
Then The return message for Create Account is <message>
Examples:
| cpfValue 		| message 						   |
|  123	   		| The CPF information is invalid   |
|12345678910    | Operation completed with success |
|12345678910    | Account already exists 		   |
|01234567899    | Operation completed with success |
|98765432100    | Operation completed with success |