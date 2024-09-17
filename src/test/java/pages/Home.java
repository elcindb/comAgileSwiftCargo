package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Home {

public Home(){
    PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(className ="logo" )
    public WebElement anasayfaLogo;

    @FindBy(xpath = "//*[text()='Login']")
    public WebElement loginButton;

    @FindBy (id = "email")
    public WebElement loginPageEmailBox;

    @FindBy (id = "password")
    public WebElement loginPagePasswordBox;

    @FindBy (xpath = "//*[text()='Sign in']")
    public WebElement loginPageSignIn;

    @FindBy (xpath = "//*[text()='Sign up here']")
    public WebElement signUpHereButton;

    @FindBy (id = "business_name")
    public WebElement businessNameTextBox;

    @FindBy (id = "full_name")
    public WebElement fullNameTextBox;

    @FindBy (id = "mobile")
    public WebElement mobileTextBox;

    @FindBy (id = "password")
    public WebElement passwordTextBox;

    @FindBy (id = "address")
    public WebElement addressTextBox;

    @FindBy (id = "merchant_registration_checkbox")
    public WebElement iAgreeCheckBox;

    @FindBy (id = "merchant_registration_submit")
    public WebElement registerButton;

    @FindBy(xpath = "//select[@class='form-control select2 select2-hidden-accessible']")
    public WebElement selectHubButton;

    @FindBy (xpath = "//*[text()='Forgot Password']")
    public WebElement forgotPasswordLink;

    @FindBy (id = "email")
    public WebElement emailTextBox; //forgot password page

    @FindBy (xpath = "//*[text()='Send Password Reset Link']")
    public WebElement sendButton;

    @FindBy (xpath = "//*[@class='alert alert-success']")
    public WebElement mailDogrulamaTexti;


}

