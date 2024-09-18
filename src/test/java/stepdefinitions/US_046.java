package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class US_046{

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
        driver.findElement(By.linkText(page)).click(); // 'Accounts' sayfasına gitme
    }

    @Then("Account bilgilerini görüntüler")
    public void account_bilgilerini_görüntüler() {
        assertTrue(driver.findElement(By.id("accountTable")).isDisplayed()); // Accounts tablo ID'si değişebilir
        driver.quit();
    }

    @When("Yönetici yeni bir account bilgisi ekler")
    public void yönetici_yeni_bir_account_bilgisi_ekler() {
        driver.findElement(By.id("addAccountButton")).click(); // 'Add Account' butonu ID'si değişebilir
        driver.findElement(By.id("accountName")).sendKeys("Yeni Hesap");
        driver.findElement(By.id("accountDescription")).sendKeys("Yeni Hesap Açıklama");
        driver.findElement(By.id("saveButton")).click();
    }

    @Then("Account başarıyla eklenir")
    public void account_başarıyla_eklenir() {
        assertTrue(driver.findElement(By.id("successMessage")).isDisplayed());
        driver.quit();
    }

    @When("Yönetici var olan bir account bilgisini günceller")
    public void yönetici_var_olan_bir_account_bilgisi_günceller() {
        driver.findElement(By.id("editAccountButton")).click(); // 'Edit' butonu ID'si değişebilir
        driver.findElement(By.id("accountDescription")).clear();
        driver.findElement(By.id("accountDescription")).sendKeys("Güncellenmiş Hesap Açıklama");
        driver.findElement(By.id("saveButton")).click();
    }

    @Then("Account bilgisi başarıyla güncellenir")
    public void account_bilgisi_başarıyla_güncellenir() {
        assertTrue(driver.findElement(By.id("successMessage")).isDisplayed());
        driver.quit();
    }

    @When("Yönetici bir account bilgisini siler")
    public void yönetici_bir_account_bilgisi_siler() {
        driver.findElement(By.id("deleteAccountButton")).click(); // 'Delete' butonu ID'si değişebilir
        driver.switchTo().alert().accept(); // Silme işlemi onayı
    }

    @Then("Account bilgisi başarıyla silinir")
    public void account_bilgisi_başarıyla_silinir() {
        assertTrue(driver.findElement(By.id("successMessage")).isDisplayed());
        driver.quit();
    }
}
