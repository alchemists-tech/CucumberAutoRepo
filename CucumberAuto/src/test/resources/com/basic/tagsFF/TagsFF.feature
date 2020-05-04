@Important

Feature: Create Facebook Account12
As a user you need to open Facebook Homepage and do the validations

@Smoke
Scenario: Validate First Name field1

Given User needs to be on Facebook Login Page
When User enters user "David" first name
Then User checks if "David" first name is present
Then close browser

@Smoke @Regression
Scenario: Validate create user multiple fields2

Given User needs to be on Facebook Login Page
When User enters user "Ryan" first name
And User enters user "Jack" surname
Then User checks if "Ryan" first name is present
Then User Mobile field should be blank
Then close browser

Scenario: Validate First Name field3

Given User needs to be on Facebook Login Page
When User enters user "David" first name
Then User checks if "David" first name is present
Then close browser

@Regression
Scenario: Validate First Name field4

Given User needs to be on Facebook Login Page
When User enters user "David" first name
Then User checks if "David" first name is present
Then close browser

@Smoke
Scenario: Validate First Name field5

Given User needs to be on Facebook Login Page
When User enters user "David" first name
Then User checks if "David" first name is present
Then close browser

 
