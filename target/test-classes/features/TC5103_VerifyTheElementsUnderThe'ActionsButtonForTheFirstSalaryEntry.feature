Feature:  US 51 Verify the Elements under the 'Actions' Button for the First Salary Entry

  Scenario: TC 5103 Ensure that clicking on the
  'Actions' button for the first salary entry in
  the list opens a dropdown menu displaying the necessary elements.

    Given The user is logged in to the Admin page
    And   click on the 'Payroll' button
    And   1 sn wait
    And   click on the 'Salary' button
    And   clears month textboxe
    And   click on the "Filter" button
    And   click on the "Actions" button
    And  A menu with options should open under the Actions button:
      | Pay slip    |
      | Edit |
      | Delete     |
