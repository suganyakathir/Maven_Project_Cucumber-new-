$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/feature/login.feature");
formatter.feature({
  "name": "To validate the login functionality of bigw application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Invalid_login- To validate the login functionality with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@retest"
    }
  ]
});
formatter.step({
  "name": "The user should be in bigw login",
  "keyword": "Given "
});
formatter.step({
  "name": "The user has to click account button",
  "keyword": "When "
});
formatter.step({
  "name": "The user has to enter the \"\u003cemailid\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "The user has to click \"login\" button",
  "keyword": "And "
});
formatter.step({
  "name": "The user should navigate to the invalid login page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "emailid",
        "password"
      ]
    },
    {
      "cells": [
        "suganya@gmail.com",
        "2455678"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Invalid_login- To validate the login functionality with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@retest"
    }
  ]
});
formatter.step({
  "name": "The user should be in bigw login",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.the_user_should_be_in_bigw_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has to click account button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStep.the_user_has_to_click_account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has to enter the \"suganya@gmail.com\" and \"2455678\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.the_user_has_to_enter_the_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has to click \"login\" button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.the_user_has_to_click_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should navigate to the invalid login page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.the_user_should_navigate_to_the_invalid_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Valid_login- To validate the login functionality with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    },
    {
      "name": "@retest"
    }
  ]
});
formatter.step({
  "name": "The user should be in bigw login",
  "keyword": "Given "
});
formatter.step({
  "name": "The user has to click account button",
  "keyword": "When "
});
formatter.step({
  "name": "The user has to enter the \"\u003cemailid\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "The user has to click \"login\" button",
  "keyword": "And "
});
formatter.step({
  "name": "The user should navigate to the invalid login page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "emailid",
        "password"
      ]
    },
    {
      "cells": [
        "kathir@gmail.com",
        "6765379"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Valid_login- To validate the login functionality with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    },
    {
      "name": "@retest"
    }
  ]
});
formatter.step({
  "name": "The user should be in bigw login",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.the_user_should_be_in_bigw_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has to click account button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStep.the_user_has_to_click_account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has to enter the \"kathir@gmail.com\" and \"6765379\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.the_user_has_to_enter_the_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has to click \"login\" button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.the_user_has_to_click_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should navigate to the invalid login page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.the_user_should_navigate_to_the_invalid_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/feature/register.feature");
formatter.feature({
  "name": "To validate the register functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Invalid_register- To validate the registration functionality of the application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "The user should be in bigw register page",
  "keyword": "Given "
});
formatter.match({
  "location": "RegisterSteps.the_user_should_be_in_bigw_register_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click the create new account button",
  "keyword": "When "
});
formatter.match({
  "location": "RegisterSteps.the_user_click_the_create_new_account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has to fill the required details",
  "rows": [
    {
      "cells": [
        "suganya.iniya23@gmail.com",
        "9677747233"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.the_user_has_to_fill_the_required_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has to click the \"create my account\" button",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.the_user_has_to_click_the_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should navigate to the user profile page",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterSteps.the_user_should_navigate_to_the_user_profile_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Valid_register- To validate the registration functionality of the application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@retest"
    }
  ]
});
formatter.step({
  "name": "The user should be in bigw register page",
  "keyword": "Given "
});
formatter.match({
  "location": "RegisterSteps.the_user_should_be_in_bigw_register_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click the create new account button",
  "keyword": "When "
});
formatter.match({
  "location": "RegisterSteps.the_user_click_the_create_new_account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has to fill the required details",
  "rows": [
    {
      "cells": [
        "suganyaraju@gmail.com",
        "9875342693"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.the_user_has_to_fill_the_required_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has to click the \"create my account\" button",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.the_user_has_to_click_the_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should navigate to the user profile page",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterSteps.the_user_should_navigate_to_the_user_profile_page()"
});
formatter.result({
  "status": "passed"
});
});