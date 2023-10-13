Feature: User
  As an admin
  I want to see list of user
  So that I can create new user

  Scenario: Get - As admin I have be able to get list user
    Given I set GET endpoints
    When I send GET HTTP request
    Then I receive valid HTTP response code 200

  Scenario: POST - As admin I have be able to to create new user
    Given I set POST endpoints
    When I send POST HTTP request
    Then I receive valid HTTP response code 201
    And I receive valid data for new user

  Scenario: POST - Invalid endpoint
    Given I set POST Invalid endpoints
    When I send POST Invalid HTTP request
    Then I receive valid HTTP response code 404


  Scenario: Get - As admin I have be able to get detail user
    Given I set GET endpoints
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for detail user

  Scenario: Get - Invalid endpoint
    Given I set GET Invalid endpoints
    When I send GET Invalid HTTP request
    Then I receive valid HTTP response code 404
#    And I receive valid data for detail user

  Scenario: PUT - As admin I have be able to to update existing user
    Given I set PUT endpoints
    When I send PUT HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for existing user

  Scenario: PUT - Invalid endpoint
    Given I set PUT Invalid endpoints
    When I send PUT Invalid HTTP request
    Then I receive valid HTTP response code 404

  Scenario: DELETE- As admin I have be able to to delete existing user
    Given I set DELETE endpoints
    When I send DELETE HTTP request
    Then I receive valid HTTP response code 200

  Scenario: DELETE- Invalid Endpoint
    Given I set DELETE Invalid endpoints
    When I send DELETE Invalid HTTP request
    Then I receive valid HTTP response code 404

#if how java lang 'null', change Edit Configuration in Main Class with net.serenitybdd.cucumber.cli.Main
