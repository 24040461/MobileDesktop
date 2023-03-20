Feature: search feature

  Background:
    Given user is on the home page
  Scenario: testing recent searches
    When user searches for a destination "Burnley"
    And user clicks search
    And and user clicks on the stays on the bottom bar
    Then user will see Burnley in recent searches
