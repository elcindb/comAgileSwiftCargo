package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertTrue;



public class US_004 {


    WebDriver driver;

    @Given("Kullanıcı login sayfasına gider")
    public void kullanıcı_login_sayfasına_gider() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://qa.agileswiftcargo.com/");
    }

    @When("Kullanıcı geçerli {string} ve {string} ile giriş yapar")
    public void kullanıcı_geçerli_ve_ile_giriş_yapar(String username, String password) {
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("loginButton")).click(); // Login butonu ID'si değişebilir
    }

    @When("Kullanıcı {string} alanına kargo numarasını girer")
    public void kullanıcı_alanına_kargo_numarasını_girer(String kargoNumarasi) {
        driver.findElement(By.id("trackNowInput")).sendKeys(kargoNumarasi); // 'Track Now' alanı ID'si
    }

    @When("Kullanıcı {string} butonuna tıklar")
    public void kullanıcı_butonuna_tıklar(String button) {
        driver.findElement(By.id("trackNowButton")).click(); // 'Track Now' buton ID'si
    }

    @Then("Kullanıcı kargonun durumunu görüntüler")
    public void kullanıcı_kargonun_durumunu_görüntüler() {
        assertTrue(driver.findElement(By.id("trackingResult")).isDisplayed()); // Kargo durumu görüntüleme ID'si
        driver.quit();
    }

    @When("Kullanıcı {string} alanına geçersiz kargo numarası girer")
    public void kullanıcı_alanına_geçersiz_kargo_numarası_girer(String kargoNumarasi) {
        driver.findElement(By.id("trackNowInput")).sendKeys(kargoNumarasi);
    }

    @Then("Kullanıcı geçersiz kargo numarası uyarısını görür")
    public void kullanıcı_geçersiz_kargo_numarası_uyarısını_görür() {
        assertTrue(driver.findElement(By.id("errorMessage")).isDisplayed()); // Geçersiz kargo numarası uyarısı ID'si
        driver.quit();
    }


}

