Feature: Customer Profile Verification

Scenario: Login as an Customer
Given I am in Landing Page
When I Click on Login Menu
And Click Customer Login
Then I enter Customer User Id "david@gmail.com"
And I enter Customer Password "1234"
When I click Customer Login button
Then I will see Customer Home Page "Welcome David1"
Then I will click My Profile
Then I will see Page "My Info"
Then I will see My First "David1"
Then I will Last name "Smith"
Then I will see Email Address "david@gmail.com"
Then I will see Date of Birth "1998-06-24"
Then I will Gender "Male"
Then I will see contact number "2020202"
Then I will see Address "New York"