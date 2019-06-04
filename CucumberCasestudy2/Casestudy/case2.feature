Feature: login and add to cart

  Scenario: User enters Username and Password
    Given the login page is opened
    When user enters lalitha as username
    And user enters password123 as password
    Then user will Finds a testmeapp homepage

    When Larry added headphone to the cart
    And Checkout for the payment
    And fills transaction details
    Then the product is successfully ordered
