Feature: Search Item
  Scenario: Search some value
    When Write "sofware" to search input
    When Click  search Button
    Then Check "Search results" text