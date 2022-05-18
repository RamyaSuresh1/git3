Feature: Login feature for instragram

  Scenario: Instragram login credentials testing
    Given user is an the Instragram login page
    When user should enter the valid username and password
    And user should click the login button
    Then user should verify the success messsage.
