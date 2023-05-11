Feature: MyStore User orders and buys the product after login
  Scenario Outline: User successfully orders and buys the product
    Given User is logged in to MyStore  "https://mystore-testlab.coderslab.pl/index.php?controller=authentication&back=my-account"
    When User choose to buy "<name>"
    And Choose "<size>" size
    And Choose <pieces> pieces
    And Add to cart
    And Go to options 'checkout'
    And Confirm address
    And Select a pickup method - PrestaShop 'pickup in store'
    And Choose a payment option - 'Pay by Check'
    Then Click on - order with an obligation to pay
    Then Take screenshot of the order confirmation and amount
    Then Close  browser

    Examples:
      | name                        | size | pieces |
      | Hummingbird Printed Sweater | M    | 5      |
