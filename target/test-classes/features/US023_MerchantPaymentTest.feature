Feature: US023 Merchant Payment Test

  Scenario: TC01 Test displaying information on the Accounts/payout page

    Given kullanici "asUrl" anasayfaya gider
    When kullanici Login butonuna tiklar
    And email olarak "merchantSelahattinEmail" girer
    And password olarak "password" girer
    Then singIn butonuna basar
    And Accounts menusu altinda Payout sekmesi gorunur ve tiklanabilir
    And Payout baglantisi tiklaninca yonlendirilen sayfa dogrulananir
    And Payout List gorunur
    And Stripe baglantisi gorunur ve tiklanabilir
    And Stripe baglantisi tiklandiktan sonra To Account ve Amount textboxlari gorunur

  Scenario: TC02 Testing your pay data as a Merchant
    Given kullanici "asUrl" anasayfaya gider
    When kullanici Login butonuna tiklar
    And email olarak "merchantSelahattinEmail" girer
    And password olarak "password" girer
    Then singIn butonuna basar
    And Accounts menusu altinda Payout sekmesi gorunur ve tiklanabilir
    And Payout baglantisi tiklaninca yonlendirilen sayfa dogrulananir
    And Payout List gorunur
    And Stripe baglantisi gorunur ve tiklanabilir
    And Stripe baglantisi tiklandiktan sonra To Account ve Amount textboxlari gorunur
    Given kullanici To Account ve Amount textboxlarina data girer
    And  kullanici Pay Now butonuna tiklar
    And kullanici Merchant Payment penceresinin acildigini dogrular
