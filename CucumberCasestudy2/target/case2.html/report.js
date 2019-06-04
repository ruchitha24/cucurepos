$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Casestudy/case2.feature");
formatter.feature({
  "name": "login and add to cart",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User enters Username and Password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the login page is opened",
  "keyword": "Given "
});
formatter.match({
  "location": "Case1.the_login_page_is_opened()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters lalitha as username",
  "keyword": "When "
});
formatter.match({
  "location": "Case1.user_enters_lalitha_as_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters password123 as password",
  "keyword": "And "
});
formatter.match({
  "location": "Case1.user_enters_password_as_password(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will Finds a testmeapp homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "Case1.user_will_Finds_a_testmeapp_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Larry added headphone to the cart",
  "keyword": "When "
});
formatter.match({
  "location": "Case1.larry_added_headphone_to_the_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Checkout for the payment",
  "keyword": "And "
});
formatter.match({
  "location": "Case1.checkout_for_the_payment()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "fills transaction details",
  "keyword": "And "
});
formatter.match({
  "location": "Case1.fills_transaction_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the product is successfully ordered",
  "keyword": "Then "
});
formatter.match({
  "location": "Case1.the_product_is_successfully_ordered()"
});
formatter.result({
  "status": "passed"
});
});