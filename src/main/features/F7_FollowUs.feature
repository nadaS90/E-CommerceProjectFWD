@smoke

Feature: User navigates to new tabs from followUs

  Scenario: User opens facebook link
    When user clicks on facebook
    Then user navigates to facebook "https://www.facebook.com/nopCommerce"

  Scenario: User opens Twitter link
    When user clicks on twitter
    Then user navigates to twitter "https://twitter.com/nopCommerce"

  Scenario: User opens rss link
    When user clicks on rss
    Then user navigates to rss "https://demo.nopcommerce.com/new-online-store-is-open"

  Scenario: User opens youtube link
    When user clicks on youtube
    Then user navigates to youtube "https://www.youtube.com/user/nopCommerce"
