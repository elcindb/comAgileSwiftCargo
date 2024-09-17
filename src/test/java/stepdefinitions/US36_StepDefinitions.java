package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import pages.Admin;
import pages.Merchant;
import utilities.ConfigReader;
import utilities.Driver;

public class US36_StepDefinitions {

    Admin admin= new Admin();

    Merchant merchant=new Merchant();

    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    Actions actions =new Actions(Driver.getDriver());


    @Given("The user is logged in to the Admin page")
    public void the_user_is_logged_in_to_the_admin_page() {
        Driver.getDriver().get(ConfigReader.getProperty("asUrl"));

        merchant.loginButton.click();

        merchant.emailTexteBox.sendKeys(ConfigReader.getProperty("emailAdminAli"));
        merchant.passwordTexteBox.sendKeys(ConfigReader.getProperty("passwordAdminAli"));
        merchant.signInButton.click();
    }


    @When("The user clicks on {string} in the Dashboard menu")
    public void the_user_clicks_on_in_the_dashboard_menu(String string) {

        admin.branchManageDashboard.click();

    }

    @When("The user clicks on {string} from the dropdown menu")
    public void the_user_clicks_on_from_the_dropdown_menu(String string) {

        admin.branch.click();

    }

    @Then("The {string} button should be visible")
    public void the_button_should_be_visible(String string) {

        if(string.equals("Clear")){
          admin.clearBranch.isDisplayed();
        }

        if(string.equals("Filter")){
            admin.filterBranch.isDisplayed();
        }

        if(string.equals("Actions")){
            admin.actionsBranch.isDisplayed();
        }

        if(string.equals("Plus")){
            admin.plusBranch.isDisplayed();
        }



    }

    @Then("The {string} text box should be visible")
    public void the_text_box_should_be_visible(String string) {
        if(string.equals("Name")){

            admin.hubNameTextBranch.isDisplayed();

        }

        if(string.equals("Phone")){
            admin.phoneTextBranch.isDisplayed();

        }

    }


}
