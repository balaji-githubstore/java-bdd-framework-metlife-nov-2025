package com.metlife.steps;

import com.metlife.hooks.AutomationHooks;
import com.metlife.pages.DashboardPage;
import com.metlife.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginSteps  {
    private LoginPage loginPage;
    private DashboardPage dashboardPage;
    public LoginSteps(LoginPage login,DashboardPage dashboardPage)
    {
        this.loginPage=login;
        this.dashboardPage=dashboardPage;
    }

    @Given("User have browser with OrangeHRM application")
    public void user_have_browser_with_orange_hrm_application() {

        loginPage.navigateToUrl();
    }
    @When("User enter username as {string}")
    public void user_enter_username_as(String username) {
        loginPage.enterUsername(username);


    }
    @When("User enter password as {string}")
    public void user_enter_password_as(String password) {
        loginPage.enterPassword(password);
    }
    @When("User clicks on login")
    public void user_clicks_on_login() {
        loginPage.clickOnLogin();
    }
    @Then("User should get access to dashboard with header as {string}")
    public void user_should_get_access_to_dashboard_with_header_as(String expectedValue) {
        String actualValue =dashboardPage.getQuickLaunchText();
        Assert.assertEquals(actualValue, expectedValue);
    }
    @Then("User should not get access with error {string}")
    public void user_should_not_get_access_with_error(String expectedError) {
        String actualError = loginPage.getInvalidErrorMessage();
        Assert.assertEquals(actualError, expectedError);
    }
}
