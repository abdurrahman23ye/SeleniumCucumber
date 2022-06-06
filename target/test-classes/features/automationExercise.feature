Feature: AutomationExercise

  Scenario: Test Case 1: Register User




    Given Launch browser
    Then Navigate to url http://automationexercise.com
    And Verify that home page is visible successfully
    And Click on Signup / Login button
    And Verify New User Signup! is visible
    And Enter name and email address
    And Click Signup button
    And Verify that ENTER ACCOUNT INFORMATION is visible
    And Fill details: Title, Name, Email, Password, Date of birth
    And Select checkbox Sign up for our newsletter!
    And Select checkbox Receive special offers from our partners!Fill details: First name, Last name, Company, Address,
    And Click Create Account button
    And Verify that ACCOUNT CREATED! is visible
    And Click Continue button
    And Verify that Logged in as username is visible
    And Click Delete Account button










