Feature: Product
  As an quality engineer
  I want to see list of product
  So that I can create new product

  Scenario: POST - Successful Create a new order
    Given I set POST endpoints Create a new order
    When I send POST HTTP request Create a new order
    Then I receive response code 200 Create a new order
    And I receive valid data for Create a new order

  Scenario: POST - Create a new order invalid endpoint
    Given I set POST Create a new order invalid endpoint
    When I send POST HTTP request Create a new order invalid endpoint
    Then I receive response code 404 for Create a new order

  Scenario: GET - Successful Get all orders
    Given I set GET endpoints all orders
    When I send GET HTTP request all orders
    Then I receive response code 200 for get all orders

  Scenario: GET - Get all orders invalid endpoint
    Given I set GET all orders invalid endpoint
    When I send GET HTTP request all orders invalid endpoint
    Then I receive response code 404 for Get all orders invalid endpoint

  Scenario: GET - Successful Get order by ID
    Given I set GET endpoints order by ID
    When I send GET HTTP request order by ID
    Then I receive response code 200 for get order by ID
    And I receive valid data for detail order by ID

  Scenario: GET - Get order by ID invalid endpoint
    Given I set GET order by ID invalid endpoint
    When I send GET HTTP request order by ID invalid endpoint
    Then I receive response code 404 for Get order by ID invalid endpoint

  Scenario: POST - Create a new order invalid method
    Given I set POST Create a new order invalid method
    When I send POST HTTP request Create a new order invalid method
    Then I receive response code 405 for Create a new order invalid method


  Scenario: GET - Get all orders invalid method
    Given I set GET all orders invalid method
    When I send GET HTTP request all orders invalid method
    Then I receive response code 405 for Get all orders invalid method

  Scenario: GET - Get order by ID invalid method
    Given I set GET order by ID invalid method
    When I send GET HTTP request order by ID invalid method
    Then I receive response code 405 for Get order by ID invalid method


  Scenario: POST - Create a new order invalid payload
    Given I set POST Create a new order invalid payload
    When I send POST HTTP request Create a new order invalid payload
    Then I receive response code 400 for Create a new order invalid payload

