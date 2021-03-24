
Feature: Tool Bar Options

  Scenario: User should be able to search
    Given user click on search button
    When user types "design_name"
    Then user verifies that searched design name is displayed

  Scenario: User should be able to change the background color
     Given user click on sun button
     Then sun button is enabled

  Scenario: User should be able to do filter
     Given user tap on all filter options
     Then user lands on no filter message
  @wip
  Scenario: User should be able to Login
     Given user tap on three dots icon
     And User clicks on Log in to Designer News Button
    Then User lands on  Sign up and Login page




