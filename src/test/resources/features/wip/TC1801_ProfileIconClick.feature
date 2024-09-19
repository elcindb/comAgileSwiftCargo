Feature: US018 Profile Icon Click

  Scenario:TC01 Verify profile icon menu options on the Merchant page

    Given The user is logged in to the Merchant page
    When The user clicks on the profile icon in the top bar
    Then A menu should open with the following options:
      | Profile            |
      | Payment Information|
      | Change password     |
      | Logout              |