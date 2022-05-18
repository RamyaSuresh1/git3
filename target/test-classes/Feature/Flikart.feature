 Feature: Login feature for flikart

  Scenario: Flikart login credentials Testing
    Given user is in flikart  login page
    When the user enters the valid email/mobile number and password.
    And clicks on the login button.
    Then the user should be navigated to home page.
