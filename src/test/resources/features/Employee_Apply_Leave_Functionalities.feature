Feature: Employee Apply leave functionalities

Scenario: Login as an Employee
Given I am in Landing Page
When I Click on Login Menu
And I Will see Employee Login Page "Employee Login"
Then I Enter Employee user id "testpilot@gmail.com"
And I Enter Employee password "1234"
When I click Employee login button
Then I Will see Employee Home Page "Welcome Test"
When I Click Apply leave button
Then I See employee leave Page "Apply Leave Form"
Then I write reason for apply leave "Urgent Break"
Then I Enter Start Date "09/19/2022"
Then I Enter End Date "09/29/2022"
Then I will click submit button
Then I will refresh Url
Then I will see Apply leave reason "Travel Vacation"
Then I will see Leave Status "Pending"