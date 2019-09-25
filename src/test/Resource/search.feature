Feature: Search
  As a user
  I want to search the product
  So Then I can see respective products
  @smoke
  Scenario: Search the product

    Given user is on home page
    When user search for the product "nike"
    Then user should see respected products