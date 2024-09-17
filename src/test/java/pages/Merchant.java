package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Merchant {

    public Merchant(){
    PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy (xpath = "(//*[text()=' Accounts'])[2]")
    public WebElement menuAccountsLink;

    @FindBy (xpath = " (//*[text()=' Payout'])[2]")
     public WebElement accountsPayoutLink;

    @FindBy (xpath = "(//*[text()='Payout'])[2]")
    public WebElement payoutText;

    @FindBy (xpath = "//*[text()='Payout List']")
    public WebElement payoutListText;

    @FindBy (xpath = "(//*[@class='card'])[2]")
    public WebElement stripeLink;

    @FindBy(xpath = "//*[@class='form-control ']")
    public WebElement toAccountDropDown;

    @FindBy(xpath = "//*[@class='form-control w-unset']")
    public WebElement amountTextBox;

    @FindBy(xpath = "//*[text()='Merchant Payment']")
    public WebElement merchantPaymentWindow;

    @FindBy(xpath = "//*[text()='Pay Now']")
    public WebElement payNowButton;
}


