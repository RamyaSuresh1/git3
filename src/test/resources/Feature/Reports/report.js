$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/Facebooklogin.feature");
formatter.feature({
  "name": "Facebook functionality testing",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Facebook login credential testing",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is an the facebook login page",
  "keyword": "Given "
});
formatter.step({
  "name": "user should enter the\"\u003cusername\u003e\" and\"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user should click the login button",
  "keyword": "And "
});
formatter.step({
  "name": "user should verify the success message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "suresh",
        "suresh@123"
      ]
    },
    {
      "cells": [
        "ram",
        "ram@123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Facebook login credential testing",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is an the facebook login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefFB.user_is_an_the_facebook_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter the\"suresh\" and\"suresh@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefFB.user_should_enter_the_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefFB.user_should_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should verify the success message",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefFB.user_should_verify_the_success_message()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Facebook login credential testing",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is an the facebook login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefFB.user_is_an_the_facebook_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter the\"ram\" and\"ram@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefFB.user_should_enter_the_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefFB.user_should_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should verify the success message",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefFB.user_should_verify_the_success_message()"
});
formatter.result({
  "status": "passed"
});
});