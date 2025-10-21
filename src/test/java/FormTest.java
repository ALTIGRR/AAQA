import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FormTest {
    WebDriver driver;

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
    void testForm() {
        driver.get("https://www.mts.by/");
        WebElement cookieButton =
                driver.findElement(By.xpath("/html/body/div[6]/main/div/div[2]/div/div[2]/button[2]"));
        cookieButton.click();
        driver.findElement(By.xpath("//*[@id=\"connection-phone\"]")).isDisplayed();
        assertTrue(driver.findElement(By.xpath("//*[@id=\"connection-phone\"]")).isEnabled());
        WebElement phoneField =
                driver.findElement(By.xpath("//*[@id=\"connection-phone\"]"));
        phoneField.click();
        phoneField.sendKeys("297777777");
        driver.findElement(By.xpath("//*[@id=\"connection-sum\"]")).isDisplayed();
        assertTrue(driver.findElement(By.xpath("//*[@id=\"connection-sum\"]")).isEnabled());
        WebElement sumField =
                driver.findElement(By.xpath("//*[@id=\"connection-sum\"]"));
        sumField.click();
        sumField.sendKeys("100");
        driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button")).isDisplayed();
        assertTrue(driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button")).isEnabled());
        WebElement continueButton =
                driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button"));
        continueButton.click();
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[8]/div/iframe")));
    }
}
