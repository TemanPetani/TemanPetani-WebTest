@MyPlant
Feature: My Plant Feature for Role Users

  @WebTest @PositiveCase @MyPlant
  Scenario Outline: Add Jadwal Tanam with valid input
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "testingplant1@temanpetani.id" as email and "Satu1995!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu Tanam Sekarang
    Then User already on Create Plant page
    And Start Plant form will show
    When User input new "<namaPlant>" in field Nama Tanaman
    And User select "<jenisPlant>" as Jenis Tanaman
    And User select today's date as Tanggal Mulai
    And User click on button simpan start plant
    Then User success create new plant
    When User click on ok in pop up success create new plant
    Then User already on my plant page
    Examples:
      | namaPlant         | jenisPlant    |
      | Stoberi Juli Week | Stroberi Pink |

  @WebTest @NegativeCase @MyPlant
  Scenario Outline: Add Plant without Nama Tanaman
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "testingplant1@temanpetani.id" as email and "Satu1995!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu Tanam Sekarang
    Then User already on Create Plant page
    And Start Plant form will show
    When User input new "<namaPlant>" in field Nama Tanaman
    And User select "<jenisPlant>" as Jenis Tanaman
    And User select today's date as Tanggal Mulai
    And User click on button simpan start plant
    Then should see an error message "Required"
    Examples:
      | namaPlant | jenisPlant    |
      |           | Stroberi Pink |

  @WebTest @NegativeCase @MyPlant
  Scenario Outline: Add Plant without select Jenis Tanaman
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "testingplant1@temanpetani.id" as email and "Satu1995!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu Tanam Sekarang
    Then User already on Create Plant page
    And Start Plant form will show
    When User input new "<namaPlant>" in field Nama Tanaman
    And User select today's date as Tanggal Mulai
    And User click on button simpan start plant
    Then should see an error message "Required"
    Examples:
      | namaPlant    |
      | Stoberi Pink |

  @WebTest @NegativeCase @MyPlant
  Scenario Outline: Add Plant without select Start Date
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "testingplant1@temanpetani.id" as email and "Satu1995!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu Tanam Sekarang
    Then User already on Create Plant page
    And Start Plant form will show
    When User input new "<namaPlant>" in field Nama Tanaman
    And User select "<jenisPlant>" as Jenis Tanaman
    And User click on button simpan start plant
    Then should see an error message "Start date is required"
    Examples:
      | namaPlant | jenisPlant    |
      | Stoberi   | Stroberi Pink |

  @WebTest @PositiveCase @MyPlant
  Scenario: Verify my plant page
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "testingplant1@temanpetani.id" as email and "Satu1995!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    When User click icon profile
    And User click menu Tanaman Saya
    Then User already on my plant page

  @WebTest @PositiveCase @MyPlant
  Scenario Outline: Show details Tanamanku
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "testingplant1@temanpetani.id" as email and "Satu1995!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu Tanaman Saya
    Then User already on my plant page
    When User click on detail in plant "<namaMyPlant>"
    Then User already on my plant detail "<namaMyPlant>"
    And Detail activity my plant "<namaMyPlant>" will show
    Examples:
      | namaMyPlant           |
      | Stoberi April 2023    |

  @WebTest @PositiveCase @MyPlant
  Scenario Outline: Finished Activity in My Plant
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "testingplant1@temanpetani.id" as email and "Satu1995!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu Tanaman Saya
    Then User already on my plant page
    When User click on detail in plant "<namaMyPlant>"
    Then User already on my plant detail "<namaMyPlant>"
    And Detail activity my plant "<namaMyPlant>" will show
    When User click on selesai in not finished activity
    Then Konfirmasi Selesai pop up will show
    When User click on ok to finish activity
    Then User success finishing the activity
    Examples:
      | namaMyPlant    |
      | Lada Juni 2023 |

  @WebTest @PositiveCase @MyPlant
  Scenario: Delete Tanamanku
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "testingplant1@temanpetani.id" as email and "Satu1995!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu Tanaman Saya
    Then User already on my plant page
    When User click delete in plant
    Then Konfirmasi Hapus pop up will show
    When User click on ok to delete plant
    Then User success delete the plant

  @WebTest @PositiveCase @MyPlant
  Scenario: Notification Plant Activities
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "testingplant1@temanpetani.id" as email and "Satu1995!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    And Noticification Plant Activity will show if there is activity to do
    When User click button go in notification bar plant activity
    Then User already on my plant page