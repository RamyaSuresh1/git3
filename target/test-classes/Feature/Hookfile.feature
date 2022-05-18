Feature: Facebook functionality testing

  Scenario: Facebook login credential testing
    When user should enter the username and password
    And user should click the login button
    Then user should verify the success message