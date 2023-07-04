@EditUser
Feature: Edit User Profile

  @WebTest @PositiveCase @EditUser
  Scenario: Update User Profile Nama with valid input
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "testingweb@temanpetani.id" as email and "Testing1234!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu profile
    Then User already on profile page
    When User click ubah on field name
    Then Pop up Edit Nama will show
    And User input "Zuni Antika Testing" as new name
    And User click on simpan name button
    Then User already success edit data

  @WebTest @PositiveCase @EditUser
  Scenario: Update User Profile Email with valid input
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "testingweb@temanpetani.id" as email and "Testing1234!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu profile
    Then User already on profile page
    When User click ubah on field email
    Then Pop up Edit Email will show
    And User input "testingweb@temanpetani.id" as new email
    And User click on simpan email button
    Then User already success edit data

  @WebTest @PositiveCase @EditUser
  Scenario: Update User Profile Phone Number with valid input
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "testingweb@temanpetani.id" as email and "Testing1234!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu profile
    Then User already on profile page
    When User click ubah on field phone
    Then Pop up Edit Phone will show
    And User input phone number as new phone
    And User click on simpan phone button
    Then User already success edit data

  @WebTest @PositiveCase @EditUser
  Scenario: Update User Profile Address with valid input
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "testingweb@temanpetani.id" as email and "Testing1234!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu profile
    Then User already on profile page
    When User click ubah on field address
    Then Pop up Edit Address will show
    And User input "jalan letnan yasin" as new address
    And User click on simpan address button
    Then User already success edit data

  @WebTest @PositiveCase @EditUser
  Scenario: Update User Profile Rekening with valid input
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "testingweb@temanpetani.id" as email and "Testing1234!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu profile
    Then User already on profile page
    When User click ubah on field rekening
    Then Pop up Edit Rekening will show
    And User input rekening as new rekening
    And User click on simpan rekening button
    Then User already success edit data

  @WebTest @PositiveCase @EditUser
  Scenario: Update User Profile Bank with valid input
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "testingweb@temanpetani.id" as email and "Testing1234!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu profile
    Then User already on profile page
    When User click ubah on field bank
    Then Pop up Edit Bank will show
    And User select "BCA" as new bank
    And User click on simpan bank button
    Then User already success edit data

  @WebTest @PositiveCase @EditUser
  Scenario: Update User Profile Picture with valid files
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "testingweb@temanpetani.id" as email and "Testing1234!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu profile
    Then User already on profile page
    When User click icon edit in user picture
    Then Pop up Edit Avatar will show
    And User upload files on field choose file
    And User click on simpan picture button
    Then User already success edit data

  @WebTest @PositiveCase @EditUser
  Scenario Outline: Update User Profile Password with Valid Password Lama, Password Baru, and Konfirmasi Password
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "testingweb@temanpetani.id" as email and "Testing1234!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu profile
    Then User already on profile page
    When User click button ganti password
    Then Pop up Edit Password will show
    And User input "<oldPass>" as password lama
    And User input "<newPass>" as password baru
    And User input "<confirmPass>" as konfirmasi password
    And User click on simpan password button
    Then User already success edit data
    Examples:
      | oldPass      | newPass      | confirmPass  |
      | Testing1234! | Testing1234! | Testing1234! |

  @WebTest @NegativeCase @EditUser
  Scenario Outline: Update User Profile Password with Empty Password Lama
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "testingweb@temanpetani.id" as email and "Testing1234!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu profile
    Then User already on profile page
    When User click button ganti password
    Then Pop up Edit Password will show
    And User input "<oldPass>" as password lama
    And User input "<newPass>" as password baru
    And User input "<confirmPass>" as konfirmasi password
    And User click on simpan password button
    Then should see an error message "Required"
    Examples:
      | oldPass | newPass     | confirmPass |
      |         | Testing123! | Testing123! |

  @WebTest @NegativeCase @EditUser
  Scenario Outline: Update User Profile Password with Empty Password Baru
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "testingweb@temanpetani.id" as email and "Testing1234!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu profile
    Then User already on profile page
    When User click button ganti password
    Then Pop up Edit Password will show
    And User input "<oldPass>" as password lama
    And User input "<newPass>" as password baru
    And User input "<confirmPass>" as konfirmasi password
    And User click on simpan password button
    Then should see an error message "Required"
    Examples:
      | oldPass      | newPass | confirmPass |
      | Testing1234! |         | Testing123! |

  @WebTest @NegativeCase @EditUser
  Scenario Outline: Update User Profile Password with Empty Konfirmasi Password
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "testingweb@temanpetani.id" as email and "Testing1234!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu profile
    Then User already on profile page
    When User click button ganti password
    Then Pop up Edit Password will show
    And User input "<oldPass>" as password lama
    And User input "<newPass>" as password baru
    And User input "<confirmPass>" as konfirmasi password
    And User click on simpan password button
    Then should see an error message "Required"
    Examples:
      | oldPass      | newPass     | confirmPass |
      | Testing1234! | Testing123! |             |

  @WebTest @NegativeCase @EditUser
  Scenario Outline: Update User Profile Password with Wrong Password
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "testingweb@temanpetani.id" as email and "Testing1234!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu profile
    Then User already on profile page
    When User click button ganti password
    Then Pop up Edit Password will show
    And User input "<oldPass>" as password lama
    And User input "<newPass>" as password baru
    And User input "<confirmPass>" as konfirmasi password
    And User click on simpan password button
    Then User "Failed" update password
    Examples:
      | oldPass   | newPass      | confirmPass  |
      | Wrong123! | Testing1234! | Testing1234! |