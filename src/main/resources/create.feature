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

Feature: login functionality
Background: Browser Launch
Given Browser must install the browser
When user must enter the browser search field
Then user will find the entered page
  
  Scenario: Registration 
    Given user must enter the registration page
    When user enters the data into required fields
    Then user must be enterd into the login page 
   
    Scenario: login 
    Given user enters the username and password
     When user enters the required fields
     |username||password|
     |123||kk|
     |llk||245|
    Then user enters the home page
    
    
  
    