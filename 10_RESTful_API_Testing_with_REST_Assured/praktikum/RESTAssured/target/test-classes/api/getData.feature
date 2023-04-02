Feature: getData
  As an admin
  I want to see list of data
  So that I can create new data

  Scenario: Get - As admin I have be able to get detail user
    Given I set GET endpoints
    When I send GET HTTP request
    Then I receive valid HTTP response code 404
    And I receive valid data for detail data