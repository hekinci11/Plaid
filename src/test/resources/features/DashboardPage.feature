@smoke
Feature: Tool Bar Options

  Background:
    Given user is on dashboard page

  Scenario: User should be able to search
     And user click on search button
     When user types "design_name"
     Then user verifies that searched design name is displayed

  Scenario: User should be able to change the background color
     And user click on sun button
     Then sun button is enabled

  Scenario: User should be able to do filter
     And user tap on all filter options
     Then user lands on no filter message

  Scenario: User should be able to Login
     And user tap on three dots icon
     And User clicks on Log in to Designer News Button
     Then User lands on  Sign up and Login page




