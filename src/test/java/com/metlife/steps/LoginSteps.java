package com.metlife.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Given("User have browser with OrangeHRM application")
    public void user_have_browser_with_orange_hrm_application() {
        System.out.println("given");
    }
    @When("User enter username as {string}")
    public void user_enter_username_as(String username) {
        System.out.println("when"+username);
    }
    @When("User enter password as {string}")
    public void user_enter_password_as(String password) {
        System.out.println("when"+password);
    }
    @When("User clicks on login")
    public void user_clicks_on_login() {
        System.out.println("when login");
    }
    @Then("User should get access to dashboard with header as {string}")
    public void user_should_get_access_to_dashboard_with_header_as(String expectedValue) {
        System.out.println("then "+expectedValue);
    }
    @Then("User should not get access with error {string}")
    public void user_should_not_get_access_with_error(String expectedError) {
        System.out.println("then "+expectedError);
    }
}
