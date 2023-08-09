Feature: Open multiple URLs in one browser

  Scenario: Open four URLs in the same browser window
    Given I am on the home page
    When I navigate to "http://www.google.com"
    And I navigate to "http://www.amazon.com"
    And I navigate to "http://www.facebook.com"
    Then I close the browser