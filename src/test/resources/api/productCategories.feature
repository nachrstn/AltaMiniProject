Feature: Product Categories
  As an quality engineer
  I want to see list of product categories
  So that I can create new product categories

  Scenario: POST - Successful Create a category
    Given I set POST Create a category endpoints
    When I send POST HTTP request Create a category
    Then I receive response code 200 Create a category
    And I receive valid data for Create a category

  Scenario: POST - Create a category invalid endpoint
    Given I set POST Create a category invalid endpoint
    When I send POST HTTP request Create a category invalid endpoint
    Then I receive response code 404 for Create a category invalid endpoint

  Scenario: GET - Successful Get category by ID
    Given I set GET endpoints category by ID
    When I send GET HTTP request category by ID
    Then I receive response code 200 for get category by ID
    And I receive valid data for detail category by ID

  Scenario: GET - Get category by ID invalid endpoint
    Given I set GET category by ID invalid endpoint
    When I send GET HTTP request category by ID invalid endpoint
    Then I receive response code 404 for Get category by ID invalid endpoint

  Scenario: GET - Successful Get all categories
    Given I set GET endpoints all categories
    When I send GET HTTP request all categories
    Then I receive response code 200 for get all categories

  Scenario: GET - Get all categories invalid endpoint
    Given I set GET all categories invalid endpoint
    When I send GET HTTP request all categories invalid endpoint
    Then I receive response code 404 for Get all categories invalid endpoint

  Scenario: DELETE - Successful Delete a category
    Given I set DELETE endpoints Delete a category
    When I send DELETE HTTP request Delete a category
    Then I receive response code 200 Delete a category

  Scenario: DELETE - Delete a category invalid endpoint
    Given I set DELETE Delete a category invalid endpoint
    When I send DELETE HTTP request Delete a category invalid endpoint
    Then I receive response code 404 for Delete a category

  Scenario: POST - Create a category invalid method
    Given I set POST Create a category invalid method
    When I send POST HTTP request Create a category invalid method
    Then I receive response code 405 for Create a category invalid method


  Scenario: GET - Get category by ID invalid method
    Given I set GET category by ID invalid method
    When I send GET HTTP request category by ID invalid method
    Then I receive response code 405 for Get category by ID invalid method

  Scenario: GET - Get all categories invalid method
    Given I set GET all categories invalid method
    When I send GET HTTP request all categories invalid method
    Then I receive response code 405 for Get all categories invalid method

  Scenario: DELETE - Delete a category invalid method
    Given I set DELETE Delete a category invalid method
    When I send DELETE HTTP request Delete a category invalid method
    Then I receive response code 405 for Delete a category invalid method

  Scenario: POST - Create a category invalid payload
    Given I set POST Create a category invalid payload
    When I send POST HTTP request Create a category invalid payload
    Then I receive response code 400 for Create a category invalid payload
