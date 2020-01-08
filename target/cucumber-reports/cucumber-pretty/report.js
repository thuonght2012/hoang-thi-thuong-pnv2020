$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/loginCustomer.feature");
formatter.feature({
  "line": 1,
  "name": "Customer login",
  "description": "In order to user can log in, I want to see my profile so I can log in easily",
  "id": "customer-login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "User can login website",
  "description": "",
  "id": "customer-login;user-can-login-website",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I choose account as \u003cname\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Click button Login",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Verify information of user logged correctly",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "customer-login;user-can-login-website;",
  "rows": [
    {
      "cells": [
        "name"
      ],
      "line": 13,
      "id": "customer-login;user-can-login-website;;1"
    },
    {
      "cells": [
        "Harry Potter"
      ],
      "line": 14,
      "id": "customer-login;user-can-login-website;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Open website http://www.way2automation.com/angularjs-protractor/banking/#/customer",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.way2automation.com/angularjs-protractor/banking/#/customer",
      "offset": 13
    }
  ],
  "location": "CommonTest.user_already_on_home_page(String)"
});
formatter.result({
  "duration": 13103508100,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "User can login website",
  "description": "",
  "id": "customer-login;user-can-login-website;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I choose account as Harry Potter",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Click button Login",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Verify information of user logged correctly",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Harry Potter",
      "offset": 20
    }
  ],
  "location": "LoginTest.chooseAccount(String)"
});
formatter.result({
  "duration": 3700122500,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.clickSubmit()"
});
formatter.result({
  "duration": 3254185600,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.verifyInfoCorrect()"
});
formatter.result({
  "duration": 3050948300,
  "status": "passed"
});
});