@Register
  Feature: Register
    User Want to Create/Register New Account

  @WebTest @PositiveCase @Register
  Scenario Outline: Register with valid input
    Given User already on website TemanPetani
    When User click on register menu
    Then User already on register page
    When User input unregistered email and phone
    And User input "<fullName>" as fullName, "<password>" as password, and "<address>" as address
    And User click on sign up button
    Then User "Success" create new user
    Examples:
      | fullName | password    | address |
      | Ghalda   | Satudua345! | address |

    @WebTest @NegativeCase @Register
    Scenario Outline: Register with registered email
      Given User already on website TemanPetani
      When User click on register menu
      Then User already on register page
      When User input "<fullName>" as fullName, "<email>" as email, "<password>" as password,"<phone>" as phone, and "<address>" as address
      And User click on sign up button
      Then User "Failed" create new user
      Examples:
        | fullName | email              | password  | phone       | address |
        | Ghalda   | Ghalda77@gmail.com | Satudua3! | 08135388651 | address |

    @WebTest @NegativeCase @Register
    Scenario Outline: Register with registered phone
      Given User already on website TemanPetani
      When User click on register menu
      Then User already on register page
      When User input "<fullName>" as fullName, "<email>" as email, "<password>" as password,"<phone>" as phone, and "<address>" as address
      And User click on sign up button
      Then User "Failed" create new user
      Examples:
        | fullName | email                  | password  | phone       | address |
        | Ghalda   | admin12@temanpetani.id | Satudua3! | 081213141516 | address |

    @WebTest @NegativeCase @Register
    Scenario Outline: Register with invalid email format
      Given User already on website TemanPetani
      When User click on register menu
      Then User already on register page
      When User input "<fullName>" as fullName, "<email>" as email, "<password>" as password,"<phone>" as phone, and "<address>" as address
      And User click on sign up button
      Then should see an error message "please enter a valid email"
      Examples:
        | fullName | email | password  | phone        | address |
        | Ghalda   | admin | Satudua3! | 081213141516 | address |

    @WebTest @NegativeCase @Register
    Scenario Outline: Register with password less than 8
      Given User already on website TemanPetani
      When User click on register menu
      Then User already on register page
      When User input "<fullName>" as fullName, "<email>" as email, "<password>" as password,"<phone>" as phone, and "<address>" as address
      And User click on sign up button
      Then should see an error message "Must be at least 8 characters long"
      Examples:
        | fullName | email                      | password | phone        | address |
        | Ghalda   | ghaldaadmin@temanpetani.id | S3!      | 081213141516 | address |

      @WebTest @PositiveCase @Register
    Scenario Outline: Register with the length password equal to 8
      Given User already on website TemanPetani
      When User click on register menu
      Then User already on register page
      When User input unregistered email and phone
      And User input "<fullName>" as fullName, "<password>" as password, and "<address>" as address
      And User click on sign up button
      Then User "Success" create new user
      Examples:
          | fullName | password    | address |
          | Ghalda   | Satudu3! | address |

    @WebTest @PositiveCase @Register
    Scenario Outline: Register with password more than
      Given User already on website TemanPetani
      When User click on register menu
      Then User already on register page
      When User input unregistered email and phone
      And User input "<fullName>" as fullName, "<password>" as password, and "<address>" as address
      And User click on sign up button
      Then User "Success" create new user
      Examples:
        | fullName | password    | address |
        | Ghalda   | Satudua345! | address |


    @WebTest @NegativeCase @Register
    Scenario Outline: Register with password without uppercase
      Given User already on website TemanPetani
      When User click on register menu
      Then User already on register page
      When User input "<fullName>" as fullName, "<email>" as email, "<password>" as password,"<phone>" as phone, and "<address>" as address
      And User click on sign up button
      Then should see an error message "Must contain at least one uppercase letter"
      Examples:
        | fullName | email                      | password  | phone        | address |
        | Ghalda   | ghaldaadmin@temanpetani.id | ghaldaa1! | 081213141516 | address |

    @WebTest @NegativeCase @Register
    Scenario Outline: Register with password without special character
      Given User already on website TemanPetani
      When User click on register menu
      Then User already on register page
      When User input "<fullName>" as fullName, "<email>" as email, "<password>" as password,"<phone>" as phone, and "<address>" as address
      And User click on sign up button
      Then should see an error message "Must contain at least one symbol"
      Examples:
        | fullName | email                      | password | phone        | address |
        | Ghalda   | ghaldaadmin@temanpetani.id | Ghaldaa1 | 081213141516 | address |

    @WebTest @NegativeCase @Register
    Scenario Outline: Register with password without number
      Given User already on website TemanPetani
      When User click on register menu
      Then User already on register page
      When User input "<fullName>" as fullName, "<email>" as email, "<password>" as password,"<phone>" as phone, and "<address>" as address
      And User click on sign up button
      Then should see an error message "Must contain at least one number"
      Examples:
        | fullName | email                      | password | phone        | address |
        | Ghalda   | ghaldaadmin@temanpetani.id | Ghaldaa! | 081213141516 | address |

    @WebTest @NegativeCase @Register
    Scenario Outline: Register with empty field
      Given User already on website TemanPetani
      When User click on register menu
      Then User already on register page
      When User input "<fullName>" as fullName, "<email>" as email, "<password>" as password,"<phone>" as phone, and "<address>" as address
      And User click on sign up button
      Then should see an error message "Required"
      Examples:
        | fullName | email                      | password    | phone        | address |
        |          | ghaldaadmin@temanpetani.id | Ghaldaa123! | 081213141516 | address |
        | Ghalda   |                            | Ghaldaa123! | 081213141516 | address |
        | Ghalda   | ghaldaadmin@temanpetani.id |             | 081213141516 | address |
        | Ghalda   | ghaldaadmin@temanpetani.id | Ghaldaa123! |              | address |
        | Ghalda   | ghaldaadmin@temanpetani.id | Ghaldaa123! | 081213141516 |         |
        |          |                            |             |              |         |

    @WebTest @NegativeCase @Register
    Scenario Outline: Register with phone not number type
      Given User already on website TemanPetani
      When User click on register menu
      Then User already on register page
      When User input "<fullName>" as fullName, "<email>" as email, "<password>" as password,"<phone>" as phone, and "<address>" as address
      And User click on sign up button
      Then should see an error message "phone must be a `number` type, but the"
      Examples:
        | fullName | email                      | password     | phone | address |
        | Ghalda   | ghaldaadmin@temanpetani.id | Ghaldaa123!! | a!    | address |