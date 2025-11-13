#Feature: Employee
#  In order to track the employee records
#  As a user
#  I want to add, edit, delete employee details in the portal
#
#  Scenario: AddValidEmployee
#    Given User have browser with OrangeHRM application
#    When User enter username as "Admin"
#    And User enter password as "admin123"
#    And User clicks on login
#    And User click on PIM menu
#    And User click on Add Employee menu
#    And User fill the employee form
#      | firstName | middleName | lastName |
#      | john      | w          | wick     |
#    And User save the employee form
#    Then User should get the profile name as "john wick"
#    And User should get firstname field as "john"
#
#  Scenario: AddValidEmployee
#    Given User have browser with OrangeHRM application
#    When User enter username as "Admin"
#    And User enter password as "admin123"
#    And User clicks on login
#    And User click on PIM menu
#    And User click on Add Employee menu
#    And User fill the employee form
#      | firstName | middleName | lastName |
#      | kim      | w          | wick     |
#    And User save the employee form
#    Then User should get the profile name as "kim wick"
#    And User should get firstname field as "kim"
