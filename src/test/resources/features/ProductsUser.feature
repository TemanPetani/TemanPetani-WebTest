@ProductsUser
Feature: Product feature for User Role
  @WebTest @PositiveCase @ProductsUser
  Scenario: Verify List Product in Homepage
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "testingplant1@temanpetani.id" as email and "Satu1995!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    And List Product Homepage will show

  @WebTest @PositiveCase @ProductsUser
  Scenario: Show Detail Product
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "testingplant1@temanpetani.id" as email and "Satu1995!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    And List Product Homepage will show
    When User click on detail product user button
    Then User already on detail product user

  @WebTest @PositiveCase @ProductsUser
  Scenario Outline: Buy Product with valid input
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "testingplant1@temanpetani.id" as email and "Satu1995!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    And List Product Homepage will show
    When User click on detail product user button
    Then User already on detail product user
    When User click on beli sekarang
    Then Pop detail pembelian will show
    When User select bank "<bank>" in field pilih bank product pembelian
    And User input product pembelian <jumlah> in field jumlah
    And User input catatan product "<catatan>" in field catatan
    And User click on konfirmasi pembelian
    Then User already on pembayaran page
    Examples:
      | bank | jumlah | catatan               |
      | BCA  | 100    | dikirim secepatnya ya |

  @WebTest @NegativeCase @ProductsUser
  Scenario Outline: Buy Product without select bank
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "testingplant1@temanpetani.id" as email and "Satu1995!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    And List Product Homepage will show
    When User click on detail product user button
    Then User already on detail product user
    When User click on beli sekarang
    Then Pop detail pembelian will show
    When User input product pembelian <jumlah> in field jumlah
    And User input catatan product "<catatan>" in field catatan
    And User click on konfirmasi pembelian
    Then should see an error message "Required"
    Examples:
      | jumlah | catatan               |
      | 100    | dikirim secepatnya ya |

  @WebTest @NegativeCase @ProductsUser
  Scenario Outline: Buy Product with empty jumlah
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "testingplant1@temanpetani.id" as email and "Satu1995!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    And List Product Homepage will show
    When User click on detail product user button
    Then User already on detail product user
    When User click on beli sekarang
    Then Pop detail pembelian will show
    When User select bank "<bank>" in field pilih bank product pembelian
    And User input catatan product "<catatan>" in field catatan
    And User click on konfirmasi pembelian
    Then should see an error message "Required"
    Examples:
      | bank | catatan               |
      | BCA  | dikirim secepatnya ya |

  @WebTest @NegativeCase @ProductsUser
  Scenario Outline: Buy Product with empty catatan
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "testingplant1@temanpetani.id" as email and "Satu1995!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    And List Product Homepage will show
    When User click on detail product user button
    Then User already on detail product user
    When User click on beli sekarang
    Then Pop detail pembelian will show
    When User select bank "<bank>" in field pilih bank product pembelian
    And User input product pembelian <jumlah> in field jumlah
    And User click on konfirmasi pembelian
    Then should see an error message "Required"
    Examples:
      | bank | jumlah |
      | BCA  | 100    |