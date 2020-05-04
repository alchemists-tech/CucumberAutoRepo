Feature: Create Facebook Account1
As a user you need to open Facebook Homepage and do the validations

Background: common login steps
Given User needs to be on Facebook Login Page

Scenario: Validate First Name field

When User enters user "David" first name
Then User checks if "David" first name is present
Then close browser

Scenario: Validate create user multiple fields

When User enters user "Ryan" first name
And User enters user "Jack" surname
Then User checks if "Ryan" first name is present
Then User Mobile field should be blank
Then close browser

 
