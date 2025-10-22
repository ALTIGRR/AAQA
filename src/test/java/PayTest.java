import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class PayTest {
    public static WebDriver driver;
    public static MainPage mainPage;
    public static PayOptions payOptions;
    public static PayFrame payFrame;

    @BeforeAll
    public static void setupAll() {
        WebDriverManager.chromedriver().setup();

    }

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        mainPage = new MainPage(driver);
        payOptions = new PayOptions(driver);
        payFrame = new PayFrame(driver);
    }

    @Test
    public void test1Name() {
        mainPage.nameTest();
    }

    @Test
    public void test2Logo() {
        mainPage.logoTest();
    }

    @Test
    public void test3Link() {
        mainPage.linkWorkTest();
    }

    @Test
    public void test4Form() {
        mainPage.payFormTest();
    }

    @Test
    public void test5Option1() {
        payOptions.connectOptionTest();
    }

    @Test
    public void test6Option2() {
        payOptions.internetOptionTest();
    }

    @Test
    public void test7Option3() {
        payOptions.mentOptionTest();
    }

    @Test
    public void test8Option4() {
        payOptions.arOptionTest();
    }

    @Test
    public void test9Frame() {
        payFrame.payFrameTest();
    }

    @AfterEach
    public void teardown() {
        driver.quit();
    }
}
