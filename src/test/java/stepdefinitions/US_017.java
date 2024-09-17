package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.Home;
import pages.Merchant;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


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




}
