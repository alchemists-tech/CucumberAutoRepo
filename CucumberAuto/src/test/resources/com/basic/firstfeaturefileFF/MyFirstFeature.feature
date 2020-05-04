Feature: Create Facebook Account4
As a user you need to open Facebook Homepage and do the validations

Scenario: Validate First Name field

Given User needs to be on Facebook Login Page
When User enters user first name
Then User checks if first name is present
Then close browser

#Scenario: Validate create user multiple fields

#Given User needs to be on the Facebook Login Page
#When User enters first name
#And User enters surname
#Then User checks first name is present
#And User checks user surname is present
#But User Mobile field should be blank

 
