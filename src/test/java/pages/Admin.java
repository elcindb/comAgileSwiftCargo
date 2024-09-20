package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Admin {

    public Admin(){ PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy (xpath = "//*[text()='Agile Swift Cargo Dashboard ']")
    public WebElement AdminDashboardPageText;

    @FindBy (xpath = "(//*[text()='Parcels'])[1]")
    public WebElement parcelsLink;

    @FindBy(xpath = "//a[text()='Branch Manage']")
    public WebElement branchManageDashboard;

    @FindBy(xpath = "(//a[text()='Branch'])[2]")
    public WebElement branch;

    @FindBy(xpath = "(//a[@href='https://qa.agileswiftcargo.com/admin/hubs'])[3]")
    public WebElement clearBranch;

    @FindBy(xpath = "//button[@class='btn btn-space btn-primary']")
    public WebElement filterBranch;

    @FindBy(xpath = "(//button[@tabindex='-1'])[1]")
    public WebElement actionsBranch;

    @FindBy(xpath = "//a[@href='https://qa.agileswiftcargo.com/admin/hubs/create']")
    public WebElement plusBranch;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement hubNameTextBranch;

    @FindBy(xpath = "(//input[@type='text'])[3]")
    public WebElement phoneTextBranch;

    @FindBy(xpath = "//td[2]")
    public WebElement branchNameInfo;

    @FindBy(xpath = "//tr")
    public List<WebElement> numberOfBranch;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement createBranchNameTextBox;

    @FindBy(xpath = "//input[@id='phone']")
    public WebElement createBranchPhoneTextBox;

    @FindBy(xpath = "//input[@id='address']")
    public WebElement createBranchAddressTextBox;

    @FindBy(xpath = "//select[@name='status']")
    public WebElement createBranchStatusSelect;

    @FindBy(xpath = "(//button[text()='Save'])[2]")
    public WebElement createBranchSaveButton;

    @FindBy(xpath = "//a[text()='Cancel']")
    public WebElement createBranchCancelButton;

    @FindBy(xpath = "(//small[@class='text-danger mt-2'])[1]")
    public WebElement errorMessageNameCreateBranch;

    @FindBy(xpath = "(//small[@class='text-danger mt-2'])[2]")
    public WebElement errorMessagePhoneCreateBranch;

    @FindBy(xpath = "(//small[@class='text-danger mt-2'])[3]")
    public WebElement errorMessageAdressCreateBranch;

    @FindBy(xpath = "(//tr//td)[2]")
    public WebElement premierBranchName;

    @FindBy(xpath = "(//button[text()=' Delete'])[1]")
    public WebElement deleteButtonBrach;

    @FindBy(xpath = "//button[text()='Yes']")
    public WebElement yesButtonBrach;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[29]")
    public WebElement viewButtonBrach;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[30]")
    public WebElement editButtonBrach;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[31]")
    public WebElement mangeInChangeButtonBrach;

    @FindBy(xpath = "(//button[@class='btn btn-primary group-btn ml-0'])")
    public WebElement filterButtonBranchView;



    @FindBy(xpath = "//a[text()='Clear']")
    public WebElement clearButtonBranchView;

    @FindBy(xpath = "//span[text()='Total']")
    public WebElement totalLabelBranchView;

    @FindBy(xpath = "//h5[text()='Total Parcel']")
    public WebElement totalParcelLabelBranchView;

    @FindBy(xpath = "//span[text()='Title']")
    public WebElement titleLabelBranchView;

    @FindBy(xpath = "//span[text()='Cash Collection']")
    public WebElement cashCollectionLabelBranchView;

    @FindBy(xpath = "//span[text()='Delivered  Cash Collection ']")
    public WebElement deliveredCashCollectionLabelBranchView;

    @FindBy(xpath = "//span[text()='Partial Delivered  Cash Collection ']")
    public WebElement partialDeliveredCashCollectionLabelBranchView;

    @FindBy(xpath = "//span[text()='Delivery Charge']")
    public WebElement deliveryChargeLabelBranchView;

    @FindBy(xpath = "//span[text()='Vat Amount']")
    public WebElement vatAmountLabelBranchView;

    @FindBy(xpath = "//p[text()='View']")
    public WebElement viewLabelBranchView;

    @FindBy(xpath = "//th[text()='Tracking Id']")
    public WebElement trackingIdLabelBranchView;

    @FindBy(xpath = "//th[text()='Recipient Info']")
    public WebElement recipientInfoLabelBranchView;

    @FindBy(xpath = "//th[text()='Merchant']")
    public WebElement merchantLabelBranchView;

    @FindBy(xpath = "//th[text()='Amount (Tk)']")
    public WebElement amountTkLabelBranchView;

    @FindBy(xpath = "//th[text()='Status']")
    public WebElement statusLabelBranchView;

    @FindBy(xpath = "//button[text()='Save Change']")
    public WebElement saveChangeEditBranchButton;

    @FindBy(xpath = "//script")
    public List<WebElement> scriptMessage;

    @FindBy(xpath = "//a[text()='Payroll']")
    public WebElement payrollButtonDashboard;

    @FindBy(xpath = "(//a[text()='Salary'])[2]")
    public WebElement salaryButtonDashboard;

    @FindBy(xpath = "//span[@class='select2-selection__rendered']")
    public WebElement selectUserSalaryListTestBox;

    @FindBy(xpath = "//input[@id='month']")
    public WebElement monthSalaryListTestBox;

    @FindBy(xpath = "//button[@class='btn btn-space btn-primary']")
    public WebElement filterSalaryListButton;

    @FindBy(xpath = "//a[@class='btn btn-space btn-secondary']")
    public WebElement clearSalaryListButton;

    @FindBy(xpath = "//p[text()='Salary']")
    public WebElement salaryTitleLabel;

    @FindBy(xpath = "(//tr//th)[2]")
    public WebElement userTitleLabel;

    @FindBy(xpath = "(//tr//th)[3]")
    public WebElement fromAccountLabel;

    @FindBy(xpath = "(//tr//th)[4]")
    public WebElement monthLabel;

    @FindBy(xpath = "(//tr//th)[5]")
    public WebElement dateLabel;

    @FindBy(xpath = "(//tr//th)[6]")
    public WebElement noteLabel;

    @FindBy(xpath = "(//tr//th)[7]")
    public WebElement amountLabel;

    @FindBy(xpath = "//label[text()='Month']")
    public WebElement monthUstLabel;

    @FindBy(xpath = "//tr[1]//td[4]")
    public WebElement valueMonthLabel;

    @FindBy(xpath = "//a[@class='dropdown-item']")
    public List<WebElement> menuOptions;

    @FindBy(xpath = "//a[@href='https://qa.agileswiftcargo.com/admin/salary/pay-slip/4909']")
    public WebElement paySlipButtonSalaryList;

    @FindBy(xpath = "//h2[text()='500 Internal Server Error.']")
    public WebElement internetServerError500;

    @FindBy (xpath = "(//*[@class='input-group-prepend be-addon'])[1]")
    public WebElement assignlink;

    @FindBy (xpath = "(//*[text()='Pickup Assign'])[2]")
    public WebElement pickUpLink;

    @FindBy (xpath = "//*[@id='select2-delivery_man_search_assign-container']")
    public WebElement pickupmanDropdownMenu;


    @FindBy (xpath = "//input[@aria-label='Search']")
    public WebElement deliveryTextBox;



    @FindBy (xpath = "(//*[text()='Save'])[2]")
    public WebElement saveButton;

    @FindBy (xpath = "(//*[text()='Pickup Assign'])[2]")
    public WebElement pickUpLinks;

    @FindBy (xpath = "//*[@class='select2-results__option select2-results__option--selectable select2-results__option--highlighted']")
    public WebElement aliustaText;













   }
