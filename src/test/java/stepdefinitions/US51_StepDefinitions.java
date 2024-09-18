package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.Admin;
import pages.Merchant;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;

import java.util.List;

public class US51_StepDefinitions {

    Admin admin= new Admin();

    Merchant merchant=new Merchant();

    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    Actions actions =new Actions(Driver.getDriver());

    static String inputUser;
    static  String inputMonth;

    @Given("The following elements are visible on the pageSalary :")
    public void the_following_elements_are_visible_on_the_page_salary(List<String> expectedOptions) {

        Assertions.assertEquals(expectedOptions.get(0),admin.selectUserSalaryListTestBox.getText());
        Assertions.assertEquals(expectedOptions.get(1),admin.monthUstLabel.getText());
        Assertions.assertEquals(expectedOptions.get(2),admin.filterSalaryListButton.getText());
        Assertions.assertEquals(expectedOptions.get(3),admin.clearSalaryListButton.getText());
        Assertions.assertEquals(expectedOptions.get(4),admin.salaryTitleLabel.getText());
        Assertions.assertEquals(expectedOptions.get(5),admin.userTitleLabel.getText());
        Assertions.assertEquals(expectedOptions.get(6),admin.fromAccountLabel.getText());
        Assertions.assertEquals(expectedOptions.get(7),admin.monthLabel.getText());
        Assertions.assertEquals(expectedOptions.get(8),admin.dateLabel.getText());
        Assertions.assertEquals(expectedOptions.get(9),admin.noteLabel.getText());
        Assertions.assertEquals(expectedOptions.get(10),admin.amountLabel.getText());
        Assertions.assertTrue(admin.actionsBranch.isDisplayed());


    }

    @Given("clears month textboxe")
    public void clears_month_textboxe() {

        admin.monthSalaryListTestBox.clear();
    }

    @Given("save input data in user text box and clear text boxes")
    public void save_input_data_in_user_text_box_and_clear_text_boxes() {

        inputUser=JSUtilities.getInput(admin.selectUserSalaryListTestBox);
        inputMonth=JSUtilities.getInput(admin.monthSalaryListTestBox);

    }
    @Given("verify that user text box and clear text box data are empty")
    public void verify_that_user_text_box_and_clear_text_box_data_are_empty() {

        Assertions.assertTrue(inputMonth.isEmpty());
        Assertions.assertNull(inputUser);

    }

    @Given("the user enters {string} in the Month text box")
    public void the_user_enters_in_the_month_text_box(String string) {

        admin.monthSalaryListTestBox.sendKeys(string);

    }

    @Then("the salary records should be filtered by the month {string}")
    public void the_salary_records_should_be_filtered_by_the_month(String string) {

        Assertions.assertEquals(string,admin.valueMonthLabel.getText());


    }


    @And("A menu with options should open under the Actions button:")
    public void aMenuWithOptionsShouldOpenUnderTheActionsButton(List<String> expectedOptions) {
        List<WebElement> menuOptions =  Driver.getDriver().findElements(By.xpath("//a[@class='dropdown-item']"));
        System.out.println(menuOptions.size());
        for (int i = 0; i < expectedOptions.size(); i++) {
            Assertions.assertEquals(expectedOptions.get(i).replaceAll("[^a-zA-Z0-9]",""), menuOptions.get(i+28).getText().replaceAll("[^a-zA-Z0-9]",""));

        }
    }

    @And("confirms that there is no {string} status code on the opened page")
    public void confirmsThatThereIsNoStatusCodeOnTheOpenedPage(String arg0) {

        System.out.println(JSUtilities.getTextWithJS(Driver.getDriver(), admin.internetServerError500));


    }

    @Then("the user should see the Pay Slip details page without errors")
    public void the_user_should_see_the_pay_slip_details_page_without_errors() {

        WebElement element= Driver.getDriver().findElement(By.xpath("//a[@href='https://qa.agileswiftcargo.com']"));
        Assertions.assertFalse(element.isDisplayed());
    }
}
