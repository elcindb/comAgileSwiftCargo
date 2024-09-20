
Feature: US019 Password Change with Incorrect Old Password

  Scenario: TC1902 Verify that the system prevents password changes when the old password is incorrect.
    Given The user is logged in to the Merchant page
    When The user clicks on the profile icon in the top bar
    And the user clicks on the "Change password" link in the menu then new page should open
    Then Enter "incorrect password" in the "Old Password" text box
    Then Enter "new password" in the "New Password" text box
    Then Enter "new password" in the "Confirm Password" text box
    Then the user clicks on the Save Change
    And verify that the password has not changed
