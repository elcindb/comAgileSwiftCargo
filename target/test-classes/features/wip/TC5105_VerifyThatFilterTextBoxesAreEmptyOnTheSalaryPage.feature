Feature:  US 51 Verify the Salary List Page Elements and Filters under Payroll

  Scenario: TC 5105 Ensure that after navigating to the Salary List page under the Payroll section,
  the user sees the relevant elements,
  including text boxes for filtering, buttons for filtering actions, a salary list table,
  and an option to create a new salary entry.

    Given The user is logged in to the Admin page
    And  click on the 'Payroll' button
    And 1 sn wait
    And  click on the 'Salary' button
    And save input data in user text box and clear text boxes
    And verify that user text box and clear text box data are empty


