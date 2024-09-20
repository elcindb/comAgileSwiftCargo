package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import pages.Admin;
import pages.Page;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class US_042 {


    WebDriver driver;
    Admin admin = new Admin();

    Actions actions = new Actions(Driver.getDriver());

    @Given("Yönetici login sayfasına gider")
    public void yönetici_login_sayfasına_gider() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://qa.agileswiftcargo.com/");
    }

    @When("Yönetici geçerli {string} ve {string} ile giriş yapar")
    public void yönetici_geçerli_ve_ile_giriş_yapar(String username, String password) {
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("loginButton")).click(); // Login butonu ID'si değişebilir
    }

    @When("Yönetici {string} sayfasına gider")
    public void yönetici_sayfasına_gider(String page) {
        Driver.getDriver().findElement(By.linkText(page)).click(); // 'Parcels' sayfasına gitme
    }

    @Then("Parcel bilgilerini görüntüler")
    public void parcel_bilgilerini_görüntüler() {
        assertTrue(driver.findElement(By.id("parcelTable")).isDisplayed());
        driver.quit();
    }

    @When("Yönetici yeni bir parcel bilgisi ekler")
    public void yönetici_yeni_bir_parcel_bilgisi_ekler() {
        Driver.getDriver().findElement(By.id("addParcelButton")).click();
        Driver.getDriver().findElement(By.id("parcelName")).sendKeys("Yeni Parcel");
        Driver.getDriver().findElement(By.id("parcelDescription")).sendKeys("Yeni Parcel Açıklama");
        Driver.getDriver().findElement(By.id("saveButton")).click();
    }

    @Then("Parcel başarıyla eklenir")
    public void parcel_başarıyla_eklenir() {
        assertTrue(driver.findElement(By.id("successMessage")).isDisplayed());
        driver.quit();
    }

    @When("Yönetici var olan bir parcel bilgisini günceller")
    public void yönetici_var_olan_bir_parcel_bilgisi_günceller() {
        driver.findElement(By.id("editParcelButton")).click();
        driver.findElement(By.id("parcelDescription")).clear();
        driver.findElement(By.id("parcelDescription")).sendKeys("Güncellenmiş Parcel Açıklama");
        driver.findElement(By.id("saveButton")).click();
    }

    @Then("Parcel bilgisi başarıyla güncellenir")
    public void parcel_bilgisi_başarıyla_güncellenir() {
        assertTrue(driver.findElement(By.id("successMessage")).isDisplayed());
        driver.quit();
    }

    @When("Yönetici bir parcel bilgisini siler")
    public void yönetici_bir_parcel_bilgisi_siler() {
        driver.findElement(By.id("deleteParcelButton")).click();


    }

    @When("Yönetici Status Update butonuna tıklar")
    public void yönetici_status_update_butonuna_tıklar() {

        admin.assignlink.click();




    }
    @Then("Pick Up Assign butonuna tıklar")
    public void pick_up_assign_butonuna_tıklar() {

        admin.pickUpLink.click();

    }
    @Then("Select Delivery Man textine tıklar aliusta yazar")
    public void select_delivery_man_textine_tıklar_aliusta_yazar() {

        ReusableMethods.bekle(1);
        admin.pickupmanDropdownMenu.click();

        ReusableMethods.bekle(1);
        admin.deliveryTextBox.sendKeys("aliusta");
        ReusableMethods.bekle(3);
        admin.aliustaText.click();


    }
    @Then("Save Buttonuna tıklar")
    public void save_buttonuna_tıklar() {

        admin.saveButton.click();

    }
    @Then("Status sutununda Pickup Assign yazısını doğrular")
    public void status_sutununda_pickup_assign_yazısını_doğrular() {


        ReusableMethods.bekle(1);
        admin.pickUpLinks.isDisplayed();

        ReusableMethods.bekle(1);

        System.out.println(admin.pickUpLink.getText());
        ReusableMethods.bekle(5);

    }


}
