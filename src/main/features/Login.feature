@smoke

Feature: users could use login functionality to use their accounts

  Scenario: user could login with valid email and password
    Given user go to login page
    And user enter email and password "test1@example.com" and "P@ssw0rd"
    Then user login to the system successfully
#    And user go to home page


  Scenario: user could not login with valid email and password
    Given user go to login page
    And user enter email and password "wrong@example.com" and "P@ssw0rd"
    Then user could not login to the system
