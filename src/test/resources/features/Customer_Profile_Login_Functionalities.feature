Feature: Customer Profile Login page.

Scenario: Login as an Customer
Given I am in Landing Page
When I Click on Login Menu
And Click Customer Login
Then I enter Customer User Id "david@gmail.com"
And I enter Customer Password "1234"
When I click Customer Login button
Then I will see Customer Home Page "Welcome David1"