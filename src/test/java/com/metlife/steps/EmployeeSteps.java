package com.metlife.steps;

import com.metlife.hooks.AutomationHooks;
import com.metlife.pages.DashboardPage;
import com.metlife.pages.MainPage;
import com.metlife.pages.PIMPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Map;

public class EmployeeSteps
{
    private DashboardPage dashboardPage;
    private PIMPage pimPage;
    private MainPage mainPage;

    public EmployeeSteps(DashboardPage dashboardPage,PIMPage pimPage,MainPage mainPage)
    {
        this.dashboardPage=dashboardPage;
        this.pimPage=pimPage;
        this.mainPage=mainPage;
    }

    @When("User click on PIM menu")
    public void user_click_on_pim_menu() {
        mainPage.clickOnPimPage();
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
