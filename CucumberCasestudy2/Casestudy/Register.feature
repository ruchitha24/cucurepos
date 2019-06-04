Feature: Register and Login

  Scenario: Login to TestMeApp with the registered username and password.
    Given registeration page is opened
    And the user enters  username and password
    When user click on login button
    Then will find a testmeapp homepage
