Feature: Login Action

  Scenario Outline: Successful login with valid credentials
    Given user is open the application
    When user clicks on the signin application
    And user enters "<username>" and "<password>"
    Then message displayed login successfully

    Examples: 
      | username | password    |
      | Lalitha  | password123 |
      | admin    | password456 |
