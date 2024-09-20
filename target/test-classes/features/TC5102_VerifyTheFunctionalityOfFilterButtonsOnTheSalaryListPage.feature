Feature:  US 51 Verify the Salary List Page Elements and Filters under Payroll

  Scenario: TC 5102 Ensure that after navigating to the Salary List page under the Payroll section,
  the user sees the relevant elements,
  including text boxes for filtering, buttons for filtering actions, a salary list table,
  and an option to create a new salary entry.

    Given The user is logged in to the Admin page
    And   click on the 'Payroll' button
    And   1 sn wait
    And   click on the 'Salary' button
    And   clears month textboxe
    And   the user enters "2023-09" in the Month text box
    And   click on the "Filter" button
    Then  the salary records should be filtered by the month "Sep 2023"
