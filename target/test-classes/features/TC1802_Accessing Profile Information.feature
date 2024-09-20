Feature: US018 Accessing Profile Information

  Scenario:TC1802 Verify that clicking the 'Profile' button displays general information.

    Given The user is logged in to the Merchant page
    When The user clicks on the profile icon in the top bar
    And the user clicks on the "Profile" link in the menu then new page should open
    And the page should display the following general profile information:
      | Name          |
      | Email         |
      | Phone         |
      | Business Name |
      | Address       |