$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TagsFF.feature");
formatter.feature({
  "line": 3,
  "name": "Create Facebook Account12",
  "description": "As a user you need to open Facebook Homepage and do the validations",
  "id": "create-facebook-account12",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Important"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "Validate First Name field1",
  "description": "",
  "id": "create-facebook-account12;validate-first-name-field1",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User needs to be on Facebook Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User enters user \"David\" first name",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User checks if \"David\" first name is present",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "TagStepDef.user_needs_to_be_on_Facebook_Login_Page()"
});
formatter.result({
  "duration": 5520408500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "David",
      "offset": 18
    }
  ],
  "location": "TagStepDef.user_enters_user_first_name(String)"
});
formatter.result({
  "duration": 1252472700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "David",
      "offset": 16
    }
  ],
  "location": "TagStepDef.user_checks_if_first_name_is_present(String)"
});
formatter.result({
  "duration": 1053911000,
  "status": "passed"
});
formatter.match({
  "location": "TagStepDef.close_browser()"
});
formatter.result({
  "duration": 661972600,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Validate create user multiple fields2",
  "description": "",
  "id": "create-facebook-account12;validate-create-user-multiple-fields2",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@Smoke"
    },
    {
      "line": 14,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "User needs to be on Facebook Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "User enters user \"Ryan\" first name",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "User enters user \"Jack\" surname",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User checks if \"Ryan\" first name is present",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "User Mobile field should be blank",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "TagStepDef.user_needs_to_be_on_Facebook_Login_Page()"
});
formatter.result({
  "duration": 5403265500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ryan",
      "offset": 18
    }
  ],
  "location": "TagStepDef.user_enters_user_first_name(String)"
});
formatter.result({
  "duration": 1180879500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jack",
      "offset": 18
    }
  ],
  "location": "TagStepDef.user_enters_user_surname(String)"
});
formatter.result({
  "duration": 1163220900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ryan",
      "offset": 16
    }
  ],
  "location": "TagStepDef.user_checks_if_first_name_is_present(String)"
});
formatter.result({
  "duration": 1046183100,
  "status": "passed"
});
formatter.match({
  "location": "TagStepDef.user_mobile_field_should_be_blank()"
});
formatter.result({
  "duration": 1048386700,
  "status": "passed"
});
formatter.match({
  "location": "TagStepDef.close_browser()"
});
formatter.result({
  "duration": 653930700,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Validate First Name field4",
  "description": "",
  "id": "create-facebook-account12;validate-first-name-field4",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 31,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "User needs to be on Facebook Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "User enters user \"David\" first name",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "User checks if \"David\" first name is present",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "TagStepDef.user_needs_to_be_on_Facebook_Login_Page()"
});
formatter.result({
  "duration": 5819583900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "David",
      "offset": 18
    }
  ],
  "location": "TagStepDef.user_enters_user_first_name(String)"
});
formatter.result({
  "duration": 1216953400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "David",
      "offset": 16
    }
  ],
  "location": "TagStepDef.user_checks_if_first_name_is_present(String)"
});
formatter.result({
  "duration": 1049900400,
  "status": "passed"
});
formatter.match({
  "location": "TagStepDef.close_browser()"
});
formatter.result({
  "duration": 678499200,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "Validate First Name field5",
  "description": "",
  "id": "create-facebook-account12;validate-first-name-field5",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 39,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 42,
  "name": "User needs to be on Facebook Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 43,
  "name": "User enters user \"David\" first name",
  "keyword": "When "
});
formatter.step({
  "line": 44,
  "name": "User checks if \"David\" first name is present",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "TagStepDef.user_needs_to_be_on_Facebook_Login_Page()"
});
formatter.result({
  "duration": 5631227400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "David",
      "offset": 18
    }
  ],
  "location": "TagStepDef.user_enters_user_first_name(String)"
});
formatter.result({
  "duration": 1199659900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "David",
      "offset": 16
    }
  ],
  "location": "TagStepDef.user_checks_if_first_name_is_present(String)"
});
formatter.result({
  "duration": 1044126600,
  "status": "passed"
});
formatter.match({
  "location": "TagStepDef.close_browser()"
});
formatter.result({
  "duration": 663291400,
  "status": "passed"
});
});