package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Merchant {

    public Merchant(){
    PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy (xpath = "(//*[text()=' Accounts'])[2]")
    public WebElement menuAccountsLink;

    @FindBy (xpath = " (//*[text()=' Payout'])[2]")
     public WebElement accountsPayoutLink;

    @FindBy (xpath = "(//*[text()='Payout'])[2]")
    public WebElement payoutText;

    @FindBy (xpath = "//*[text()='Payout List']")
    public WebElement payoutListText;

    @FindBy (xpath = "(//*[@class='card'])[2]")
    public WebElement stripeLink;

    @FindBy(xpath = "//*[@class='form-control ']")
    public WebElement toAccountDropDown;

    @FindBy(xpath = "//*[@class='form-control w-unset']")
    public WebElement amountTextBox;

    @FindBy(xpath = "//*[text()='Merchant Payment']")
    public WebElement merchantPaymentWindow;

    @FindBy(xpath = "//*[text()='Pay Now']")
    public WebElement payNowButton;

    @FindBy(xpath = "//a[@href='https://qa.agileswiftcargo.com/login']")
    public WebElement loginButton;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailTexteBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordTexteBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy(xpath = "(//img[@src='https://qa.agileswiftcargo.com/public/uploads/merchant/image/20240914155632.pdf'])[1]")
    public WebElement  profileIconInTheTopBar;

    @FindBy(xpath = "(//a[text()='Profile'])[1]")
    public WebElement  profileLink;

    @FindBy(xpath = "//label[@for='name']")
    public WebElement  nameTexteProfile;

    @FindBy(xpath = "//label[@for='email']")
    public WebElement  emailTexteProfile;

    @FindBy(xpath = "//label[@for='mobile']")
    public WebElement  mobileTexteProfile;

    @FindBy(xpath = "//label[@for='business_name']")
    public WebElement  businessNameTexteProfile;

    @FindBy(xpath = "//label[text()='Address']")
    public WebElement  addressTexteProfile;

    @FindBy(xpath = "//label[@for='image_id']")
    public WebElement  imageProfile;

    @FindBy(xpath = "//label[@for='nid']")
    public WebElement  nidProfile;

    @FindBy(xpath = "//label[@for='trade_license']")
    public WebElement  tradeLicenceProfile;


    @FindBy(xpath = "(//li[@class='nav-item '])[6]")
    public WebElement parcelsDashboardMenu;

    @FindBy(xpath = "//a[@href='https://qa.agileswiftcargo.com/merchant/parcel/create']")
    public WebElement parcelsListAddBoutton;

    @FindBy(xpath = "(//input[@type='text'])[8]")
    public WebElement cashCollectiontexteBoxe;

    @FindBy(xpath = "(//span[@class='select2-selection__rendered'])[2]")
    public WebElement categorytexteBoxe;

    @FindBy(xpath = "//li[text()='KG']")
    public WebElement categoryOptiosKG;

    @FindBy(xpath = "(//span[@class='select2-selection__rendered'])[4]")
    public WebElement deliveryTypetexteBoxe;

    @FindBy(xpath = "(//li[@class='select2-results__option select2-results__option--selectable'])[1]")
    public WebElement deliveryTypeOptionsSameDay;

    @FindBy(xpath = "//input[@id='customer_name']")
    public WebElement customerNametexteBoxe;

    @FindBy(xpath = "//button[text()='Save']")
    public WebElement saveButtonParcelsCreate;

    @FindBy(xpath = "(//p[text()='Jhon Doe'])[1]")
    public WebElement customerNameReceptionInfo;

    @FindBy(xpath = "//a[@href='https://qa.agileswiftcargo.com/merchant/profile/update/941']")
    public WebElement editButtonMerchantProfile;

    @FindBy(xpath = "//input[@id='mobile']")
    public WebElement mobileTexteBoxMerchantProfile;

    @FindBy(xpath = "//button[text()='Save Change']")
    public WebElement saveChangeButtonProfile;

    @FindBy(xpath = "(//span)[36]")
    public WebElement valeurPhoneProfile;

    @FindBy(xpath = "//label[@for='old_password']")
    public WebElement oldPasswordTexte;

    @FindBy(xpath = "//label[@for='new_password']")
    public WebElement newPasswordTexte;

    @FindBy(xpath = "//label[@for='confirm_password']")
    public WebElement confirmePasswordTexte;


    @FindBy(xpath = "//button[text()='Save Change']")
    public WebElement saveChangePasswordButton;

    @FindBy(xpath = "//a[text()='Cancel']")
    public WebElement cancelPasswordButton;

    @FindBy(xpath = "//input[@id='old_password']")
    public WebElement oldPasswordInputBox;

    @FindBy(xpath = "//input[@id='new_password']")
    public WebElement newPasswordInputBox;

    @FindBy(xpath = "//input[@id='confirm_password']")
    public WebElement confirmePasswordInputBox;

    @FindBy(xpath = "(//*[text()='Dashboard'])[1]")
    public WebElement dashboardButton;


    @FindBy(xpath = "//a[@class='dropdown-item']")
    public WebElement menuOptions;

}


