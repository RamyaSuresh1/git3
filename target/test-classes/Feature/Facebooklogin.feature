Feature: Facebook functionality testing

  Scenario Outline: Facebook login credential testing
    Given user is an the facebook login page
    When user should enter the"<username>" and"<password>"
    And user should click the login button
    Then user should verify the success message

    Examples: 
      | username | password   |
      | suresh   | suresh@123 |
      | ram      | ram@123    |
