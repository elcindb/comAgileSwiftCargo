Feature: US36 Validating Error Message When Required Fields Are Not Filled While Creating a New Branch

  Scenario: TC3606 Ensure that when the 'Name', 'Phone', and 'Address' text boxes are not filled, an appropriate error message is displayed upon clicking the 'Save' button on the 'Create Branch' page.

    Given The user is logged in to the Admin page
    And  The user clicks on 'Branch Manage' in the Dashboard menu
    And  The user clicks on 'Branch' from the dropdown menu
    And  1 sn wait
    And click on the 'Plus' button
    And  click on the 'Cancel' button
    And  click on the 'Plus' button
    And  click on the 'Save' button
    And  An appropriate error message is displayed on the Create Branch Page
