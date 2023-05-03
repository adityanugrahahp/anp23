Feature: Login

    As a user
    I want to see the proucts
    So that I can request to the api endpoints to login

    Scenario: POST - Login with valid account
        Given I set POST api endpoints
        When I send POST HTTP request
        Then I receive valid HTTP response code 200

    Scenario: POST - Login with empty email
        Given I set POST api endpoints
        When I send POST HTTP request1
        Then I receive valid HTTP response code 400

    Scenario: POST - Login with empty password
        Given I set POST api endpoints
        When I send POST HTTP request2
        Then I receive valid HTTP response code 4002

    Scenario: POST - Login without payload
        Given I set POST api endpoints
        When I send POST HTTP request3
        Then I receive valid HTTP response code 4003

    Scenario: POST - Login with empty body parameter
        Given I set POST api endpoints
        When I send POST HTTP request4
        Then I receive valid HTTP response code 4004