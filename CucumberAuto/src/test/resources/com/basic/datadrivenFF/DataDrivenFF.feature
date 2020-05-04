Feature: Create Facebook Account2
As a user you need to open Facebook Homepage and do the validations

Scenario Outline: Validate create user multiple fields

Given User needs to be on Facebook Login Page
When User enters user "<user>" first name
And User enters user "<surname>" surname
Then User checks if "<user>" first name is present
Then User Mobile field should be blank
Then close browser

Examples:

	| user  | surname | 
	| Tom   | Jerry   |
	| Lorren| Hardy   |



 
