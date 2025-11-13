@login
Feature: Login
  In order to manage employee records
  As a user
  I would like to login to the dashboard

  Background:
    Given User have browser with OrangeHRM application

  @valid @regression @smoke
  Scenario: ValidLogin
    When User enter username as "Admin"
    And User enter password as "admin123"
    And User clicks on login
    Then User should get access to dashboard with header as "Quick Launch"

  @smoke
  Scenario Outline: InvalidLogin
    When User enter username as "<username>"
    And User enter password as "<password>"
    And User clicks on login
    Then User should not get access with error "<expected_error>"
    Examples:
      | username | password | expected_error      |
      | saul     | saul123  | Invalid credentials |
      | kim      | kim123   | Invalid credentials |


