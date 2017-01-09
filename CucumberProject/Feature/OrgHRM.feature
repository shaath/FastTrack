Feature: Login and Logout Test

	Scenario: Login Test
		Given user launches the browser and navigated to url
		When user enters username and password 
		And also clicks on login
		Then welcome message displyed
		
	Scenario: Logout Test
		When user clicks on welcome admin link
		And also clicks on logout link
		Then orangehrm login page displayed	