Feature: US36 Validating Error Message for Invalid Phone Number Length

  Scenario: TC3608 Ensure that an appropriate error message is displayed
  when entering an invalid phone number (less than 11 digits or more than 14 digits)
  while creating a new branch.

    Given The user is logged in to the Admin page
    And  The user clicks on 'Branch Manage' in the Dashboard menu
    And  The user clicks on 'Branch' from the dropdown menu
    And  1 sn wait
    And click on the 'Plus' button
    And fill the text boxes 'ooooo' '1234567890' 'Paris' on the create branch page
    And  click on the 'Save' button
    And  An appropriate 'The Phone must be between 11 and 14 digits.' is displayed on the Create Branch Page