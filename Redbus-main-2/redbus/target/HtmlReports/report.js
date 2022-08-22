$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/gmail.feature");
formatter.feature({
  "name": "To test the signup module functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "to verify that user enters valid gmail and password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on signup/signin window",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinition.ValidGmail.user_is_on_signup_signin_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters gmailorphone and gmailpassword",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinition.ValidGmail.user_enters_gmailorphone_and_gmailpassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should navigates to home page of redbus application",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.ValidGmail.user_should_navigates_to_home_page_of_redbus_application()"
});
formatter.result({
  "status": "passed"
});
});