 Feature: User Information

   As a user
   I want to see user information
   So that I can see user information

   Scenario: GET - Get user information
     Given I set GET api endpointss
     When I send GET HTTP requestt
     Then I receive valid HTTP response code 2000

   Scenario: GET - Get user information without token
     Given I set GET api endpointsss
     When I send GET HTTP requesttt
     Then I receive valid HTTP response code 4000
