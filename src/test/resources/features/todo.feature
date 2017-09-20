Feature: Todos
  Users can add todos and view

  Scenario: Add Todo and read it
    Given I create the todo:
      | note            |
      | "Annoy the dog" |
    When I view my todos
    Then I should see:
      | note          | dateCreated | status      |
      | Annoy the dog | today       | To be done  |
      
# Come up with some more scenarios! Be as creative as you can
