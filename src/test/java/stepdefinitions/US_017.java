package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Home;
import pages.Merchant;
import utilities.ConfigReader;
import utilities.Driver;


public class US_017 {

    Home home = new Home();
    Merchant merchant = new Merchant();

    @Given("Successfully logged in to the {string} panel")
    public void successfully_logged_in_to_the_panel(String loginUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(loginUrl));

    }

    @When("Enter an {string} number registered in the system and the correct {string} information")
    public void enter_an_number_registered_in_the_system_and_the_correct_information(String email, String password) {

        home.loginPageEmailBox.sendKeys(ConfigReader.getProperty(email));

        home.loginPagePasswordBox.sendKeys(ConfigReader.getProperty(password));


    }

    @Then("Click on the Sign In' button")
    public void click_on_the_sign_in_button() {
        home.loginPageSignIn.click();
    }

    @And("It is checked whether the login process has been successful and whether the user has been redirected to the administration panel")
    public void it_is_checked_whether_the_login_process_has_been_successful_and_whether_the_user_has_been_redirected_to_the_administration_panel() {

        merchant.dashboardButton.isDisplayed();


    }



    @Given("The Home Page opens and the {string} button in the upper right corner is pressed")
    public void the_home_page_opens_and_the_button_in_the_upper_right_corner_is_pressed(String loginUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(loginUrl));



    }
    @Then("Enter Email or Mobile' is verified that the text box is visible")
    public void enter_email_or_mobile_is_verified_that_the_text_box_is_visible() {

        merchant.emailTexteBox.isDisplayed();


    }
    @Then("Password' is verified that the text box is visible")
    public void password_is_verified_that_the_text_box_is_visible() {

        merchant.passwordTexteBox.isDisplayed();

    }

    @Then("Sign In button is visible")
    public void sign_in_button_is_visible() {

        merchant.signInButton.isDisplayed();

    }



    @Given("Successfully logged in to the {string} panel")
    public void successfully_logged_in_to_the_merchant_panel(String loginUrl) {

        Driver.getDriver().get(ConfigReader.getProperty(loginUrl));


    }

    @Then("Verify that the Sign Up Here link is visible and clicked")
    public void verify_that_the_sign_up_here_link_is_visible_and_clicked() {




    }

    @Then("Verify that the text boxes Business Name, Full Name, Select Hub, Mobile, Password, Address are visible on the page that opens.")
    public void verify_that_the_text_boxes_business_name_full_name_select_hub_mobile_password_address_are_visible_on_the_page_that_opens() {


    }

    @Then("Verifies that the Register My Account button is visible")
    public void verifies_that_the_register_my_account_button_is_visible() {


    }

    @Then("Fill in all the fields in the form with valid information and click the Register My Account button")
    public void fill_in_all_the_fields_in_the_form_with_valid_information_and_click_the_register_my_account_button() {


    }


}



