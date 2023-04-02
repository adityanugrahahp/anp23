Feature: newPost
  As an admin
  I want to create new data
  So that I can create new post data

  Scenario: Post - As admin I have be able to create new data
    Given I set POST endpoints
    When I send POST HTTP request
    Then I receive valid HTTP response code 201
    And I receive valid data for detail data