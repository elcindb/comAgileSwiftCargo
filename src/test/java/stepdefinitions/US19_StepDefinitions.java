package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import pages.Merchant;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US19_StepDefinitions {

    Merchant merchant= new Merchant();

    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    Actions actions =new Actions(Driver.getDriver());
    @When("the user clicks on the {string} link in the menu")
    public void the_user_clicks_on_the_link_in_the_menu(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the page should contain the {string}")
    public void the_page_should_contain_the_text_box(String string) {

        if(string.equals("Old Password")){
            Assertions.assertEquals(merchant.oldPasswordTexte.getText(),string);
        }

        if(string.equals("New Password")){
            Assertions.assertEquals(merchant.newPasswordTexte.getText(),string);
        }

        if(string.equals("Confirme Password")){
            Assertions.assertEquals(merchant.confirmePasswordTexte.getText(),string);
        }

        if(string.equals("Save Change")){
            Assertions.assertEquals(merchant.saveChangePasswordButton.getText(),string);
        }

        if(string.equals("Cancel")){
            Assertions.assertEquals(merchant.cancelPasswordButton.getText(),string);
        }




    }


    @Then("the page should contain the {string} button")
    public void the_page_should_contain_the_button(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("all elements should be visible and functional")
    public void all_elements_should_be_visible_and_functional() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @When("{int} sn wait")
    public void saniye_bekle(Integer int1) {
        ReusableMethods.bekle(int1);
    }


    @Then("Enter {string} in the {string} text box")
    public void enter_in_the_text_box(String string, String string2) {

        if (string.equals("incorrect password")&string2.equals("Old Password")){
            merchant.oldPasswordInputBox.sendKeys(ConfigReader.getProperty("incorrectPassword"));
        }

        if (string.equals("old password")&string2.equals("Old Password")){
            merchant.oldPasswordInputBox.sendKeys(ConfigReader.getProperty("oldPassword"));
        }


        if (string.equals("new password")&string2.equals("New Password")){
            merchant.newPasswordInputBox.sendKeys(ConfigReader.getProperty("newPassword"));
        }

        if (string.equals("new password")&string2.equals("Confirm Password")){
            merchant.confirmePasswordInputBox.sendKeys(ConfigReader.getProperty("newPassword"));
        }

        if (string.equals("misMatchedNewPassword")&string2.equals("Confirm Password")){
            merchant.confirmePasswordInputBox.sendKeys(ConfigReader.getProperty("misMatchedNewPassword"));
        }








    }
    @Then("the user clicks on the Save Change")
    public void click_the_button() {

        merchant.saveChangePasswordButton.click();

    }

    @Then("verify that the password has not changed")
    public void verify_that_the_password_has_not_changed() {
        Assertions.assertTrue(merchant.saveChangePasswordButton.isDisplayed());
    }

    @Then("verify that the password has changed")
    public void verify_that_the_password_has_changed() {

        Assertions.assertTrue(merchant.editButtonMerchantProfile.isDisplayed());

    }



}
