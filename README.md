# Automation Testing - Task: MyStore portal

Task using: Java, Selenium, WebDriver, JUnit, Gherkin and Cucumber

![Java](https://img.shields.io/badge/-JAVA-0A1A5A?style=flat&logo=java) 
![Selenium](https://img.shields.io/badge/-Selenium-0A1A5A?style=flat&logo=selenium)
![WebDriver](https://img.shields.io/badge/-WebDriver-0A1A5A?style=flat&logo=webdriver)
![JUnit](https://img.shields.io/badge/-JUnit-0A1A5A?style=flat&logo=junit)
![Gherkin](https://img.shields.io/badge/-Gherkin-0A1A5A?style=flat&logo=java) 
![Cucumber](https://img.shields.io/badge/-Cucumber-0A1A5A?style=flat&logo=selenium)

## Task description:
### Initial data:
* Create an email on any portal (for example https://10minutemail.com/)
* Create user account on the MyStore portal

### To do:
Write a script that:
- will log in with the created user
- will enter by clicking on the "Addresses" tile after logging in
- click on "+Create new address"
- fill in the "New address form" - data should be taken from the examples table in Gherkin (alias, address, city, zip/postal code, country, phone)
- check if the address has been added correctly
