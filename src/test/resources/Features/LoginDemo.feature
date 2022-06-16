Feature: Test login

  Scenario Outline: Check login is successful with valid credentials
    Given user browser is open
    And user is on login paga
    When user enters <username> and <password>
    And user clicks on login
    Then user is navigated to the home page

    Examples:
      | username | password |
      | Raghav   | 12345    |
      | Ele      | 12345    |
