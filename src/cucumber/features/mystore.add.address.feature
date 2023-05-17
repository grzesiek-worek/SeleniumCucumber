Feature: MyStore User create new address after login
  Scenario Outline: User successfully create new address
    Given User is logged in to MyStore "https://mystore-testlab.coderslab.pl/index.php?controller=authentication&back=my-account"
    When User click on Addresses and goes to "https://mystore-testlab.coderslab.pl/index.php?controller=addresses"
    And Click on "+Create new address"
    And Fill form New Address: "<alias>", "<address>", "<city>", "<zip/postal code>", "<country>", "<phone>"
    Then Check whether the data in the added address are correct: "<alias>", "<address>", "<city>", "<zip/postal code>", "<country>", "<phone>"
    Examples:
      | alias | address            | city   | zip/postal code | country        | phone       |
      | home  | 12 Victoria Square | London | SW1W 0RA        | United Kingdom | 666-777-888 |