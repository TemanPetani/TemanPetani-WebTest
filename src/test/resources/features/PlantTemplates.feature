@PlantTemplates
Feature: Jadwal Tanam (Admin)
  User Role Admin Create, Read, Update, Delete Jadwal Tanam

  @WebTest @PositiveCase @PlantTemplates
  Scenario: Add Jadwal Tanam with valid input
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "admin@temanpetani.id" as email and "Admin123!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
#    And User click menu jadwal tanam
#    Then User already on jadwal tanam
#    When User click button tambah jadwal
#    Then Pop up Tambah Jadwal will show
#    And User input "Pepaya" in field Tambah Jadwal
#    And User click on simpan name button
#    Then User success create new template