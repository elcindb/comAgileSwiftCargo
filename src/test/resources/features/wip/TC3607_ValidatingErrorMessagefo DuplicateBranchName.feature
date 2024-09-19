Feature: US36 Validating Error Message for Duplicate Branch Name

  Scenario: TC3607 Ensure that an appropriate error message is displayed
             when entering a branch name that is already registered
             while creating a new branch, even if all other required fields are filled.

    Given The user is logged in to the Admin page
    And  The user clicks on 'Branch Manage' in the Dashboard menu
    And  The user clicks on 'Branch' from the dropdown menu
    And  1 sn wait
    And click on the 'Plus' button
    And fill the text boxes 'abs' '12345678901' 'Paris' on the create branch page
    And  click on the 'Save' button
    And  An appropriate 'The Name has already been taken.' is displayed on the Create Branch Page