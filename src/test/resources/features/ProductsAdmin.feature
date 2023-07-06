@ProductsAdmin
Feature: Product feature for Admin Role
  @WebTest @PositiveCase @ProductsAdmin
  Scenario: Verify List Product in Homepage
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "admin@temanpetani.id" as email and "Admin123!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    And List Product Homepage will show

  @WebTest @PositiveCase @ProductsAdmin
  Scenario: Show Detail Product
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "admin@temanpetani.id" as email and "Admin123!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    And List Product Homepage will show
    When User click on button detail product admin
    Then Detail Product Admin will show

  @WebTest @PositiveCase @ProductsAdmin
  Scenario Outline: Tawar Product with valid input
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "admin@temanpetani.id" as email and "Admin123!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    And List Product Homepage will show
    When User click on button detail product admin
    Then Detail Product Admin will show
    When User input <negoHarga> in field nego harga
    And User input <quantity> in field jumlah
    And User click button tawar produk
    Then User success tawar harga product
    Examples:
      | negoHarga | quantity |
      | 5000      | 100      |

  @WebTest @NegativeCase @ProductsAdmin
  Scenario Outline: Tawar Product without nego Harga
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "admin@temanpetani.id" as email and "Admin123!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    And List Product Homepage will show
    When User click on button detail product admin
    Then Detail Product Admin will show
    When User emptying in field nego harga
    And User input <quantity> in field jumlah
    And User click button tawar produk
    Then should see an error message "Required"
    Examples:
      | quantity |
      | 100      |

  @WebTest @NegativeCase @ProductsAdmin
  Scenario Outline: Tawar Product without quantity
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "admin@temanpetani.id" as email and "Admin123!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    And List Product Homepage will show
    When User click on button detail product admin
    Then Detail Product Admin will show
    When User input <negoHarga> in field nego harga
    And User click button tawar produk
    Then should see an error message "Required"
    Examples:
      | negoHarga |
      | 2000      |