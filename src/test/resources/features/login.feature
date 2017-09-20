Feature: Login
	Users can login 
	
Scenario: Valid login
Given I enter username "FelixTheCat"
  And I enter password "ILoveSleep"  
When I login
Then the home page should say "Hello FelixTheCat!"
## Can you refactor the given steps to use a datatable? 

Scenario: Invalid login
Given I enter username "RoverTheDog"
  And I enter password "woof"  
When I login
Then I see an error "Invalid Credentials" 