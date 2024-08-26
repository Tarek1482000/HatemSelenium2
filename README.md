# WinjiGo
# Selenium WebDriver Project - Create Course

This project demonstrates a Selenium WebDriver test script using the Page Object Model (POM) design pattern to automate the Creating Course in the WinjiGo website. Applying TestNg and Cucumber.
The script performs the following actions:

1. Opens the WinjiGo website.
2. Navigate To Courses Section.
3. Clicks "Add Course".
4. Fill Course Data".
5. Clicks "Create Course".
6. Navigate To Courses Section.
7. Search on the created Course.
8. Assert that the course is created and mark it.

## Prerequisites

Before running the test script, make sure you have the following installed:

- Java Development Kit (JDK)
- Maven
- WebDriver Manager executable (e.g., ChromeDriver for Google Chrome)
- TestNG (Test framework) For TestNg Project
- Cucumber (Test framework) For Cucumber Project
  
## Test Data
The test data for the scenarios can be found in the src/resources/testdata directory as customerdata. You can modify this data (in the order that been used) to test different scenarios.

## KSRTC Login page scenario 
## Failed login 
1. Fills username and password with wrong credentails 
2. Agrees on terms
3. Clicks login
4. Assert that error message has been shown
    
## Successful login
1. Fills username and password with correct credentails 
2. Agrees on terms
3. Clicks login
4. Assert that directed to the right page

## Running 
The loginTest runs as a standalone file

## Test Data
The test data for the scenarios can be found in the src/resources/testdata directory as testdata. You can modify this data (in the order that been used) to test different scenarios.

   
