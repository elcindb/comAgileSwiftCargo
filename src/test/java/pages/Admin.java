package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Admin {

    public Admin(){ PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy (xpath = "//*[text()='Agile Swift Cargo Dashboard ']")
    public WebElement AdminDashboardPageText;

    @FindBy (xpath = "(//*[text()='Parcels'])[1]")
    public WebElement parcelsLink;




   }
