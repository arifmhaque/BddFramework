Feature: Login

Scenario: Successful login with valid credentials
  
  Given User launch firefox browser
  When User opens URL "https://admin-demo.nopcommerce.com/login"
  And User enters emails as "admin@yourstore.com" and password as "admin"
  And Click login
  Then Page title should be "Dashboard / nopCommerce administration"
  When User click logout link 
  Then Page title shoule be "Your store. Login"
  And Close the browser
  
  Scenario Outline: Data Driven Login
   
   
  Given User launch firefox browser
  When User opens URL "https://admin-demo.nopcommerce.com/login"
  And User enters emails as "<email>" and password as "<password>"
  And Click login
  Then Page title should be "Dashboard / nopCommerce administration"
  When User click logout link 
  Then Page title shoule be "Your store. Login"
  And Close the browser 
  
  Examples:
         |email | password|
         |admin@yourstore.com|admin|
         |admin1@yourstore.com|admin123|
  