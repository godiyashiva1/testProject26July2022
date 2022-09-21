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
@tag
Feature: Facebook Login feature
  I want to use this template for my login feature file
  Background : Pre Condition
  Given I am the feature of facebok application


  @tag1
  Scenario: Valid Login scenario 
    When I enter valid username
    And I enter valid password
    And I click login button
    Then I should able to login sucessfully.

  @tag2
  Scenario: Valid Login scenario 
    When I enter invalid username
    And I enter invalid password
    And I click login button
    Then I error should able to login sucessfully.
 