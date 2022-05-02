Feature: Test login functionality 

Scenario Outline: Check login is successful with valid credentials 

	Given chrome is open 
	When user clicks on TestProject Demo 
	And user on login page 
	Then user entering <username> and <password> 
	And user clicks on login 
	Then user is navigated to home page 
	
	Examples: 
		|username|password|
		|Mona|12345|
		|Sandeep|12345|
		
	