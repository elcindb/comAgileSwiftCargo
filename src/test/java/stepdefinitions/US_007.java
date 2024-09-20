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

    //us7

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
