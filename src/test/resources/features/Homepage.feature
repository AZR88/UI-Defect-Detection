Feature: Validate multiple product titles by ID

  Scenario: Validate multiple product titles
    Given user is on homepage
    When check multiple titles and ids
      | id  | title               | price   |
      | 1   | Samsung galaxy s6   | $360     |
      | 2   | Nokia lumia 1520    | $820     |
      | 3   | Nexus 6             | $650     |
      | 4   | Samsung galaxy s7   | $800     |
      | 5   | Iphone 6 32gb       | $790     |
      | 6   | Sony xperia z5      | $320     |
      | 7   | HTC One M9          | $700     |
      | 8   | Sony vaio i5        | $790     |
      | 9   | Sony vaio i7        | $790     |

    Then click next to show next product where title = "Apple monitor 24" and price = "400"

