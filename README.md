# Automation Testing - Task: MyStore portal

Task using: Java, Selenium, WebDriver, JUnit, Gherkin, Cucumber and Page Factory

![Java](https://img.shields.io/badge/-JAVA-0A1A5A?style=flat&logo=java) 
![Selenium](https://img.shields.io/badge/-Selenium-0A1A5A?style=flat&logo=selenium)
![WebDriver](https://img.shields.io/badge/-WebDriver-0A1A5A?style=flat&logo=webdriver)
![JUnit](https://img.shields.io/badge/-JUnit-0A1A5A?style=flat&logo=junit)
![Gherkin](https://img.shields.io/badge/-Gherkin-0A1A5A?style=flat&logo=java) 
![Cucumber](https://img.shields.io/badge/-Cucumber-0A1A5A?style=flat&logo=selenium)
![](https://img.shields.io/badge/-PageFactory-0A1A5A?style=flat&logo=pagefactory)

## Task description:
### Initial data:
* Create an email on any portal (for example https://10minutemail.com/)
* Create user account on the MyStore portal

### To do:
Write a scripts that:
1) ** First task: ** (Scenario Outline:User successfully create new address)
- will log in with the created user
- will enter by clicking on the "Addresses" tile after logging in
- click on "+Create new address"
- fill in the "New address form" - data should be taken from the examples table in Gherkin (alias, address, city, zip/postal code, country, phone)
- check if the address has been added correctly

2) ** Second task: ** ... in progrress ... (Scenario Outline: User successfully orders and buys the product)
- User is logged in to MyStore
- User choose to buy product
- Choose product size
- Choose product pieces
- Add to cart
- Go to options 'checkout'
- Confirm address
- Select a pickup method
- Choose a payment option
- Click on 'order with an obligation to pay'
- Take screenshot of the order confirmation and amount

