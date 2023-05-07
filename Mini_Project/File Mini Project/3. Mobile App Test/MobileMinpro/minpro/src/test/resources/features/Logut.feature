Feature: Logout
  As a user
  I want to logout my account
  So that I can logout


  Scenario: As a user I want to logout form my account
    Given I am on the product list
    When I click button sign in
    And I input correct email in login
    And I input correct password in login
    And I click button login
    And I click button sign out
    Then I get result the message