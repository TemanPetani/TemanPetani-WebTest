@Login
Feature: Login

  @WebTest @PositiveCase @Login
  Scenario: Login with valid email and password
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "usersghalda@temanpetani.id" as email and "Users123!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page

  @WebTest @NegativeCase @Login
  Scenario: Login with invalid email and password
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "blabla@blabla" as email and "abcd" as password
    And User click login button
    Then Error message "Email dan Password Salah" will appear

  @WebTest @NegativeCase @Login
  Scenario: Login with empty email and valid password
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "" as email and "Users123!" as password
    And User click login button
    Then should see an error message "Required"

  @WebTest @NegativeCase @Login
  Scenario: Login with valid email and empty password
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "usersghalda@temanpetani.id" as email and "" as password
    And User click login button
    Then should see an error message "Required"