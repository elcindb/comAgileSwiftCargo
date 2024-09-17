Feature: US031 Admin Login Testi

  Scenario: TC01 Admin panel links visibility test
    Given kullanici "asUrl" anasayfaya gider
    When sayfada AgileSwift Cargo logosunu dogrular
    And kullanici Login butonuna tiklar
    And kullanici Sign up here baglantisina tiklar
    And sayfadaki Bussiness Name, Full Name, Select Hub, Mobile, Password, Address metin kutuları ve Register My Account butonunun gorunurlugunu ve islevselligini test eder
    And login sayfasina geri doner
    And kullanici Forgot Password baglantisina tiklar
    And Email Address ve Send Password Reset link butonu gorulur ve islevsel olmalidir
    And Email Address'e email adresi "adminSelahattinEmail" girildikten sonra Send butonuna tiklandiktan sonra ilgili panele yonlendirildigi dogrulanmalidir

  @E2E
  Scenario:TC02  Admin panel login test

    Given kullanici "asUrl" anasayfaya gider
    When sayfada AgileSwift Cargo logosunu dogrular
    Then kullanici Login butonuna tiklar
    Then email ve password kutularini dogrular
    And email olarak "adminSelahattinEmail" girer
    And password olarak "password" girer
    Then singIn butonuna basar
    And basarili giris yapilabildigini test eder

  @smoke
  Scenario: TC03

    Given sayfada AgileSwift Cargo logosunu dogrular
    And menuden parcel linkine tiklar



