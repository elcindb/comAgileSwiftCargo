Feature: Verify the presence of buttons on Admin Login and 'Branch Manage' Page

  Scenario: Checking the presence of 'Clear', 'Filter', (+) buttons, 'Actions', 'Name', and 'Phone' text boxes

    Given The user is logged in to the Admin page
    And The user clicks on 'Branch Manage' in the Dashboard menu
    And The user clicks on 'Branch' from the dropdown menu
    And 1 sn wait
    And The 'Clear' button should be visible
    And The 'Filter' button should be visible
    And The 'Plus' button should be visible
    And The 'Actions' button should be visible
    And The 'Name' text box should be visible
    And The 'Phone' text box should be visible