Feature:  Verify the Functionality of the 'Cancel' Button on the Create Branch Page

  Scenario: Ensure that the 'Cancel' button on
  the 'Create Branch' page is functional
  and returns the user to the
  'Branch Management' page without saving any changes.

    Given The user is logged in to the Admin page
    And  The user clicks on 'Branch Manage' in the Dashboard menu
    And  The user clicks on 'Branch' from the dropdown menu
    And click on the 'Plus' button
    And fill the text boxes 'absd' '12345678901' 'Paris' on the create branch page
    And  click on the 'Cancel' button
    And  The user is returned to the 'branchManageUrl' page


