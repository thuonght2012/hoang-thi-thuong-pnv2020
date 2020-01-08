Feature: Customer login
  In order to user can log in, I want to see my profile so I can log in easily

  Background:
    Given Open website http://www.way2automation.com/angularjs-protractor/banking/#/customer

  Scenario Outline: User can login website
    When I choose account as <name>
    And Click button Login
    Then Verify information of user logged correctly

    Examples:
      | name        |
      | Harry Potter|