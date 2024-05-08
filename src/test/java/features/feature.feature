Feature: End-to-end integration testing for Tira Beauty ecommerce application
@Regression @Regression @Regression @NegativeTest @Smoke @Smoke @NegativeTest 

  Scenario: User login
    Given the user has navigated to the login page
    When the user enters "<username>" and "<password>"
    Then the system should display a successful login message

  Scenario: Product Search
    Given the user is logged in
    When the user searches for the "<product>"
    Then the system should display the product results related to "<product>"

  Scenario: Failed Payment Process
    Given the user has selected products and proceeded to checkout
    When the user attempts to pay with invalid card details "<card_number>"
    Then the system should display a payment failed message

  Scenario: Add Product to Cart
    Given a user is on a product "<product>" details page
    When the user clicks on add to cart
    Then the product should be successfully added to the cart

  Scenario: Attempt to Add Out-of-Stock Product to Cart
    Given a user is on an out-of-stock product "<product>" page
    When the user attempts to add the product to the cart
    Then the system should notify the user that the product is out of stock
