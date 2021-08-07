#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Login functionality
As a registered user I should be able to login into the application after providing valid credentials

@EndToEnd
Scenario: Positive login test by clicking submit button
	Given registered user is in homepage
	When user enter valid username and valid password
	And user clicks submit button
	Then user should be able to login

@EndToEnd	
Scenario: Positive login test by hitting enter key
	Given registered user is in homepage
	When user enter valid username and valid password
	And user is hitting enter key
	Then user should be able to login

@EndToEnd
Scenario: Negative login test with valid username but invalid password
	Given registered user is in homepage
	When user enter valid username and invalid password
	And user clicks submit button
	Then user should not be able to login

@EndToEnd	
Scenario: Negative login test with invalid username but valid password
	Given registered user is in homepage
	When user enter invalid username and valid password
	And user clicks submit button
	Then user should not be able to login	
	
#Scenario Outline: Positive login test Data driven
#	Given registered user is in homepage
#	When user enter valid "<username>" and valid "<password>"
#	And user clicks submit button
#	Then user should be able to login
#	
#	Examples:
#	| username 	| password 	|
#	| test12		| 123				|
#	| test			| 123				|	
#	| test12		| 123				|
#	| test			| 123				|	
#	| test12		| 123				|
#	| test			| 123				|	

@EndToEnd
Scenario Outline: Negative login test Data driven
	Given registered user is in homepage
	When user enter invalid "<invalidUsername>" and invalid "<invalidPassword>"
	And user clicks submit button
	Then user should not be able to login
	
	Examples:
	| invalidUsername 	| invalidPassword 	|
	| tom12345					| 123								|
	| test							| 123456						|	
	| david123					| 123								|

	
	
	
	
