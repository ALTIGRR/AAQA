import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LogoTest {
    WebDriver driver;
    private WebDriverWait wait;

    @BeforeAll
    static void setupAll() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }
    @Test
    void testLogo() {
        driver.get("https://www.mts.by/");
        By visaLogo = By.cssSelector("img[alt='Visa']");
        By mastercardLogo = By.cssSelector("img[alt='MasterCard']");
        By belkartLogo = By.cssSelector("img[alt='Белкарт']");

        assertTrue(isElementDisplayed(visaLogo), "Логотип Visa не найден.");
        assertTrue(isElementDisplayed(mastercardLogo), "Логотип MasterCard не найден.");
        assertTrue(isElementDisplayed(belkartLogo), "Логотип Белкарт не найден.");
    }
    private boolean isElementDisplayed(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
