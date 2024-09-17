package stepdefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.Merchant;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class US18_StepDefinitions {

    Merchant agileSwift= new Merchant();

    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    Actions actions =new Actions(Driver.getDriver());

    @Given("The user is logged in to the Merchant page")
    public void the_user_is_logged_in_to_the_merchant_page() {

        Driver.getDriver().get(ConfigReader.getProperty("asUrl"));

        agileSwift.loginButton.click();

        agileSwift.emailTexteBox.sendKeys(ConfigReader.getProperty("emailMarchantAli"));
        agileSwift.passwordTexteBox.sendKeys(ConfigReader.getProperty("passwordMarchantAli"));
        agileSwift.signInButton.click();




    }
    @When("The user clicks on the profile icon in the top bar")
    public void the_user_clicks_on_the_profile_icon_in_the_top_bar() {

        actions.moveToElement(agileSwift.profileIconInTheTopBar).click().perform();

        //js.executeScript("arguments[0].click();", agileSwift.profileIconInTheTopBar);

    }

    @Then("A menu should open with the following options:")
    public void a_menu_should_open_with_the_following_options(List<String> expectedOptions) {


        List<WebElement> menuOptions =  Driver.getDriver().findElements(By.xpath("//a[@class='dropdown-item']"));
        System.out.println(menuOptions.size());
        for (int i = 0; i < expectedOptions.size(); i++) {
            Assertions.assertEquals(expectedOptions.get(i), menuOptions.get(i+18).getText());

        }

    }

    @When("the user clicks on the {string} link in the menu then new page should open")
    public void the_user_clicks_on_the_link_in_the_menu(String string) {


        if (string.equals("Logout")){
            Driver.getDriver().findElement(By.xpath("(//a[text()='"+"\n" +
                    "                                                "+string+"\n" +
                    "                                            "+"'])[1]")).click();
        }else {
            Driver.getDriver().findElement(By.xpath("(//a[text()='"+string+"'])[1]")).click();
        }


        if (string.equals("Profile")){
            Assertions.assertTrue(Driver.getDriver().getCurrentUrl().contains("profile"));
        }

        if(string.equals("Change password")){
            Assertions.assertTrue(Driver.getDriver().getCurrentUrl().contains("change"));
        }

        if(string.equals("Logout")){
            Assertions.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://qa.agileswiftcargo.com/"));
        }



    }

    @Then("the page should display the following general profile information:")
    public void the_page_should_display_the_following_general_profile_information(io.cucumber.datatable.DataTable dataTable) {
        List<String> expectedFields = dataTable.asList();

        for (String field: expectedFields){
            WebElement element= Driver.getDriver().findElement(By.xpath("//span[text()='"+field+" : "+"']"));
            if (!element.isDisplayed()) {
                throw new AssertionError(field + " is not displayed on the page.");
            }

        }

    }

    @When("the user clicks on the {string}")
    public void the_user_clicks_on_the(String string) {
        if(string.equals("Edit")){
            Driver.getDriver().findElement(By.xpath("(//a[text()='"+" "+string+"'])[1]")).click();
        } else if (string.equals("Logout")){
            Driver.getDriver().findElement(By.xpath("(//a[text()='"+"\n" +
                    "                                                "+string+"\n" +
                    "                                            "+"'])[1]")).click();
        } else Driver.getDriver().findElement(By.xpath("(//a[text()='"+string+"'])[1]")).click();


    }
    @Then("the following fields should become visible:")
    public void the_following_fields_should_become_visible_and_editable(io.cucumber.datatable.DataTable dataTable) {

        List<String> expectedFields = dataTable.asList();

        System.out.println(agileSwift.addressTexteProfile.getText());

        System.out.println(expectedFields.get(4));


        Assertions.assertEquals(expectedFields.get(0),agileSwift.nameTexteProfile.getText());
        Assertions.assertEquals(expectedFields.get(1),agileSwift.emailTexteProfile.getText());
        Assertions.assertEquals(expectedFields.get(2),agileSwift.mobileTexteProfile.getText());
        Assertions.assertEquals(expectedFields.get(3),agileSwift.businessNameTexteProfile.getText());
        //Assertions.assertEquals(expectedFields.get(4),agileSwift.addressTexteProfile.getText());
        Assertions.assertEquals(expectedFields.get(5),agileSwift.imageProfile.getText());
        Assertions.assertEquals(expectedFields.get(6),agileSwift.nidProfile.getText());
        Assertions.assertEquals(expectedFields.get(7),agileSwift.tradeLicenceProfile.getText());


    }



    @When("Click the Edit button on the Profile page")
    public void click_the_edit_button_on_the_profile_page() {

        agileSwift.editButtonMerchantProfile.click();

    }
    @When("the user modifies the Phone to {string}")
    public void the_user_modifies_the_phone_to(String string) {

        if (string.equals("newPhone")){
            string=ConfigReader.getProperty("merchantPhoneNew");
        }else {
            string=ConfigReader.getProperty("merchantPhone");
        }
        agileSwift.mobileTexteBoxMerchantProfile.clear();

        agileSwift.mobileTexteBoxMerchantProfile.sendKeys(string);
    }
    @When("the user clicks the Save button")
    public void the_user_clicks_the_save_button() {

        js.executeScript("arguments[0].click();", agileSwift.saveChangeButtonProfile);

    }
    @Then("the profile should be updated with the new information")
    public void the_profile_should_be_updated_with_the_new_information() {

        if(agileSwift.valeurPhoneProfile.getText().equals(ConfigReader.getProperty("merchantPhoneNew"))){
            Assertions.assertEquals(agileSwift.valeurPhoneProfile.getText(),ConfigReader.getProperty("merchantPhoneNew"));
        }
        if (agileSwift.valeurPhoneProfile.getText().equals(ConfigReader.getProperty("merchantPhone"))){
            Assertions.assertEquals(agileSwift.valeurPhoneProfile.getText(),ConfigReader.getProperty("merchantPhone"));
        }

    }








}
