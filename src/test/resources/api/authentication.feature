Feature: Authentication
  As an quality engineer
  I want to be able to authenticate my account
  So that I can access all the features

  Scenario: POST - Successful Register
    Given I set POST endpoints Register
    When I send POST HTTP request Register
    Then I receive response code 200 Register
    And I receive valid data for Register

  Scenario: POST - Register invalid endpoint
    Given I set POST Register invalid endpoint
    When I send POST HTTP request Register invalid endpoint
    Then I receive response code 404 for Register

  Scenario: POST - Successful Login
    Given I set POST endpoints Login
    When I send POST HTTP request Login
    Then I receive response code 200 Login


  Scenario: POST - Login invalid endpoint
    Given I set POST Login invalid endpoint
    When I send POST HTTP request Login invalid endpoint
    Then I receive response code 404 for Login invalid endpoint

  Scenario: GET - Successful Get user information
    Given I set GET endpoints user information
    When I send GET HTTP request user information
    Then I receive response code 200 for get user information
    And I receive valid data for user information

  Scenario: GET - Get user information invalid endpoint
    Given I set GET user information invalid endpoint
    When I send GET HTTP request user information invalid endpoint
    Then I receive response code 404 for Get user information invalid endpoint



  Scenario: POST - Register invalid method
    Given I set POST Register invalid method
    When I send POST HTTP request Register invalid method
    Then I receive response code 405 for Register invalid method

  Scenario: POST - Login invalid method
    Given I set POST Login invalid method
    When I send POST HTTP request Login invalid method
    Then I receive response code 405 for Login invalid method


  Scenario: GET - Get user information invalid method
    Given I set GET user information invalid method
    When I send GET HTTP request user information invalid method
    Then I receive response code 405 for Get user information invalid method


  Scenario: POST - Register invalid payload
    Given I set POST Register invalid payload
    When I send POST HTTP request Register invalid payload
    Then I receive response code 400 for Register invalid payload

  Scenario: POST - Login invalid payload
    Given I set POST Login invalid payload
    When I send POST HTTP request Login invalid payload
    Then I receive response code 400 for Login invalid payload


