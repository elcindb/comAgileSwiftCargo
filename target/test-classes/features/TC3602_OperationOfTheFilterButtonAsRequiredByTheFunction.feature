Feature:US36 Operation of the “filter” button as required by the function

  ScenarioTC3602 Checking the function of the “filter” button on the Admin Login and 'Branch Management' page

    Given The user is logged in to the Admin page
    And  The user clicks on 'Branch Manage' in the Dashboard menu
    And  The user clicks on 'Branch' from the dropdown menu
    Then Enter 'branchName' in the Name textboxes.
    And  1 sn wait
    And  click on the 'Filter' button
    And  1 sn wait
    And  verify that 'branchName' is filtered in the branch list.