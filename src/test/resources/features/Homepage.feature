Feature: Validate multiple product titles by ID

  Scenario: Validate multiple product titles
    Given user is on homepage
    When check multiple titles and ids
      | id  | title             | price |
      | 1   | Samsung galaxy s6 | $360   |
      | 2   | Nokia lumia 1520  | $820   |
      | 3   | Nexus 6           | $650   |
