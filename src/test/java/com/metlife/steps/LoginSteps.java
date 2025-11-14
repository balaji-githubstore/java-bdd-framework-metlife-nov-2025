package com.metlife.steps;

import com.metlife.hooks.AutomationHooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginSteps  {
    private AutomationHooks hooks;
    public LoginSteps(AutomationHooks hooks)
    {
        this.hooks=hooks;
    }

    @Given("User have browser with OrangeHRM application")
    public void user_have_browser_with_orange_hrm_application() {

        hooks.driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
    }
    @When("User enter username as {string}")
    public void user_enter_username_as(String username) {
        hooks.driver.findElement(By.name("username")).sendKeys(username);
    }
    @When("User enter password as {string}")
    public void user_enter_password_as(String password) {
        hooks.driver.findElement(By.name("password")).sendKeys(password);
    }
    @When("User clicks on login")
    public void user_clicks_on_login() {
        hooks.driver.findElement(By.xpath("//button[contains(normalize-space(),'Logi')]")).click();
    }
    @Then("User should get access to dashboard with header as {string}")
    public void user_should_get_access_to_dashboard_with_header_as(String expectedValue) {
        String actualValue = hooks.driver.findElement(By.xpath("//p[contains(normalize-space(),'Quick')]")).getText();
        Assert.assertEquals(actualValue, expectedValue);
    }
    @Then("User should not get access with error {string}")
    public void user_should_not_get_access_with_error(String expectedError) {
        String actualError = hooks.driver.findElement(By.xpath("//p[contains(normalize-space(),'Invalid')]")).getText();
        Assert.assertEquals(actualError, expectedError);
    }
}
