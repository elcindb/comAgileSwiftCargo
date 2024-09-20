Feature: Merchant Sign Up Here

  Scenario:

    Given kullanici "asUrl" anasayfaya gider
    When sayfada AgileSwift Cargo logosunu dogrular
    Then kullanici Login butonuna tiklar

    When Enter an "merchantKerimEmail" number registered in the system and the correct "password" information
    Then Click on the Sign In button

    When they navigate to the Parcels section on the dashboard
    And they click the Add button
    And they fill out the form with valid details


    Scenario:

      Given kullanici "asUrl" anasayfaya gider
      When sayfada AgileSwift Cargo logosunu dogrular
      Then kullanici Login butonuna tiklar
      Then email ve password kutularini dogrular
      And email olarak "adminSelahattinEmail" girer
      And password olarak "password" girer
      Then singIn butonuna basar

      And menuden parcel linkine tiklar
      When Yönetici "Parcels" sayfasına gider
      And Yönetici Status Update butonuna tıklar
      Then Pick Up Assign butonuna tıklar
      Then Select Delivery Man textine tıklar aliusta yazar
      Then Save Buttonuna tıklar
      And Status sutununda Pickup Assign yazısını doğrular
















