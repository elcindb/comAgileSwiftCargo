Feature: Operation of the clear button as required by the function

  Scenario: Checking the function of the “clear” button on the Admin Login and 'Branch Management' page

    Given The user is logged in to the Admin page
    And  The user clicks on 'Branch Manage' in the Dashboard menu
    And  The user clicks on 'Branch' from the dropdown menu
    Then Enter 'branchName' in the Name textboxes.
    And  1 sn wait
    And click on the 'Filter' button
    And  1 sn wait
    And  click on the 'Clear' button
    And  1 sn wait
    And  Verify that 10 branches are visible in the branch list