package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class US_042 {


    WebDriver driver;

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
        driver.findElement(By.linkText(page)).click(); // 'Parcels' sayfasına gitme
    }

    @Then("Parcel bilgilerini görüntüler")
    public void parcel_bilgilerini_görüntüler() {
        assertTrue(driver.findElement(By.id("parcelTable")).isDisplayed());
        driver.quit();
    }

    @When("Yönetici yeni bir parcel bilgisi ekler")
    public void yönetici_yeni_bir_parcel_bilgisi_ekler() {
        driver.findElement(By.id("addParcelButton")).click();
        driver.findElement(By.id("parcelName")).sendKeys("Yeni Parcel");
        driver.findElement(By.id("parcelDescription")).sendKeys("Yeni Parcel Açıklama");
        driver.findElement(By.id("saveButton")).click();
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

}
