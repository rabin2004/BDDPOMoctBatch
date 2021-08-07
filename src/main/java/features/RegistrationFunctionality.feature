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

Feature: Registration Functionality
As a new user, I should be able to register to the application after providing required credentials.

@EndToEnd @Regression
Scenario: Positive registration functionality test
	Given user is in registration page
	When user provides username, password and confirm password
	And user clicks submit button in registration page
	Then user should be able to register to the application

@EndToEnd @Regression
Scenario: Positive registration functionality test Data Driven
	Given user is in registration page
	When user provides <username>, <password> and <confirmPassword>
	| tom123 | t1234 | t1234 |
	And user clicks submit button in registration page
	Then user should be able to register to the application

@Smoke
Scenario: Registration Link functionality test
	Given user is in registration page
	Then validate user is in registration page after clicking register link


