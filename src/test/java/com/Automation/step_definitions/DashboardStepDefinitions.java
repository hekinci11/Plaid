package com.Automation.step_definitions;
import com.Automation.pages.DashboardPage;
import com.Automation.utilities.Driver;
import com.Automation.utilities.MobileUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;



public class DashboardStepDefinitions {

    DashboardPage dashboardPage= new DashboardPage();

    @Given("user click on search button")
    public void user_click_on_search_button() {
       // DashboardPage dashboardPage= new DashboardPage();
        MobileUtils.waitFor(2);
        dashboardPage.searchButton.click();
    }

    @When("user types {string}")
    public void user_types(String string) {
      //  DashboardPage dashboardPage= new DashboardPage();
        dashboardPage.searchButton.sendKeys("Convert a YouTube Video to an Image");
    }

    @Then("user verifies that searched design name is displayed")
    public void user_verifies_that_searched_design_name_is_displayed() {
      //  DashboardPage dashboardPage= new DashboardPage();

        MobileUtils.waitFor(2);
        String actualTitle = dashboardPage.SearchResult.getText();
        Assert.assertEquals("Convert a YouTube Video to an Image",actualTitle);
    }


   @Given("user click on sun button")
    public void user_click_on_sun_button() {
      // DashboardPage dashboardPage= new DashboardPage();

       MobileUtils.waitFor(2);
       dashboardPage.SunButton.click();
       MobileUtils.waitFor(2000);

    }

    @Then("sun button is enabled")
    public void sun_button_is_enabled() {
       // DashboardPage dashboardPage= new DashboardPage();
        Assert.assertTrue(dashboardPage.SunButton.isEnabled());

        System.out.println("Enabled");
        Driver.closeDriver();
    }

    @Given("user tap on all filter options")
    public void user_tap_on_all_filter_options() {
       MobileUtils.waitFor(1000);
        dashboardPage.FilterButton.click();
    }

    @Then("user lands on no filter message")
    public void user_lands_on_no_filter_message() {
       dashboardPage.PDNButton.click();
        MobileUtils.waitFor(2000);
       dashboardPage.MDButton.click();
        MobileUtils.waitFor(2000);

        String expected ="No filters selected";

        Assert.assertTrue(dashboardPage.NoFilter.getText().contains(expected));

        System.out.println(dashboardPage.NoFilter.getText());


    }

    @Given("user tap on Popular Designer News")
    public void user_tap_on_Popular_Designer_News() {
       dashboardPage.PDNButton.click();
    }

    @Then("Humans are amazing option is displayed")
    public void humans_are_amazing_option_is_displayed() {

        MobileUtils.waitFor(2);

        Assert.assertTrue(dashboardPage.ImageButton.isDisplayed());

    }


}
