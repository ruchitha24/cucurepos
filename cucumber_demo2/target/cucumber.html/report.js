$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Feature1/demo1.feature");
formatter.feature({
  "name": "Login Action Test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "successful login with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user login page is opened",
  "keyword": "Given "
});
formatter.match({
  "location": "demo2.user_login_page_is_opened()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"Lalitha\" as a username and \"password123\" as password",
  "keyword": "When "
});
formatter.match({
  "location": "demo2.user_enters_as_a_username_and_as_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on login button",
  "keyword": "When "
});
formatter.match({
  "location": "demo2.user_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "will find a testmeapp homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "demo2.will_find_a_testmeapp_homepage()"
});
formatter.result({
  "status": "passed"
});
});