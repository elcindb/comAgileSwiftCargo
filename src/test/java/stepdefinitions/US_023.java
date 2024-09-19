package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Admin;
import pages.Home;
import pages.Merchant;

public class US_023 {
    Admin admin = new Admin();
    Home home = new Home();
    Merchant merchant = new Merchant();
    @Then("Accounts menusu altinda Payout sekmesi gorunur ve tiklanabilir")
    public void accounts_menusu_altinda_payout_sekmesi_gorunur_ve_tiklanabilir() {
        merchant.menuAccountsLink.click();
        merchant.accountsPayoutLink.isDisplayed();
        merchant.accountsPayoutLink.isEnabled();

    }
    @Then("Payout baglantisi tiklaninca yonlendirilen sayfa dogrulananir")
    public void payout_baglantisi_tiklaninca_yonlendirilen_sayfa_dogrulananir() {
        merchant.accountsPayoutLink.click();
        merchant.payoutText.isDisplayed();

    }
    @Then("Payout List gorunur")
    public void payout_list_gorunur() {
        merchant.payoutListText.isDisplayed();
    }
    @Then("Stripe baglantisi gorunur ve tiklanabilir")
    public void stripe_baglantisi_gorunur_ve_tiklanabilir() {
        merchant.stripeLink.isDisplayed();
        merchant.stripeLink.isEnabled();
    }
    @Then("Stripe baglantisi tiklandiktan sonra To Account ve Amount textboxlari gorunur")
    public void stripe_baglantisi_tiklandiktan_sonra_to_account_ve_amount_textboxlari_gorunur() {
        merchant.stripeLink.click();
        merchant.toAccountDropDown.isDisplayed();
        merchant.amountTextBox.isDisplayed();
    }
    @Given("kullanici To Account ve Amount textboxlarina data girer")
    public void kullanici_to_account_ve_amount_textboxlarina_data_girer() {
        merchant.amountTextBox.sendKeys("500");
    }
    @Given("kullanici Pay Now butonuna tiklar")
    public void kullanici_pay_now_butonuna_tiklar() {
        merchant.payNowButton.click();
    }
    @Given("kullanici Merchant Payment penceresinin acildigini dogrular")
    public void kullanici_merchant_payment_penceresinin_acildigini_dogrular() {
        merchant.merchantPaymentWindow.isDisplayed();
    }

}
