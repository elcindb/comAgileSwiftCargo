Feature: Merchant Sign Up Here

  Scenario: Merchant Sign Up Here Link

  Given Successfully logged in to the "loginUrl" panel
  Then Verify that the Sign Up Here link is visible and clicked
  Then Verify that the text boxes Business Name, Full Name, Select Hub, Mobile, Password, Address are visible on the page that opens.
  Then Verifies that the Register My Account button is visible
  And Fill in all the fields in the form with valid information and click the Register My Account button
