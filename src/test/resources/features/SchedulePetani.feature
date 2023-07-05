@SchedulePetani
Feature: Edit User Profile

  @WebTest @PositiveCase @SchedulePetani
  Scenario: Verify List Jadwal Petani
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "admin@temanpetani.id" as email and "Admin123!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu Jadwal Petani
    Then User already on Jadwal Petani page
    And List Jadwal Petani will show

  @WebTest @PositiveCase @SchedulePetani
  Scenario: Show Pop Up Detail Jadwal Petani
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "admin@temanpetani.id" as email and "Admin123!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu Jadwal Petani
    Then User already on Jadwal Petani page
    And List Jadwal Petani will show
    When User click on icon detail jadwal petani
    Then Pop Up detail Jadwal Petani will show

  @WebTest @PositiveCase @SchedulePetani
  Scenario: Show List Detail Jadwal Petani
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "admin@temanpetani.id" as email and "Admin123!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu Jadwal Petani
    Then User already on Jadwal Petani page
    And List Jadwal Petani will show
    When User click on icon detail jadwal petani
    Then Pop Up detail Jadwal Petani will show
    And List Detail Jadwal Petani will show

  @WebTest @PositiveCase @SchedulePetani
  Scenario:
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "admin@temanpetani.id" as email and "Admin123!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu Jadwal Petani
    Then User already on Jadwal Petani page
    And List Jadwal Petani will show
    When User click on icon detail jadwal petani
    Then Pop Up detail Jadwal Petani will show
    And List Detail Jadwal Petani will show
    When User click on kembali button
    Then Pop Up Detail will disappear
    And List Jadwal Petani will show