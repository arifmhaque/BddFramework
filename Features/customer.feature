Feature: Customer

Scenario: Add a new customer
  
  Given User launch firefox browser
  When User opens URL "https://admin-demo.nopcommerce.com/login"
  And User enters emails as "admin@yourstore.com" and password as "admin"
  And Click login
  Then User can veiw Dashboard
  When User Click Customer Menu
  And Click on Customer Item
  And Click on Add New Menu
  Then User can veiw Add new Customer page
  When user enter customer info
  And click on save button
  Then User can view confirmation message "The new customer has been added successfully"
  And Close the browser