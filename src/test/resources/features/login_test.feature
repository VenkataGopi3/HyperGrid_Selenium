Feature: Login

  1.Verify login with valid credentials and verify number of products and heading
  2.Verify login with valid credentials - parameters and verify number of products and heading

  @LT1 @Smoke
  Scenario: Verify login with valid credentials and verify number of products and heading
    Given user is on login page
    When user enter valid credentials data
    And user click on login
    Then user verify number of products on the products page
    Then user verify heading of the page

    @LT2 @Smoke @Regression
  Scenario: Verify login with valid credentials - parameters and verify number of products and heading
    Given user is on login page
    When user enter valid credentials data "standard_user" and "secret_sauce"
    And user click on login
    Then user verify number of products on the products page
    Then user verify heading of the page


    @LT3 @Smoke @Regression
  Scenario Outline: Verify login with valid credentials - with examples and verify number of products and heading
    Given user is on login page
    When user enter valid credentials data "<username>" and "<password>"
    And user click on login
    Then user verify number of products on the products page
    Then user verify heading of the page
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |
      | visual_user   | secret_sauce |
      | error_user    | secret_sauce |






