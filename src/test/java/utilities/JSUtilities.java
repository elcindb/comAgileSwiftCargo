package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JSUtilities {

    // A function that scrolls the page up to the specified element.
    public static void scrollToElement(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    // A function that clicks the specified element using the JavaScriptExecutor.
    public static void clickWithJS(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    // Function that assigns a value to the specified input element.
    public static void setInputFieldWithJS(WebDriver driver, WebElement element, String value) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].value='" + value + "';", element);
    }

    // A function that retrieves the text of the specified element using JavaScriptExecutor.
    public static String getTextWithJS(WebDriver driver, WebElement element) {
        return ((JavascriptExecutor) driver).executeScript("return arguments[0].innerText;", element).toString();
    }

    // A function that highlights the specified element using JavaScriptExecutor.

    public static void highlightElementWithJS(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", element);
    }

    // A function that waits until the page is loaded.
    public static void waitForPageLoadWithJS(WebDriver driver, Duration timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }

    // A function that scrolls to the bottom of the page.
    public static void scrollToBottom(WebDriver driver) {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    // A function that scrolls to the top of the page.
    public static void scrollToTop(WebDriver driver) {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
    }

    // A function that returns the number of open windows.
    public static int getNumberOfOpenWindows(WebDriver driver) {
        return driver.getWindowHandles().size();
    }

    //form doldurma vs gibi durumlarda girilen degerin degerin formdan alinmasi methodu
    public static String getEnteredInput( WebElement element, String input){
        String retrievedValue=(String) ((JavascriptExecutor)Driver.getDriver()).executeScript("return arguments[0].value;",element);
        if (input.equals(retrievedValue)){
            System.out.println("entered value successfully received: "+retrievedValue);
        }else {
            System.out.println("entered value not received ");
        }
        return retrievedValue;
    }


    public static String getBrowserErrorMessage( String elementByIdValue){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        String actualErrorMessage = (String) js.executeScript(
                "var input = document.getElementById('"+elementByIdValue+"');" +
                        "if (input.validity.valid) return '';" +
                        "return input.validationMessage;"
        );

        return actualErrorMessage;
    }

    public static String getInput( WebElement element){
        String retrievedValue=(String) ((JavascriptExecutor)Driver.getDriver()).executeScript("return arguments[0].value;",element);

        return retrievedValue;
    }


}
