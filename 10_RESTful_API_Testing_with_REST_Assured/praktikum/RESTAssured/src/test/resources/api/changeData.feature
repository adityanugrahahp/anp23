Feature: changeData
  As an admin
  I want to change data
  So that I can change data

  Scenario: Put - As admin I have be able to change data
    Given I set PUT endpoints
    When I send PUT HTTP request
    Then I receive valid HTTP response code 200
    And I update the data