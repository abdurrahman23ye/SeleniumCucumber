@tumu
Feature: Register user and Login



    Background:
    Given Launch browser
    Then Navigate to url "mainpage"
    And Verify that home page is visible successfully
    And Click on Signup / Login button

  @task
  Scenario: Register User

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
    And Close the page
    
    Then wait 5 seconds


    @task
    Scenario: Login User with correct email and password


    And Verify Login to your account is visible
    And Enter correct email address and password
    And Click login button
    And Verify that Logged in as username is visible
    And Click Delete Account button
    And Close the page
    Then wait 5 seconds
      
      @task
      Scenario:Login user with incorrect email and password

      And Verify Login to your account is visible
      And Enter incorrect email address and password
      And Click login button
      And Verify error Your email or password is incorrect! is visible
      And Close the page















