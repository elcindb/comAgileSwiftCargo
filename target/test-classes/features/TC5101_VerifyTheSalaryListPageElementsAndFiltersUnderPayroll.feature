Feature:  US 51 Verify the Salary List Page Elements and Filters under Payroll

  Scenario: TC5101 Ensure that after navigating to the Salary List page under the Payroll section,
  the user sees the relevant elements,
  including text boxes for filtering, buttons for filtering actions, a salary list table,
  and an option to create a new salary entry.

    Given The user is logged in to the Admin page
    And  click on the 'Payroll' button
    And 1 sn wait
    And  click on the 'Salary' button
    And 1 sn wait
    And clears month textboxe
    And click on the 'Filter' button
    And The following elements are visible on the pageSalary :
    |Select User|
    |Month|
    |Filter|
    |Clear|
    |Salary|
    |User|
    |From Account|
    |Month|
    |Date|
    |Note|
    |Amount (Tk)|
    |Action|
