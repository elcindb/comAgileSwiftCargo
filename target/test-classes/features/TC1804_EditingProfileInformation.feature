Feature: US018 Editing Profile Information

  Scenario:TC04 Verify that profile information can be successfully edited.

    Given The user is logged in to the Merchant page
    When The user clicks on the profile icon in the top bar
    And the user clicks on the "Profile" link in the menu then new page should open
    And Click the Edit button on the Profile page
    And the user modifies the Phone to "newPhone"
    And the user clicks the Save button
    Then the profile should be updated with the new information
    And Click the Edit button on the Profile page
    And the user modifies the Phone to "Phone"
    And the user clicks the Save button
    Then the profile should be updated with the new information

