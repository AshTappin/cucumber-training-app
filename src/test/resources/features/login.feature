Feature: Login
	Cats can login 

Scenario: Valid login
Given I enter username "FelixTheCat"
  And I enter password "ILoveSleep"  
When I login
Then the home page should say "Meow FelixTheCat!"
