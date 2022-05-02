Feature: Check home page functionality 

Background: user is on login page 
	When user enters username and password 
	And clicks on login button 
	Then user is navigated to the homepage 
	
Scenario: check logout link 

	
	When clicks on welcome link 
	Then logout link is displayed 
	
Scenario: verify quick launch toolbar is presen 

	
	When user clicks on dashboard link 
	Then quick launch toolbar is displayed 
	
