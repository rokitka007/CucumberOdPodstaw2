# new feature
# Tags: optional
    
Feature: Check Destination Input

  @home
  Scenario Outline: Check destination input
    Given User goes on home page
    When User fill input with location "<miasto>"
    Then check location data "<miasto>"

    Examples:
    | miasto |
    | Gdansk |
