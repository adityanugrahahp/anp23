Feature: Register

  As a user
  I want to create new account
  So that I can login

  Scenario: POST - Register with valid data
    Given I set POST api endpoints
    When I send POST HTTP requesta
    Then I receive valid HTTP response code 200a

  Scenario: POST - Register without fullname
    Given I set POST api endpoints
    When I send POST HTTP requestb
    Then I receive valid HTTP response code 400

  Scenario: POST - Register without email
    Given I set POST api endpoints
    When I send POST HTTP requestc
    Then I receive valid HTTP response code 400

  Scenario: POST - Register without password
    Given I set POST api endpoints
    When I send POST HTTP requestd
    Then I receive valid HTTP response code 400

  Scenario: POST - Register with existed account
    Given I set POST api endpoints
    When I send POST HTTP requeste
    Then I receive valid HTTP response code 400