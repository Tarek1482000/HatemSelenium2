Feature: Login to WinjoGo website

  Scenario: Successful login with valid credentials
    Given The user is on the login page
    When  The user enters valid credentials
    And   Clicks on the Login button
    Then  The user should be logged in and redirected to the home page
    And   The page will be close
