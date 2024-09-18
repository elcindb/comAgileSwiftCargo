Feature:  US 36 Verify the Functionality of the 'Delete' Button for a Branch

  Scenario: Ensure that when the 'Delete' option under
  the 'Actions' dropdown is clicked for a branch,
  the branch is deleted from the branch list.

    Given The user is logged in to the Admin page
    And  The user clicks on 'Branch Manage' in the Dashboard menu
    And  The user clicks on 'Branch' from the dropdown menu
    And click on the 'Plus' button
    And fill the text boxes 'yeni' '12345678901' 'Paris' on the create branch page
    And  click on the 'Save' button
    And  the new branch 'yeni' added is displayed in the first row
    And click on the 'Actions' button
    And click on the 'Delete' button
    And click on the 'Yes' button
    And deleted 'yeni' branch is not visible in the list