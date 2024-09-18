Feature:  Verify Dropdown Menu Options under the 'Actions' Button

  Scenario: Ensure that when the blue box under the 'Actions' heading is clicked,
  a dropdown menu appears with the options:
  "View," "Edit," "Manage in-Charge," and "Delete."

    Given The user is logged in to the Admin page
    And  The user clicks on 'Branch Manage' in the Dashboard menu
    And  The user clicks on 'Branch' from the dropdown menu
    And click on the 'Actions' button
    Then A Actions should open with the following options:
      | View            |
      | Edit |
      | Mange In-Charge     |
      | Delete     |


