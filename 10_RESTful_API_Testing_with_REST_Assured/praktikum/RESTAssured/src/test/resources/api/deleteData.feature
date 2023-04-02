Feature: deleteData
  As an admin
  I want to delete data
  So that I can delete data

  Scenario: Put - As admin I have be able to delete data
    Given I set DELET Eendpoints
    When I send DELETE HTTP request
    Then I receive valid HTTP response code 200
    And I deleted the data