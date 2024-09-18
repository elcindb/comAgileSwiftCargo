package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class US_027 {

    WebDriver driver;

    @Given("Merchant login sayfasına gider")
    public void merchant_login_sayfasına_gider() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://qa.agileswiftcargo.com/");
    }

    @When("Merchant geçerli {string} ve {string} ile giriş yapar")
    public void merchant_geçerli_ve_ile_giriş_yapar(String username, String password) {
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("loginButton")).click(); // Login butonu ID'si değişebilir
    }

    @When("Merchant {string} sayfasına gider")
    public void merchant_sayfasına_gider(String page) {
        driver.findElement(By.linkText(page)).click(); // 'Reports' sayfasına gitme
    }

    @Then("Merchant ürün durum raporlarını görüntüler")
    public void merchant_ürün_durum_raporlarını_görüntüler() {
        assertTrue(driver.findElement(By.id("reportsTable")).isDisplayed()); // Raporlar tablosu ID'si değişebilir
        driver.quit();
    }
}
