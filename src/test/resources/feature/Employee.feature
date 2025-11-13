@employee
Feature: Employee
  In order to track the employee records
  As a user
  I want to add, edit, delete employee details in the portal

  @regression
  Scenario Outline: AddValidEmployee
    Given User have browser with OrangeHRM application
    When User enter username as "<username>"
    And User enter password as "<password>"
    And User clicks on login
    And User click on PIM menu
    And User click on Add Employee menu
    And User fill the employee form
      | firstName | middleName   | lastName |
      | <fName>   | <middleName> | <lName>  |
    And User save the employee form
    Then User should get the profile name as "<fName> <lName>"
    And User should get firstname field as "<fName>"
    Examples:
      | username | password | fName | middleName | lName   |
      | Admin    | admin123 | saul  | w          | goodman |
      | Admin    | admin123 | john  | w          | wick    |



