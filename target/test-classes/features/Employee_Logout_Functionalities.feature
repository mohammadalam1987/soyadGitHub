Feature: Verify Employee Logout_Functionalities.

Scenario: Login as an Employee
Given I am in Landing Page
When I Click on Login Menu
And I Will see Employee Login Page "Employee Login"
Then I Enter Employee user id "testpilot@gmail.com"
And I Enter Employee password "1234"
When I click Employee login button
Then I Will see Employee Home Page "Welcome Test"
And I Click Employee Logout button
Then I Will see Employee Login Page "Employee Login"