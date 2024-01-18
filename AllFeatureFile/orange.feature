Feature: Test Orange HRM Application

  Scenario: validate login page functionality
    Given user is on login page
    And user enter valid username and password and click on login button

  Scenario: Validate Home Page Functionality
    Given user is on home page and validate home page title
    And user validate home page url

  Scenario: validate home page logo
    When user is on home page and validate home page logo

  Scenario: Validate PIM Page Functionality
    When user click on pim page
    And validate user is on pim page
