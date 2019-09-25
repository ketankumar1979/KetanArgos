Feature: Login
  Scenario: Login
    Given user is on home page
    When user search for the product "<string>"
    Then user should see respected products
   // And user can see