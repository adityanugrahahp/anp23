Feature: Product

  As a user
  I want to see the product on store
  So that I can make see product list

  Scenario: POST - Add new product
    Given I set POST api endpoints5
    When I send POST HTTP request5
    Then I receive valid HTTP response code 2005

  Scenario: POST - Add new product without Name payload
    Given I set POST api endpoints5
    When I send POST HTTP request6
    Then I receive valid HTTP response code 4006

  Scenario: POST - Add new product without Description payload
    Given I set POST api endpoints5
    When I send POST HTTP request7
    Then I receive valid HTTP response code 4007

  Scenario: GET - Get product by ID
    Given I set GET api endpoints1
    When I send GET HTTP request8
    Then I receive valid HTTP response code 2008

  Scenario: GET - Get all product
    Given I set GET api endpoints1
    When I send GET HTTP request9
    Then I receive valid HTTP response code 2009