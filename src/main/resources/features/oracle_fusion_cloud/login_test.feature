Feature: Oracle Fusion Login Test

  Scenario Outline: Perform Login to Oracle Fusion Cloud
    Given we are running <Test Scenario>
    And user is on the oracle fusion login page
    And user provides credentials for login
    When the user click on Sign In
    Then the Oracle Fusion Home Page is displayed

    Examples:
      | Test Scenario  |
      | Login Test |
