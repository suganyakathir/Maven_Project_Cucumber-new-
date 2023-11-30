Feature: To validate the register functionality
 #Background:The user should be in bigw register page
 @regression
 Scenario: Invalid_register- To validate the registration functionality of the application
  Given The user should be in bigw register page
  When The user click the create new account button
  And The user has to fill the required details
  |suganya.iniya23@gmail.com|9677747233|
  And The user has to click the "create my account" button
  Then The user should navigate to the user profile page
  
  @retest 
 Scenario: Valid_register- To validate the registration functionality of the application
  Given The user should be in bigw register page
  When The user click the create new account button
  And The user has to fill the required details
  |suganyaraju@gmail.com|9875342693|
  And The user has to click the "create my account" button
  Then The user should navigate to the user profile page
   
 