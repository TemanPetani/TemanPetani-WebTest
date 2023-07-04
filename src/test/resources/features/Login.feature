Feature: Login

  @Login
  Scenario: Login with valid email and password
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "usersghalda@temanpetani.id" as email and "Users123!" as password
    And User click login button
    Then User already on Home Page

  Scenario: Login with invalid email and password
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "blabla@blabla" as email and "abcd" as password
    And User click login button

  Scenario: Login with empty email and valid password
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "" as email and "Users123!" as password
    And User click login button

  Scenario: Login with valid email and empty password
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "usersghalda@temanpetani.id" as email and "" as password
    And User click login button


