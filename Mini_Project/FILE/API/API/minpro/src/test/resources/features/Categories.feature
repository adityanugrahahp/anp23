Feature: Categories

  As a user
  I want to create new category
  So that I can make more category

  Scenario: POST - Add new category
    Given I set POST api endpointsf
    When I send POST HTTP requestj
    Then I receive valid HTTP response code 200b

  Scenario: POST - Add new category without description data payload
    Given I set POST api endpointsf
    When I send POST HTTP requestf
    Then I receive valid HTTP response code 400f

  Scenario: POST - Add new category without name data payload
    Given I set POST api endpointsf
    When I send POST HTTP requestg
    Then I receive valid HTTP response code 500g

  Scenario: GET - Get list all categories
    Given I set GET api endpoints
    When I send GET HTTP requesth
    Then I receive valid HTTP response code 200c

  Scenario: GET - Get categories by ID
    Given I set GET api endpoints
    When I send GET HTTP requesti
    Then I receive valid HTTP response code 200d