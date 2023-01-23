Feature: Employee profile update verification

Scenario: Login as an Employee
Given I am in Landing Page
When I Click on Login Menu
And I Will see Employee Login Page "Employee Login"
Then I Enter Employee user id "testpilot@gmail.com"
And I Enter Employee password "1234"
When I click Employee login button
Then I Will see Employee Home Page "Welcome Test"
Then  I click My Profile button
Then I will see My Info Page "My Info"
Then I will click update info button
Then I will see Employee Page "Update Employee Info"
And I Will clear contact
And I Will enter new contact "123456"
And I Will clear address
And I Will update address "Texas"
Then I Will click submit button
Then I click refresh url
Then I will see Employee updated contact "123456"
Then I will see Employee updated address "Texas"