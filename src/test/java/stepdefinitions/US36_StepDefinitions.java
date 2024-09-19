package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Admin;
import pages.Merchant;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;
import java.util.List;

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

    @Then("Enter {string} in the Name textboxes.")
    public void enter_in_the_name_textboxes(String string) {

        string= ConfigReader.getProperty("branchName");

        admin.hubNameTextBranch.sendKeys(string);


    }

    @Then("click on the {string} button")
    public void click_on_the_button(String string) {

        if(string.equals("Clear")){
            admin.clearBranch.click();
        }

        if(string.equals("Filter")){
            admin.filterBranch.click();
        }

        if(string.equals("Actions")){
            admin.actionsBranch.click();
        }

        if(string.equals("Plus")){
            admin.plusBranch.click();
        }

        if(string.equals("Save")){
            admin.createBranchSaveButton.click();
        }

        if(string.equals("Cancel")){
            admin.createBranchCancelButton.click();
        }

        if(string.equals("Delete")){
            ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", admin.deleteButtonBrach);
            js.executeScript("arguments[0].click();", admin.deleteButtonBrach);

        }

        if(string.equals("Yes")){
            ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", admin.yesButtonBrach);
            js.executeScript("arguments[0].click();", admin.yesButtonBrach);


        }

        if(string.equals("View")){
            admin.viewButtonBrach.click();
        }

        if(string.equals("Edit")){
            admin.editButtonBrach.click();
        }

        if(string.equals("Mange In-Charge")){
            admin.mangeInChangeButtonBrach.click();
        }

        if (string.equals("Save Change")){

            admin.saveChangeEditBranchButton.click();
        }

        if (string.equals("Payroll")){
            ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", admin.payrollButtonDashboard);
            admin.payrollButtonDashboard.click();
        }

        if (string.equals("Salary")){
            ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", admin.salaryButtonDashboard);
            admin.salaryButtonDashboard.click();
        }

        if (string.equals("ClearSalaryPage")){
            ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", admin.clearSalaryListButton);
            admin.clearSalaryListButton.click();
        }

        if (string.equals("Pay slip")){
            ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", admin.paySlipButtonSalaryList);
            admin.paySlipButtonSalaryList.click();
        }



    }

    @Then("verify that {string} is filtered in the branch list.")
    public void verify_that_is_filtered_in_the_branch_list(String string) {

        string= ConfigReader.getProperty("branchName");

        //Assertions.assertEquals(string,admin.branchNameInfo.getText());
        Assertions.assertTrue(admin.branchNameInfo.getText().contains(string));

    }

    @Then("Verify that {int} branches are visible in the branch list")
    public void verify_that_branches_are_visible_in_the_branch_list(Integer int1) {
        System.out.println(admin.numberOfBranch.size());

        Assertions.assertTrue(int1==(admin.numberOfBranch.size()-1));

    }

    @Then("Create Branch page webelements are visible")
    public void create_branch_page_webelements_are_visible() {

        Assertions.assertTrue(admin.createBranchNameTextBox.isDisplayed());
        Assertions.assertTrue(admin.createBranchPhoneTextBox.isDisplayed());
        Assertions.assertTrue(admin.createBranchAddressTextBox.isDisplayed());
        Assertions.assertTrue(admin.createBranchStatusSelect.isDisplayed());
        Assertions.assertTrue(admin.createBranchSaveButton.isDisplayed());
        Assertions.assertTrue(admin.createBranchCancelButton.isDisplayed());

    }

    @Given("An appropriate error message is displayed on the Create Branch Page")
    public void an_appropriate_error_message_is_displayed() {

        admin.errorMessageNameCreateBranch.isDisplayed();
        admin.errorMessagePhoneCreateBranch.isDisplayed();
        admin.errorMessageAdressCreateBranch.isDisplayed();

        Assertions.assertEquals("The Name field is required.",admin.errorMessageNameCreateBranch.getText());
        Assertions.assertEquals("The Phone field is required.",admin.errorMessagePhoneCreateBranch.getText());
        Assertions.assertEquals("The Address field is required.",admin.errorMessageAdressCreateBranch.getText());


    }

    @Given("fill the text boxes {string} {string} {string} on the create branch page")
    public void fill_the_text_boxes_on_the_create_branch_page(String string, String string2, String string3) {

        admin.createBranchPhoneTextBox.clear();
        admin.createBranchNameTextBox.clear();
        admin.createBranchAddressTextBox.clear();

        admin.createBranchNameTextBox.sendKeys(string);
        admin.createBranchPhoneTextBox.sendKeys(string2);
        admin.createBranchAddressTextBox.sendKeys(string3);
    }

    @Given("An appropriate {string} is displayed on the Create Branch Page")
    public void an_appropriate_is_displayed_on_the_create_branch_page(String string) {

        try {
            Assertions.assertEquals(string,admin.errorMessageNameCreateBranch.getText());
        } catch (Exception e1) {
            Assertions.assertEquals(string,admin.errorMessagePhoneCreateBranch.getText());
            try{

            }catch (Exception e2){
                Assertions.assertEquals(string,admin.errorMessageAdressCreateBranch.getText());
            }
        }

    }

    @Given("the new branch {string} added is displayed in the first row")
    public void the_new_branch_added_is_displayed_in_the_first_row(String string) {

        Assertions.assertEquals(string,admin.premierBranchName.getText());
    }

    @Given("The user is returned to the {string} page")
    public void the_user_is_returned_to_the_page(String string) {


        Assertions.assertEquals(ConfigReader.getProperty(string),Driver.getDriver().getCurrentUrl());

    }

    @Then("A Actions should open with the following options:")
    public void a_menu_should_open_with_the_following_optionse(List<String> expectedOptions) {

        List<WebElement> menuOptions =  Driver.getDriver().findElements(By.xpath("//a[@class='dropdown-item']"));
        for (int i = 0; i < expectedOptions.size()-1; i++) {
            Assertions.assertEquals(expectedOptions.get(i), menuOptions.get(i+28).getText());

        }

        Assertions.assertEquals(expectedOptions.get(3), Driver.getDriver().findElement(By.xpath("(//button[@class='dropdown-item'])[1]")).getText());
    }


    @Given("The following elements are visible on the page:")
    public void the_following_elements_are_visible_on_the_page(List<String> expectedOptions) {


        Assertions.assertEquals(expectedOptions.get(0),admin.filterButtonBranchView.getText());
        Assertions.assertEquals(expectedOptions.get(1),admin.clearButtonBranchView.getText());
        Assertions.assertEquals(expectedOptions.get(2),admin.totalParcelLabelBranchView.getText());
        Assertions.assertEquals(expectedOptions.get(3),admin.totalLabelBranchView.getText());
        Assertions.assertEquals(expectedOptions.get(4),admin.titleLabelBranchView.getText());
        Assertions.assertEquals(expectedOptions.get(5),admin.cashCollectionLabelBranchView.getText());
        Assertions.assertEquals(expectedOptions.get(6),admin.deliveredCashCollectionLabelBranchView.getText());
        Assertions.assertEquals(expectedOptions.get(7),admin.partialDeliveredCashCollectionLabelBranchView.getText());
        Assertions.assertEquals(expectedOptions.get(8),admin.deliveryChargeLabelBranchView.getText());
        Assertions.assertEquals(expectedOptions.get(9),admin.vatAmountLabelBranchView.getText());
        Assertions.assertEquals(expectedOptions.get(10),admin.viewLabelBranchView.getText());
        Assertions.assertEquals(expectedOptions.get(11),admin.trackingIdLabelBranchView.getText());
        Assertions.assertEquals(expectedOptions.get(12),admin.recipientInfoLabelBranchView.getText());
        Assertions.assertEquals(expectedOptions.get(13),admin.merchantLabelBranchView.getText());
        Assertions.assertEquals(expectedOptions.get(14),admin.amountTkLabelBranchView.getText());
        Assertions.assertEquals(expectedOptions.get(15),admin.statusLabelBranchView.getText());







    }

    @Given("visualizes the message that the changes have been successful")
    public void visualizes_the_message_that_the_changes_have_been_successful() {
        // WebDriverWait ile geçici mesajın görünmesini bekle
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        // Mesajı locate et (CSS Selector ile)
        WebElement successMessage = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.className("toast-success"))
        );
        // Mesajın içeriğini kontrol et
        Assertions.assertTrue(successMessage.isDisplayed());
    }

    @Given("deleted {string} branch is not visible in the list")
    public void deleted_branch_is_not_visible_in_the_list(String string) {

        Assertions.assertNotEquals(string,admin.branchNameInfo.getText());
    }





}
