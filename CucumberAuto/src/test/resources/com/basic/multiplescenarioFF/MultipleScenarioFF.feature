Feature: Create Facebook Account9
As a user you need to open Facebook Homepage and do the validations

Scenario: Validate First Name field

Given User needs to be on Facebook Login Page
When User enters user first name
Then User checks if first name is present
Then close browser

Scenario: Validate create user multiple fields

Given User needs to be on Facebook Login Page
When User enters user first name
And User enters user surname
Then User checks if first name is present
Then User Mobile field should be blank
Then close browser

 
