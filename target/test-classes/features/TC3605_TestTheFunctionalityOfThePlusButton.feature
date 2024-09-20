Feature: Test the functionality of the '(+)' button.

  Scenario: Checking the function of the “plus”(+) button on the Admin Login and 'Branch Management' page

    Given The user is logged in to the Admin page
    And  The user clicks on 'Branch Manage' in the Dashboard menu
    And  The user clicks on 'Branch' from the dropdown menu
    And  1 sn wait
    And click on the 'Plus' button
    And  Create Branch page webelements are visible