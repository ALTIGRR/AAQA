import io.restassured.RestAssured;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PayFrame {
    public WebDriver driver;
    @FindBy
            (id = "connection-phone")
    private WebElement phoneField;
    @FindBy
            (id = "connection-sum")
    private WebElement sumField;
    @FindBy
            (xpath = "//*[@id=\"pay-connection\"]/button")
    private WebElement continueButton;
    @FindBy
            (xpath = "/html/body/div[8]/div/iframe")
    private WebElement frame;
    @FindBy
            (xpath = "/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/img[1]")
    private WebElement visa;
    @FindBy
            (xpath = "/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/img[2]")
    private WebElement master;
    @FindBy
            (xpath = "/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/img[3]")
    private WebElement bel;
    @FindBy
            (xpath = "/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/div/img[1]")
    private WebElement maestro;
    @FindBy
            (xpath = "/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/div/img[2]")
    private WebElement mir;
    @FindBy
            (xpath = "/html/body/div[6]/main/div/div[2]/div/div[2]/button[2]")
    private WebElement cookieBut;
    @FindBy
            (xpath = "//*[contains(., '100.00 BYN')]")
    private WebElement sumHeader;
    @FindBy
            (xpath = "//button[contains(., '100.00')]")
    private WebElement sumButton;
    @FindBy
            (xpath = "//*[contains(., '375297777777')]")
    private WebElement number;
    @FindBy
            (xpath = "//label[text()='Номер карты']")
    private WebElement cardNumber;
    @FindBy
            (xpath = "//label[text()='Срок действия']")
    private WebElement cardDate;
    @FindBy
            (xpath = "//label[text()='CVC']")
    private WebElement cardCVC;
    @FindBy
            (xpath = "//label[text()='Имя и фамилия на карте']")
    private WebElement cardName;

    public PayFrame(WebDriver driver) {
        PageFactory.initElements(driver, this); // PageFactory — это механизм в Selenium WebDriver, который упрощает работу с Page Object Model (POM) путем автоматической инициализации веб-элементов на странице.Метод initElementsPageFactory.initElements(driver, this) — это статический метод, который:Автоматически инициализирует все веб-элементы, помеченные аннотацией @FindBy,Связывает WebDriver с элементами страницы,Предотвращает появление NullPointerException при работе с элементами;Как работает initElement Метод принимает два параметра:driver — экземпляр WebDriver,this — текущий объект страницы,При выполнении метода происходит:Поиск всех полей типа WebElement в классе,Автоматическая инициализация этих элементов,Связывание их с указанным драйвером
        this.driver = driver;
    }

    public static String geturl() {
        return RestAssured.baseURI = "https://www.mts.by/";
    }

    public void payFrameTest() {
        driver.get(geturl());
        cookieBut.click();
        phoneField.isDisplayed();
        assertTrue(phoneField.isEnabled());
        phoneField.click();
        phoneField.sendKeys("297777777");
        sumField.isDisplayed();
        assertTrue(sumField.isEnabled());
        sumField.click();
        sumField.sendKeys("100");
        continueButton.isDisplayed();
        assertTrue(continueButton.isEnabled());
        continueButton.click();
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[8]/div/iframe")));
        WebElement iframe = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[8]/div/iframe")));
        driver.switchTo().frame(iframe);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(sumHeader));
        wait.until(ExpectedConditions.visibilityOf(sumButton));
        wait.until(ExpectedConditions.visibilityOf(number));
        wait.until(ExpectedConditions.visibilityOf(cardNumber));
        wait.until(ExpectedConditions.visibilityOf(cardDate));
        wait.until(ExpectedConditions.visibilityOf(cardCVC));
        wait.until(ExpectedConditions.visibilityOf(cardName));
        wait.until(ExpectedConditions.visibilityOf(visa));
        wait.until(ExpectedConditions.visibilityOf(master));
        wait.until(ExpectedConditions.visibilityOf(bel));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(maestro));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(mir));
    }
}