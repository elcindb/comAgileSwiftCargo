package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class US_007 {

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

    @When("Kullanıcı {string} sayfasına gider")
    public void kullanıcı_sayfasına_gider(String page) {
        driver.findElement(By.linkText(page)).click(); // 'Pricing' sayfasına gitme
    }

    @Then("Kullanıcı kargo fiyatlandırmalarını görüntüler")
    public void kullanıcı_kargo_fiyatlandırmalarını_görüntüler() {
        assertTrue(driver.findElement(By.id("pricingTable")).isDisplayed()); // Fiyatlandırma tablosunun ID'si değişebilir
        driver.quit();
    }
}
