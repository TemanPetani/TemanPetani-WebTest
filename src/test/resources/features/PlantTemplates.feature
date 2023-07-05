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
    And User click menu Jadwal Tanam
    Then User already on Jadwal Tanam page
    When User click button Tambah Jadwal
    Then Pop up Tambah Jadwal will show
    And User input "Pepaya" in field Nama Tanaman
    And User click on simpan new template button
    Then User success create new template

  @WebTest @NegativeCase @PlantTemplates
  Scenario: Add Jadwal Tanam with empty nama tanaman
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "admin@temanpetani.id" as email and "Admin123!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu Jadwal Tanam
    Then User already on Jadwal Tanam page
    When User click button Tambah Jadwal
    Then Pop up Tambah Jadwal will show
    And User input "" in field Nama Tanaman
    And User click on simpan new template button
    Then should see an error message "Required"

  @WebTest @NegativeCase @PlantTemplates
  Scenario: Add Jadwal Tanam with registered name
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "admin@temanpetani.id" as email and "Admin123!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu Jadwal Tanam
    Then User already on Jadwal Tanam page
    When User click button Tambah Jadwal
    Then Pop up Tambah Jadwal will show
    And User input Registered Name "Lada" in field Nama Tanaman
    And User click on simpan new template button
    Then should see an error create jadwal message "Duplicate entry"

  @WebTest @PositiveCase @PlantTemplates
  Scenario Outline: Verify detail jadwal template
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "admin@temanpetani.id" as email and "Admin123!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu Jadwal Tanam
    Then User already on Jadwal Tanam page
    When User click icon detail jadwal in template "<nameSchedule>"
    Then User already on detail jadwal page "<nameSchedule>"
    Examples:
      | nameSchedule |
      | Lada         |

  @WebTest @PositiveCase @PlantTemplates
  Scenario Outline: Add Jadwal Tanam with valid input
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "admin@temanpetani.id" as email and "Admin123!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu Jadwal Tanam
    Then User already on Jadwal Tanam page
    When User click icon edit jadwal in template "<nameSchedule>"
    Then Pop up Ubah Nama Jadwal will show
    And User edit "<nameSchedule>" in field Nama Tanaman
    And User click on simpan edit template button
    Then User success edit template
    Examples:
      | nameSchedule |
      | Pisang       |

  @WebTest @NegativeCase @PlantTemplates
  Scenario Outline: Edit Jadwal without nama jadwal
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "admin@temanpetani.id" as email and "Admin123!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu Jadwal Tanam
    Then User already on Jadwal Tanam page
    When User click icon edit jadwal in template "<nameSchedule>"
    Then Pop up Ubah Nama Jadwal will show
    And User emptying in field Nama Tanaman "<nameSchedule>"
    And User click on simpan edit template button
    Then should see an error message "Required"
    Examples:
      | nameSchedule |
      | Lada         |

  @WebTest @PositiveCase @PlantTemplates
  Scenario Outline: Add Aktivitas Jadwal with valid input
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "admin@temanpetani.id" as email and "Admin123!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu Jadwal Tanam
    Then User already on Jadwal Tanam page
    When User click icon detail jadwal in template "<nameSchedule>"
    Then User already on detail jadwal page "<nameSchedule>"
    When User click button Tambah Aktivitas
    Then Pop up Tambah Aktivitas will show
    And User input "<nameActivity>" as nama aktivitas
    And User input <day> as Aktivitas pada hari ke
    And User click on simpan aktivitas button
    Then User success create new activity
    Examples:
      | nameSchedule | nameActivity  | day |
      | Pepaya UIdDf | siram tanaman | 5   |


  @WebTest @NegativeCase @PlantTemplates
  Scenario Outline: Add Aktivitas Jadwal without nama aktivitas
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "admin@temanpetani.id" as email and "Admin123!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu Jadwal Tanam
    Then User already on Jadwal Tanam page
    When User click icon detail jadwal in template "<nameSchedule>"
    Then User already on detail jadwal page "<nameSchedule>"
    When User click button Tambah Aktivitas
    Then Pop up Tambah Aktivitas will show
    And User input "<nameActivity>" as nama aktivitas
    And User input <day> as Aktivitas pada hari ke
    And User click on simpan aktivitas button
    Then should see an error message "Required"
    Examples:
      | nameSchedule | nameActivity | day |
      | Pepaya UIdDf |              | 5   |

  @WebTest @NegativeCase @PlantTemplates
  Scenario Outline: Add Aktivitas Jadwal without Aktivitas pada hari ke
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "admin@temanpetani.id" as email and "Admin123!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu Jadwal Tanam
    Then User already on Jadwal Tanam page
    When User click icon detail jadwal in template "<nameSchedule>"
    Then User already on detail jadwal page "<nameSchedule>"
    When User click button Tambah Aktivitas
    Then Pop up Tambah Aktivitas will show
    And User input "<nameActivity>" as nama aktivitas
    And User input <day> as Aktivitas pada hari ke
    And User click on simpan aktivitas button
    Then should see an error message "Required"
    Examples:
      | nameSchedule | nameActivity  | day |
      | Pepaya UIdDf | siram tanaman | 0   |

  @WebTest @PositiveCase @PlantTemplates
  Scenario Outline: Edit Aktivitas Jadwal with valid input
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "admin@temanpetani.id" as email and "Admin123!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu Jadwal Tanam
    Then User already on Jadwal Tanam page
    When User click icon detail jadwal in template "<nameSchedule>"
    Then User already on detail jadwal page "<nameSchedule>"
    When User click icon edit aktivitas in template "<nameActivity>"
    Then Pop up Ubah Aktivitas will show
    And User edit "<nameActivity>" in field Nama Aktivitas
    And User edit <day> as Aktivitas pada hari ke
    And User click on simpan edit aktivitas button
    Then User success edit aktivitas
    Examples:
      | nameSchedule | nameActivity | day |
      | Pepaya UIdDf | siramxx 8    | 3   |

  @WebTest @NegativeCase @PlantTemplates
  Scenario Outline: Edit Aktivitas Jadwal without nama aktivitas
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "admin@temanpetani.id" as email and "Admin123!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu Jadwal Tanam
    Then User already on Jadwal Tanam page
    When User click icon detail jadwal in template "<nameSchedule>"
    Then User already on detail jadwal page "<nameSchedule>"
    When User click icon edit aktivitas in template "<nameActivity>"
    Then Pop up Ubah Aktivitas will show
    And User emptying in field Nama Aktivitas "<nameActivity>"
    And User edit <day> as Aktivitas pada hari ke
    And User click on simpan edit aktivitas button
    Then should see an error message "Required"
    Examples:
      | nameSchedule | nameActivity     | day |
      | Pepaya UIdDf | siraman pertama1 | 10  |

  @WebTest @NegativeCase @PlantTemplates
  Scenario Outline: Edit Aktivitas Jadwal without Aktivitas pada hari ke
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "admin@temanpetani.id" as email and "Admin123!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu Jadwal Tanam
    Then User already on Jadwal Tanam page
    When User click icon detail jadwal in template "<nameSchedule>"
    Then User already on detail jadwal page "<nameSchedule>"
    When User click icon edit aktivitas in template "<nameActivity>"
    Then Pop up Ubah Aktivitas will show
    And User edit "<nameActivity>" in field Nama Aktivitas
    And User emptying in field Aktivitas pada hari ke
    And User click on simpan edit aktivitas button
    Then should see an error message "Required"
    Examples:
      | nameSchedule | nameActivity     |
      | Pepaya UIdDf | siraman pertama1 |

  @WebTest @PositiveCase @PlantTemplates
  Scenario Outline: Hapus Aktivitas Template
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "admin@temanpetani.id" as email and "Admin123!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu Jadwal Tanam
    Then User already on Jadwal Tanam page
    When User click icon detail jadwal in template "<nameSchedule>"
    Then User already on detail jadwal page "<nameSchedule>"
    When User click icon hapus aktivitas
    Then Pop up Konfirmasi Hapus will show
    When User click ok hapus aktivitas
    Then User success delete activity
    Examples:
      | nameSchedule |
      | Pepaya UIdDf |

  @WebTest @PositiveCase @PlantTemplates
  Scenario: Hapus Jadwal Template
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "admin@temanpetani.id" as email and "Admin123!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu Jadwal Tanam
    Then User already on Jadwal Tanam page
    When User click icon hapus jadwal
    Then Pop up Konfirmasi Hapus Template will show
    When User click ok hapus jadwal
    Then User success delete jadwal