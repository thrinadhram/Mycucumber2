@UATTesting
Feature:
Orange login validating
Scenario: sucessful login with valid data 
Given User launch browser 
When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
Then  User Enter Uname as "Admin" and password as "admin123"
And click on login button
When  click on image
Then click logout btn
And close the browser


    