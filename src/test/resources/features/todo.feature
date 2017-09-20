Feature: Todos
  Users can add todos and view

  Scenario: Add Todo and read it
    Given I am FelixTheCat
    When I view my todos
    Then I should see:
      | What to do    | dateCreated | status      |
      | Annoy the dog | 2017-10-02  | NOT_DONE  |
      
# Come up with some more scenarios! Be as creative as you can. The web app should allow users to crete todos...
