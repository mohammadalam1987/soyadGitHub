Feature: Employee Order List Functionalities

Scenario: Login as an Employee
Given I am in Landing Page
When I Click on Login Menu
And I Will see Employee Login Page "Employee Login"
Then I Enter Employee user id "testpilot@gmail.com"
And I Enter Employee password "1234"
When I click Employee login button
Then I Will see Employee Home Page "Welcome Test"
And I will click Order List button
Then I will see Order List Page "Employee Id: 102"
And I click Order Product Menu
Then I will see Product Order page "Order Product"
And I Select Product Name
And I Enter Order Date "10/10/2022"
When I click Order Product button
Then I will see Order List Page "Employee Id: 102"
And I click on Confirm button
And I will refresh page
Then I will see Status "Confirmed"