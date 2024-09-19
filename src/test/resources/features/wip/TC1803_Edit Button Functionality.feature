Feature: US018 Edit Button Functionality

  Scenario:TC1803 Verify that clicking the 'Edit' button makes profile information editable.

    Given The user is logged in to the Merchant page
    When The user clicks on the profile icon in the top bar
    And the user clicks on the "Profile" link in the menu then new page should open
    When the user clicks on the "Edit"
    Then the following fields should become visible:
      | Name          |
      | Email      |
      | Mobile      |
      | Business Name       |
      | Address |
      | Image          |
      | NID           |
      | Trade License |