Feature: Order

  As a user
  I want to order something
  So that I can order item that I want

  Scenario: POST - Add new orders
    Given I set POST api endpoint
    When I send POST HTTP requestx
    Then I receive valid HTTP response code 200x

  Scenario: GET - Get all order
    Given I set GET api endpoint
    When I send GET HTTP requesty
    Then I receive valid HTTP response code 200y

  Scenario: GET - Get all order without login
    Given I set GET api endpoint
    When I send GET HTTP requestz
    Then I receive valid HTTP response code 200z
