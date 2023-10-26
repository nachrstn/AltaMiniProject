Feature: Product
  As an quality engineer
  I want to see list of product
  So that I can create new product

  Scenario: GET - Successful Get all products
    Given I set GET endpoints all products
    When I send GET HTTP request all products
    Then I receive response code 200 for get all products

  Scenario: GET - Get all products invalid endpoint
    Given I set GET all products invalid endpoint
    When I send GET HTTP request all products invalid endpoint
    Then I receive response code 404 for Get all products invalid endpoint

  Scenario: GET - Get all products invalid method
    Given I set GET all products invalid method
    When I send GET HTTP request all products invalid method
    Then I receive response code 405 for Get all products invalid method

  Scenario: GET - Successful Get product By ID
    Given I set GET endpoints product By ID
    When I send GET HTTP request product By ID
    Then I receive response code 200 for get product By ID

  Scenario: GET - Get product By ID invalid endpoint
    Given I set GET product By ID invalid endpoint
    When I send GET HTTP request product By ID invalid endpoint
    Then I receive response code 404 for Get product By ID invalid endpoint

  Scenario: GET - Get product By ID invalid method
    Given I set GET product By ID invalid method
    When I send GET HTTP request product By ID invalid method
    Then I receive response code 405 for Get product By ID invalid method

  Scenario: GET - Successful Get product ratings
    Given I set GET endpoints product ratings
    When I send GET HTTP request product ratings
    Then I receive response code 200 for get product ratings

  Scenario: GET - Get product ratings invalid endpoint
    Given I set GET product ratings invalid endpoint
    When I send GET HTTP request product ratings invalid endpoint
    Then I receive response code 404 for Get product ratings invalid endpoint

  Scenario: GET - Get product ratings invalid method
    Given I set GET product ratings invalid method
    When I send GET HTTP request product ratings invalid method
    Then I receive response code 405 for Get product ratings invalid method

  Scenario: GET - Successful Get product comments
    Given I set GET endpoints product comments
    When I send GET HTTP request product comments
    Then I receive response code 200 for get product comments

  Scenario: GET - Get product comments invalid endpoint
    Given I set GET product comments invalid endpoint
    When I send GET HTTP request product comments invalid endpoint
    Then I receive response code 404 for Get product comments invalid endpoint

  Scenario: GET - Get product comments invalid method
    Given I set GET product comments invalid method
    When I send GET HTTP request product comments invalid method
    Then I receive response code 405 for Get product comments invalid method

  Scenario: POST - Successful Create a new product
    Given I set POST endpoints Create a new product
    When I send POST HTTP request Create a new product
    Then I receive response code 200 Create a new product
    And I receive valid data for Create a new product

  Scenario: POST - Create a new product invalid endpoint
    Given I set POST Create a new product invalid endpoint
    When I send POST HTTP request Create a new product invalid endpoint
    Then I receive response code 404 for Create a new product

  Scenario: POST - Create a new product invalid method
    Given I set POST Create a new product invalid method
    When I send POST HTTP request Create a new product invalid method
    Then I receive response code 405 for Create a new product invalid method

  Scenario: POST - Create a new product invalid payload
    Given I set POST Create a product invalid payload
    When I send POST HTTP request Create a product invalid payload
    Then I receive response code 400 for Create a product invalid payload

  Scenario: POST - Assign a product rating invalid endpoint
    Given I set POST Assign a product rating invalid endpoint
    When I send POST HTTP request Assign a product rating invalid endpoint
    Then I receive response code 404 for Assign a product rating

  Scenario: POST - Assign a product rating invalid method
    Given I set POST Assign a product rating invalid method
    When I send POST HTTP request Assign a product rating invalid method
    Then I receive response code 405 for Assign a product rating invalid method

  Scenario: POST - Successful Create a comment for product
    Given I set POST endpoints Create a comment for product
    When I send POST HTTP request Create a comment for product
    Then I receive response code 200 Create a comment for product
    And I receive valid data for Create a comment for product

  Scenario: POST - Create a comment for product invalid endpoint
    Given I set POST Create a comment for product invalid endpoint
    When I send POST HTTP request Create a comment for product invalid endpoint
    Then I receive response code 404 for Create a comment for product

  Scenario: POST - Create a comment for product invalid method
    Given I set POST Create a comment for product invalid method
    When I send POST HTTP request Create a comment for product invalid method
    Then I receive response code 405 for Create a comment for product invalid method

  Scenario: DELETE - Successful Delete a product
    Given I set DELETE endpoints Delete a product
    When I send DELETE HTTP request Delete a product
    Then I receive response code 200 Delete a product


  Scenario: DELETE - Delete a product invalid endpoint
    Given I set DELETE Delete a product invalid endpoint
    When I send DELETE HTTP request Delete a product invalid endpoint
    Then I receive response code 404 for Delete a product

  Scenario: DELETE - Delete a product invalid method
    Given I set DELETE Delete a product invalid method
    When I send DELETE HTTP request Delete a product invalid method
    Then I receive response code 405 for Delete a product invalid method

