@MyProducts
Feature: My Product

  @WebTest @PositiveCase @MyProducts
  Scenario Outline: Add Product with valid input
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "testingplant1@temanpetani.id" as email and "Satu1995!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu Produk Saya
    Then User already on My Product page
    And List My Product will show
    When User click on button tambah produk
    Then Pop Up Form Tambah Produk will show
    When User input new "<namaProduk>" in field Nama Produk Saya
    And User input new <hargaProduk> in field Harga Produk Saya
    And User input new <stokProduk> in field Stok Produk Saya
    And User input new "<descProduk>" in field Deskripsi Produk Saya
    And User upload product files "<filesProduct>" on field choose file
    And User click on simpan tambah produk button
    Then User already success add new product
    Examples:
      | namaProduk | hargaProduk | stokProduk | descProduk    | filesProduct |
      | Mangga     | 5000        | 1000       | ini deskripsi | mangga.png   |

  @WebTest @NegativeCase @MyProducts
  Scenario Outline:Add Product without Nama Produk
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "testingplant1@temanpetani.id" as email and "Satu1995!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu Produk Saya
    Then User already on My Product page
    And List My Product will show
    When User click on button tambah produk
    Then Pop Up Form Tambah Produk will show
    When User input new <hargaProduk> in field Harga Produk Saya
    And User input new <stokProduk> in field Stok Produk Saya
    And User input new "<descProduk>" in field Deskripsi Produk Saya
    And User upload product files "<filesProduct>" on field choose file
    And User click on simpan tambah produk button
    Then should see an error message "Required"
    Examples:
      | hargaProduk | stokProduk | descProduk    | filesProduct |
      | 5000        | 1000       | ini deskripsi | mangga.png   |

  @WebTest @NegativeCase @MyProducts
  Scenario Outline:Add Product without harga produk
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "testingplant1@temanpetani.id" as email and "Satu1995!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu Produk Saya
    Then User already on My Product page
    And List My Product will show
    When User click on button tambah produk
    Then Pop Up Form Tambah Produk will show
    When User input new "<namaProduk>" in field Nama Produk Saya
    And User input new <stokProduk> in field Stok Produk Saya
    And User input new "<descProduk>" in field Deskripsi Produk Saya
    And User upload product files "<filesProduct>" on field choose file
    And User click on simpan tambah produk button
    Then should see an error message "Required"
    Examples:
      | namaProduk | stokProduk | descProduk    | filesProduct |
      | Mangga     | 1000       | ini deskripsi | mangga.png   |

  @WebTest @NegativeCase @MyProducts
  Scenario Outline:Add Product without stok produk
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "testingplant1@temanpetani.id" as email and "Satu1995!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu Produk Saya
    Then User already on My Product page
    And List My Product will show
    When User click on button tambah produk
    Then Pop Up Form Tambah Produk will show
    When User input new "<namaProduk>" in field Nama Produk Saya
    And User input new <hargaProduk> in field Harga Produk Saya
    And User input new "<descProduk>" in field Deskripsi Produk Saya
    And User upload product files "<filesProduct>" on field choose file
    And User click on simpan tambah produk button
    Then should see an error message "Required"
    Examples:
      | namaProduk | hargaProduk | descProduk    | filesProduct |
      | Mangga     | 5000        | ini deskripsi | mangga.png   |

  @WebTest @NegativeCase @MyProducts
  Scenario Outline:Add Product without desc produk
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "testingplant1@temanpetani.id" as email and "Satu1995!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu Produk Saya
    Then User already on My Product page
    And List My Product will show
    When User click on button tambah produk
    Then Pop Up Form Tambah Produk will show
    When User input new "<namaProduk>" in field Nama Produk Saya
    And User input new <hargaProduk> in field Harga Produk Saya
    And User input new <stokProduk> in field Stok Produk Saya
    And User upload product files "<filesProduct>" on field choose file
    And User click on simpan tambah produk button
    Then should see an error message "Required"
    Examples:
      | namaProduk | hargaProduk | stokProduk | filesProduct |
      | Mangga     | 5000        | 1000       | mangga.png   |

  @WebTest @NegativeCase @MyProducts
  Scenario Outline:Add Product without image produk
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "testingplant1@temanpetani.id" as email and "Satu1995!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu Produk Saya
    Then User already on My Product page
    And List My Product will show
    When User click on button tambah produk
    Then Pop Up Form Tambah Produk will show
    When User input new "<namaProduk>" in field Nama Produk Saya
    And User input new <hargaProduk> in field Harga Produk Saya
    And User input new <stokProduk> in field Stok Produk Saya
    And User input new "<descProduk>" in field Deskripsi Produk Saya
    And User click on simpan tambah produk button
    Then should see an error message "Required"
    Examples:
      | namaProduk | hargaProduk | stokProduk | descProduk    |
      | Mangga     | 5000        | 1000       | ini deskripsi |


  @WebTest @NegativeCase @MyProducts
  Scenario Outline:Add Product with invalid image format
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "testingplant1@temanpetani.id" as email and "Satu1995!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu Produk Saya
    Then User already on My Product page
    And List My Product will show
    When User click on button tambah produk
    Then Pop Up Form Tambah Produk will show
    When User input new "<namaProduk>" in field Nama Produk Saya
    And User input new <hargaProduk> in field Harga Produk Saya
    And User input new <stokProduk> in field Stok Produk Saya
    And User input new "<descProduk>" in field Deskripsi Produk Saya
    And User upload product files "<filesProduct>" on field choose file
    And User click on simpan tambah produk button
    Then should see an error message "the file format is invalid"
    Examples:
      | namaProduk | hargaProduk | stokProduk | descProduk    | filesProduct   |
      | Mangga     | 5000        | 1000       | ini deskripsi | data-ujian.txt |

  @WebTest @PositiveCase @MyProducts
  Scenario Outline: Edit Product Saya with valid input
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "testingplant1@temanpetani.id" as email and "Satu1995!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu Produk Saya
    Then User already on My Product page
    And List My Product will show
    When User click on edit in product "<namaProduk>"
    Then User already in Edit Product page
    When User click on button edit produk
    Then Pop Up edit product will show
    When User edit nama produk in field Nama Produk Saya
    And User edit <hargaProduk> in field Harga Produk Saya
    And User edit <stokProduk> in field Stok Produk Saya
    And User edit "<descProduk>" in field Deskripsi Produk Saya
    And User click on simpan edit produk button
    Then User already success edit product
    Examples:
      | namaProduk         | hargaProduk | stokProduk | descProduk         |
      | Khusus Edit Produk | 7000        | 700        | ini edit deskripsi |

  @WebTest @NegativeCase @MyProducts
  Scenario Outline: Edit Product Saya without nama produk
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "testingplant1@temanpetani.id" as email and "Satu1995!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu Produk Saya
    Then User already on My Product page
    And List My Product will show
    When User click on edit in product "<namaProduk>"
    Then User already in Edit Product page
    When User click on button edit produk
    Then Pop Up edit product will show
    When User emptying in field Nama Produk
    And User edit <hargaProduk> in field Harga Produk Saya
    And User edit <stokProduk> in field Stok Produk Saya
    And User edit "<descProduk>" in field Deskripsi Produk Saya
    And User click on simpan edit produk button
    Then should see an error message "Required"
    Examples:
      | namaProduk         | hargaProduk | stokProduk | descProduk         |
      | Khusus Edit Produk | 7000        | 700        | ini edit deskripsi |

  @WebTest @NegativeCase @MyProducts
  Scenario Outline: Edit Product Saya without harga
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "testingplant1@temanpetani.id" as email and "Satu1995!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu Produk Saya
    Then User already on My Product page
    And List My Product will show
    When User click on edit in product "<namaProduk>"
    Then User already in Edit Product page
    When User click on button edit produk
    Then Pop Up edit product will show
    When User edit nama produk in field Nama Produk Saya
    And User emptying in field Harga Produk Saya
    And User edit <stokProduk> in field Stok Produk Saya
    And User edit "<descProduk>" in field Deskripsi Produk Saya
    And User click on simpan edit produk button
    Then should see an error message "Required"
    Examples:
      | namaProduk         | stokProduk | descProduk         |
      | Khusus Edit Produk | 700        | ini edit deskripsi |

  @WebTest @NegativeCase @MyProducts
  Scenario Outline: Edit Product Saya without stok produk
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "testingplant1@temanpetani.id" as email and "Satu1995!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu Produk Saya
    Then User already on My Product page
    And List My Product will show
    When User click on edit in product "<namaProduk>"
    Then User already in Edit Product page
    When User click on button edit produk
    Then Pop Up edit product will show
    When User edit nama produk in field Nama Produk Saya
    And User edit <hargaProduk> in field Harga Produk Saya
    And User emptying in field Stok Produk
    And User edit "<descProduk>" in field Deskripsi Produk Saya
    And User click on simpan edit produk button
    Then should see an error message "Required"
    Examples:
      | namaProduk         | hargaProduk | descProduk         |
      | Khusus Edit Produk | 7000        | ini edit deskripsi |

  @WebTest @NegativeCase @MyProducts
  Scenario Outline: Edit Product Saya without deskripsi produk
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "testingplant1@temanpetani.id" as email and "Satu1995!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu Produk Saya
    Then User already on My Product page
    And List My Product will show
    When User click on edit in product "<namaProduk>"
    Then User already in Edit Product page
    When User click on button edit produk
    Then Pop Up edit product will show
    When User edit nama produk in field Nama Produk Saya
    And User edit <hargaProduk> in field Harga Produk Saya
    And User edit <stokProduk> in field Stok Produk Saya
    And User emptying in field Deskripsi Produk
    And User click on simpan edit produk button
    Then should see an error message "Required"
    Examples:
      | namaProduk         | hargaProduk | stokProduk |
      | Khusus Edit Produk | 7000        | 700        |

  @WebTest @PositiveCase @MyProducts
  Scenario Outline: Edit Product Image with valid file
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "testingplant1@temanpetani.id" as email and "Satu1995!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu Produk Saya
    Then User already on My Product page
    And List My Product will show
    When User click on edit in product "<namaProduk>"
    Then User already in Edit Product page
    When User click on Ganti Gambar button
    Then Pop Up Ganti Gambar will show
    When User upload product files "<filesProduct>" on field choose file
    And User click on simpan edit gambar produk button
    Then User already success edit image product
    Examples:
      | namaProduk | filesProduct |
      | Mangga     | mangga.png   |

  @WebTest @NegativeCase @MyProducts
  Scenario Outline: Edit Product Image with invalid file format
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "testingplant1@temanpetani.id" as email and "Satu1995!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu Produk Saya
    Then User already on My Product page
    And List My Product will show
    When User click on edit in product "<namaProduk>"
    Then User already in Edit Product page
    When User click on Ganti Gambar button
    Then Pop Up Ganti Gambar will show
    When User upload product files "<filesProduct>" on field choose file
    And User click on simpan edit gambar produk button
    Then should see an error message "the file format is invalid"
    Examples:
      | namaProduk | filesProduct   |
      | Mangga     | data-ujian.txt |

  @WebTest @PositiveCase @MyProducts
  Scenario Outline: Delete Product Saya
    Given User already on Teman Petani landing page
    When User click on Sign In button
    Then User already on login page
    When User input "testingplant1@temanpetani.id" as email and "Satu1995!" as password
    And User click login button
    Then Success notification "Berhasil Login" will appear
    And User click ok button
    Then User already on Home Page
    When User click icon profile
    And User click menu Produk Saya
    Then User already on My Product page
    And List My Product will show
    When User click on edit in product will delete "<namaProduk>"
    Then User already in Edit Product page
    When User click on delete produk button
    Then Pop Up Konfirmasi delete produk will show
    When User click on ok delete product
    Then User success delete product
  Examples:
      | namaProduk |
      | Mangga     |