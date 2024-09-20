Feature:  US33 Verify Success Message and Newly Created Branch Visibility

  Scenario: TC09 Ensure that after entering all required fields correctly
  and clicking the 'Save' button,
  a success message is displayed,
  and the newly created branch is visible at the top of the branch list.

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

