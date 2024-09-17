Feature: US025 Parcel Management

  Scenario:E2E Add a new parcel

  Scenario: Add a new parcel
    Given The user is logged in to the Merchant page
    When they navigate to the Parcels section on the dashboard
    And they click the Add button
    And they fill out the form with valid details
    Then a new parcel should be created and visible in the parcel list