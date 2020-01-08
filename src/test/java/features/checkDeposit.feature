Feature: Check deposit
  In order to user deposit successfully, I want to

  Background:
    Given Open website http://www.way2automation.com/angularjs-protractor/banking/#/customer

  Scenario Outline: User can deposit
    When I can login successfully with account as <username>
    And I click Deposit button
    And I input Amount to be Deposited as <amount>

    Examples:
      | username     | amount |
      | Harry potter | 2000   |