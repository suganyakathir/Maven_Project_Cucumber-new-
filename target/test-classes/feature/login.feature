Feature: To validate the login functionality of bigw application
#Background: The user should be in bigw login
@smoke @retest
Scenario Outline: Invalid_login- To validate the login functionality with invalid credentials
  Given The user should be in bigw login
  When The user has to click account button
  And The user has to enter the "<emailid>" and "<password>"
  And The user has to click "login" button
  Then The user should navigate to the invalid login page
  
 
 Examples:
 |emailid          |password|
 |suganya@gmail.com|2455678|
 
 @sanity @retest
 Scenario Outline: Valid_login- To validate the login functionality with valid credentials
  Given The user should be in bigw login
  When The user has to click account button
  And The user has to enter the "<emailid>" and "<password>"
  And The user has to click "login" button
  Then The user should navigate to the invalid login page
  
 
 Examples:
 |emailid          |password|
 |kathir@gmail.com|6765379|
 
 
 
 
   

   
   