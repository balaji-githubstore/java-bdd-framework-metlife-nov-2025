package com.metlife.steps;

import com.metlife.hooks.AutomationHooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginSteps {

    @Given("User have browser with OrangeHRM application")
    public void user_have_browser_with_orange_hrm_application() {
        AutomationHooks.driver.navigate().to("https://opensource-demo.orangehrmlive.com/");

    }
    @When("User enter username as {string}")
    public void user_enter_username_as(String username) {
        AutomationHooks.driver.findElement(By.name("username")).sendKeys(username);
    }
    @When("User enter password as {string}")
    public void user_enter_password_as(String password) {

    }
    @When("User clicks on login")
    public void user_clicks_on_login() {

    }
    @Then("User should get access to dashboard with header as {string}")
    public void user_should_get_access_to_dashboard_with_header_as(String expectedValue) {

    }
    @Then("User should not get access with error {string}")
    public void user_should_not_get_access_with_error(String expectedError) {

    }
}
