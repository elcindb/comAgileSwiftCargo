Feature: US019 Accessing Change Password Page

  Scenario:Verify that clicking the 'Change Password' link opens the correct page with all necessary elements.

    Given The user is logged in to the Merchant page
    When The user clicks on the profile icon in the top bar
    And the user clicks on the "Change password" link in the menu then new page should open
    And 3 sn wait
    And the page should contain the "Old Password"
    And the page should contain the "New Password"
    And the page should contain the "Confirm Password"
    And the page should contain the "Save Change"
    And the page should contain the "Cancel"
