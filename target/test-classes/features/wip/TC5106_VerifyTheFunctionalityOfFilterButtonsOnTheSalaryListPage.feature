Feature:  US 51 Verify the Functionality of 'Clear' Buttons on the Salary List Page

  Scenario: TC 5106 Ensure that the  the 'Filter'
  button correctly filters salaries based
  on the selected criteria for "User" and "Month."

    Given The user is logged in to the Admin page
    And   click on the 'Payroll' button
    And   click on the 'Salary' button
    And   clears month textboxe
    And   the user enters "2023-09" in the Month text box
    And   click on the "ClearSalaryPage" button
    And   click on the "ClearSalaryPage" button
    And   save input data in user text box and clear text boxes
    And   verify that user text box and clear text box data are empty