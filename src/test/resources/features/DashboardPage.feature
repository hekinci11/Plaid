
Feature: Tool Bar Options

  Scenario: User should be able to search
    Given user click on search button
    When user types "design_name"
    Then user verifies that searched design name is displayed

  Scenario: User should be able to change the background color
     Given user click on sun button
     Then sun button is enabled
  @wip
  Scenario: User should be able to do filter
     Given user tap on all filter options
     Then user lands on no filter message

  Scenario: User should be able to do filter
     Given user tap on Popular Designer News
     Then Humans are amazing option is displayed


