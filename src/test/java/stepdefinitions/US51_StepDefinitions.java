package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import pages.Admin;
import pages.Merchant;
import utilities.Driver;

import java.util.List;

public class US51_StepDefinitions {

    Admin admin= new Admin();

    Merchant merchant=new Merchant();

    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    Actions actions =new Actions(Driver.getDriver());

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



}
