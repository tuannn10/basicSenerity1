Feature:Login to shopee

Scenario Outline: Login with the valid password account
Given The login page is showed
When The user provides valid <username> and <password> account then attemp to login
Then The Homepage is show login name
Examples:
	| username	| password|
    | zickzack119@gmail.com| Qaz@1234|
    | 0909009468|Qaz@1234|