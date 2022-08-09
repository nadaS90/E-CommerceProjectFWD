@smoke

Feature: User will be able add items to wishlist

  Scenario: User selects item to add to wishist
    Given User clicks on add item wishlist
    Then Success message appears

  Scenario: user finds item in wishlist
    Given User clicks on add item wishlist
    And   User navigates to wishlist page
    Then  Item found in wishlist page


