Feature: US019 Successful Password Change

  Scenario: TC1904 Verify that a valid password change is processed correctly.

    Given The user is logged in to the Merchant page
    When The user clicks on the profile icon in the top bar
    And the user clicks on the "Change password" link in the menu then new page should open
    Then Enter "old password" in the "Old Password" text box
    Then Enter "new password" in the "New Password" text box
    Then Enter "new password" in the "Confirm Password" text box
    Then the user clicks on the Save Change
    And verify that the password has changed