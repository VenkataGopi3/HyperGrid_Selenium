Feature: Login Into Sauce Demo Application


  1. Verify successful login with valid credentials
  2. Verify successful login with valid credentials and pass values
  3. Verify successful login with valid credentials using examples

  Scenario: Verify successful login with valid credentials
    Given User on Login page
    And User save credentials
    When User enter username and password
    And User click on login button
    Then User verify welcome page
