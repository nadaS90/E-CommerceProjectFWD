@smoke

Feature: users could hover categories and select sub-categories

  Scenario: guest user could hover categories successfully
    Given user hover categories
    And user select sub category
    Then user directed to the item page
