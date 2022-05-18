Feature: Facebook functionality testing

  Scenario: Facebook login credential testing
    Given user is an the facebook login pageone
    When user should enter the usernameone and password
    And user should click the login buttonone
    @smoke
     Scenario: Facebook login credential testing
    Given user is an the facebook login pagetwo
    When user should enter the usernametwo and password
    And user should click the login buttontwo
    @sanity
    Scenario: Facebook login credential testing
    Given user is an the facebook login pagethree
    When user should enter the usernamethree and password
    And user should click the login buttonthree
    @Reg
    Scenario: Facebook login credential testing
    Given user is an the facebook login pagefour
    When user should enter the usernamefour and password
    And user should click the login buttonfour
    @smoke
    Scenario: Facebook login credential testing
    Given user is an the facebook login pagefive
    When user should enter the usernamefive and password
    And user should click the login buttonfive

    