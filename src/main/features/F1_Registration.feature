@smoke

Feature: users could register with new accounts

  Scenario: guest user could register with valid data successfully
    Given user navigates to register page
    And user select gender
     When enter first name and last name
    And user enter date of birth
    And user enter email
    And user fills Password fields
    Then user could register successfully
