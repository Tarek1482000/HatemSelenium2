Feature: Create New Course

  Scenario: Create Course Successfully
    Given The user is on the home page
    When  The user navigates to the courses section
    And   The user clicks on the Add Course button
    And   The user fills all mandatory fields
    And   The user clicks on the create button
    Then  The user should be navigated to the created course page
    And   The user navigates to the courses section
    And   The user enters the created course name in the search field
    And   The user presses enter
    Then  The last created course with this name should display at the top
