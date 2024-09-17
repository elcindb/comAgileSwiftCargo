package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.Merchant;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US25_E2E_StepDefinitions {

    Merchant merchant= new Merchant();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    Actions actions =new Actions(Driver.getDriver());
    @When("they navigate to the Parcels section on the dashboard")
    public void they_navigate_to_the_section_on_the_dashboard() {


        merchant.parcelsDashboardMenu.click();

    }
    @When("they click the Add button")
    public void they_click_the_button() {

        js.executeScript("arguments[0].click();", merchant.parcelsListAddBoutton);

    }
    @When("they fill out the form with valid details")
    public void they_fill_out_the_form_with_valid_details() {

        merchant.cashCollectiontexteBoxe.click();

        actions.sendKeys(ConfigReader.getProperty("cashCollection"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("sellingPrice"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("invoice"))
                .perform();

        merchant.categorytexteBoxe.click();

        merchant.categoryOptiosKG.click();

        merchant.deliveryTypetexteBoxe.click();

        merchant.deliveryTypeOptionsSameDay.click();

        merchant.customerNametexteBoxe.click();

        actions.sendKeys(ConfigReader.getProperty("customerName"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("customerPhone"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("customerAddress"))
                .perform();

        js.executeScript("arguments[0].click();", merchant.saveButtonParcelsCreate);




        ReusableMethods.bekle(5);

    }
    @Then("a new parcel should be created and visible in the parcel list")
    public void a_new_parcel_should_be_created_and_visible_in_the_parcel_list() {

        System.out.println(merchant.customerNameReceptionInfo.getText());

        Assertions.assertEquals(merchant.customerNameReceptionInfo.getText(),ConfigReader.getProperty("customerName"));



    }
}
