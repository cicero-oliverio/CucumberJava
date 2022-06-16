Feature: Test login

  Scenario: Check login is successful with valid credentials
    Given user browser is open
    And user is on login paga
    When user enters username and password
    And user clicks on login
    Then user is navigated to the home page