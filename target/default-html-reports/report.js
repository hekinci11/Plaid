$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/DashboardPage.feature");
formatter.feature({
  "name": "Tool Bar Options",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to search",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user click on search button",
  "keyword": "Given "
});
formatter.match({
  "location": "DashboardStepDefinitions.user_click_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user types \"design_name\"",
  "keyword": "When "
});
formatter.match({
  "location": "DashboardStepDefinitions.user_types(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies that searched design name is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "DashboardStepDefinitions.user_verifies_that_searched_design_name_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to change the background color",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user click on sun button",
  "keyword": "Given "
});
formatter.match({
  "location": "DashboardStepDefinitions.user_click_on_sun_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "sun button is enabled",
  "keyword": "Then "
});
formatter.match({
  "location": "DashboardStepDefinitions.sun_button_is_enabled()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to do filter",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user tap on all filter options",
  "keyword": "Given "
});
formatter.match({
  "location": "DashboardStepDefinitions.user_tap_on_all_filter_options()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user lands on no filter message",
  "keyword": "Then "
});
formatter.match({
  "location": "DashboardStepDefinitions.user_lands_on_no_filter_message()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to Login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user tap on three dots icon",
  "keyword": "Given "
});
formatter.match({
  "location": "DashboardStepDefinitions.user_tap_on_three_dots_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Log in to Designer News Button",
  "keyword": "And "
});
formatter.match({
  "location": "DashboardStepDefinitions.user_clicks_on_Log_in_to_Designer_News_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User lands on  Sign up and Login page",
  "keyword": "Then "
});
formatter.match({
  "location": "DashboardStepDefinitions.user_lands_on_Sign_up_and_Login_page()"
});
formatter.result({
  "status": "passed"
});
});