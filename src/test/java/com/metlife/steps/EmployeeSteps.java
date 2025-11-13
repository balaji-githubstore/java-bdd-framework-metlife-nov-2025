package com.metlife.steps;

import com.metlife.hooks.AutomationHooks;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Map;

public class EmployeeSteps {
    @When("User click on PIM menu")
    public void user_click_on_pim_menu() {
        AutomationHooks.driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
    }
    @When("User click on Add Employee menu")
    public void user_click_on_add_employee_menu() {

    }


    @When("User fill the employee form")
    public void user_fill_the_employee_form(DataTable dataTable) {

        List<Map<String,String>> list= dataTable.asMaps();

        System.out.println(list.get(0).get("firstName"));
        System.out.println(list.get(0).get("middleName"));
        System.out.println(list.get(0).get("lastName"));

    }


    @When("User save the employee form")
    public void user_save_the_employee_form() {

    }
    @Then("User should get the profile name as {string}")
    public void user_should_get_the_profile_name_as(String expectedProfileName) {

    }
    @Then("User should get firstname field as {string}")
    public void user_should_get_firstname_field_as(String expectedFirstName) {

    }
}
