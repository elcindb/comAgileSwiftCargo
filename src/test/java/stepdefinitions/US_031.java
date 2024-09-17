package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.Admin;
import pages.Home;
import utilities.ConfigReader;
import utilities.Driver;

public class US_031 {
    Admin admin = new Admin();
    Home home = new Home();
    WebDriver driver;
    @Given("kullanici {string} anasayfaya gider")
    public void kullanici_anasayfaya_gider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }
    @When("sayfada AgileSwift Cargo logosunu dogrular")
    public void sayfada_agile_swift_cargo_logosunu_dogrular() {
       home.anasayfaLogo.isDisplayed();
    }

    @Then("kullanici Login butonuna tiklar")
    public void kullanici_login_butonuna_tiklar() {
        home.loginButton.click();
    }

    @Then("email ve password kutularini dogrular")
    public void email_ve_password_kutularini_dogrular() {
       home.loginPageEmailBox.isDisplayed();
       home.loginPagePasswordBox.isDisplayed();
    }

    @Then("email olarak {string} girer")
    public void email_olarak_girer(String email) {
        home.loginPageEmailBox.sendKeys(ConfigReader.getProperty(email));
    }
    @Then("password olarak {string} girer")
    public void password_olarak_girer(String sifre) {
        home.loginPagePasswordBox.sendKeys(ConfigReader.getProperty(sifre));
    }
    @Then("singIn butonuna basar")
    public void sing_in_butonuna_basar() {
         home.loginPageSignIn.click();
    }
    @Then("basarili giris yapilabildigini test eder")
    public void basarili_giris_yapilabildigini_test_eder() {
        admin.AdminDashboardPageText.isDisplayed();
    }

    @When("kullanici Sign up here baglantisina tiklar")
    public void kullanici_sign_up_here_baglantisina_tiklar() {
       home.signUpHereButton.click();
    }
    @When("sayfadaki Bussiness Name, Full Name, Select Hub, Mobile, Password, Address metin kutuları ve Register My Account butonunun gorunurlugunu ve islevselligini test eder")
    public void sayfadaki_bussiness_name_full_name_select_hub_mobile_password_address_metin_kutuları_ve_register_my_account_butonunun_gorunurlugunu_ve_islevselligini_test_eder() {
        home.businessNameTextBox.isDisplayed();
        home.businessNameTextBox.isEnabled();
        home.fullNameTextBox.isDisplayed();
        home.fullNameTextBox.isEnabled();
        home.mobileTextBox.isDisplayed();
        home.mobileTextBox.isEnabled();
        home.passwordTextBox.isDisplayed();
        home.passwordTextBox.isEnabled();
        home.addressTextBox.isDisplayed();
        home.addressTextBox.isEnabled();
        home.iAgreeCheckBox.isDisplayed();
        home.iAgreeCheckBox.isEnabled();
        home.registerButton.isDisplayed();
        home.registerButton.isEnabled();
        home.selectHubButton.isDisplayed();
        Select select = new Select(home.selectHubButton);
        select.selectByValue("1");

    }
        @When("login sayfasina geri doner")
        public void login_sayfasina_geri_doner() {
        Driver.getDriver().navigate().back();
        }
        @When("kullanici Forgot Password baglantisina tiklar")
        public void kullanici_forgot_password_baglantisina_tiklar() {
        home.forgotPasswordLink.click();
        }
        @When("Email Address ve Send Password Reset link butonu gorulur ve islevsel olmalidir")
        public void email_address_ve_send_password_reset_link_butonu_gorulur_ve_islevsel_olmalidir() {
        home.emailTextBox.isDisplayed();
        home.emailTextBox.isEnabled();
        home.sendButton.isDisplayed();
        home.sendButton.isEnabled();

        }
        @When("Email Address'e email adresi {string} girildikten sonra Send butonuna tiklandiktan sonra ilgili panele yonlendirildigi dogrulanmalidir")
        public void email_address_e_email_adresi_girildikten_sonra_send_butonuna_tiklandiktan_sonra_ilgili_panele_yonlendirildigi_dogrulanmalidir(String email) {

        home.emailTextBox.sendKeys(ConfigReader.getProperty(email));
        home.sendButton.click();
        home.mailDogrulamaTexti.isDisplayed();
        }

        @Given("menuden parcel linkine tiklar")
        public void menuden_parcel_linkine_tiklar() {
        admin.parcelsLink.click();

        }
    }

