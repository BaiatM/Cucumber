Feature: To Test Login Functionality
  Developer - Maggie
  Tester - Kristo

  Background:
    Given user open website
    And verify user is on login page
  @Smoke @Chirag
  Scenario: Verify Login Successful
    When user entered the valid credentials
    Then user is navigated to homepage
  @Regression @Baiat
  Scenario: Verify User Cannot Login With Invalid Credentials
    When user enter the invalid credentials
    Then verify invalid login error message is displayed