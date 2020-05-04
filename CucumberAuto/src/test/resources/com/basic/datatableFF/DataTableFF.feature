Feature: Create Facebook Account3
As a user you need to open Facebook Homepage and do the validations


Scenario: Validate create user multiple fields

Given User needs to be on Facebook Login Page
When Enter following data
	|FirstName |Surname |Mobile|
	|Tom       |Hanks   |1234  |
	|Jack      |Danial  |5678  |
Then close browser
	

 
