Feature: US36 Verify the 'Edit' Functionality for the First Branch in the List

  Scenario: TC3613 Ensure that after changing the status of
  the first branch to "Inactive,"
  the user can edit it
  again and change the status back to "Active."

    Given The user is logged in to the Admin page
    And  The user clicks on 'Branch Manage' in the Dashboard menu
    And  The user clicks on 'Branch' from the dropdown menu
    And click on the 'Actions' button
    And click on the 'Edit' button
    And fill the text boxes 'yeni4' '12345678910' 'Paris' on the create branch page
    And  click on the 'Save Change' button
    And visualizes the message that the changes have been successful
