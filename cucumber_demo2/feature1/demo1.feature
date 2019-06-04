Feature: Login Action Test

  Scenario: successful login with valid credentials
    Given user login page is opened
    When user enters "Lalitha" as a username and "password123" as password
    When user click on login button
    Then will find a testmeapp homepage
