Feature:  US 51 Verify the 'Pay Slip' Option under the 'Actions' Button

  Scenario: TC 5104 Ensure that clicking
  on the 'Pay Slip' option under the 'Actions'
  dropdown for the first salary entry opens the pay slip details.

    Given The user is logged in to the Admin page
    And   click on the 'Payroll' button
    And   click on the 'Salary' button
    And   clears month textboxe
    And   click on the "Filter" button
    And   click on the "Actions" button
    And   click on the "Pay slip" button
    And   the user should see the Pay Slip details page without errors