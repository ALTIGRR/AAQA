import io.restassured.RestAssured;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainPage {
    public WebDriver driver;
    @FindBy
            (xpath = "//*[contains(text(), 'Онлайн пополнение ')]")
    private WebElement name;
    @FindBy
            (xpath = "//*[contains(., 'без комиссии')]")
    private WebElement secName;
    @FindBy
            (xpath = "//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[1]/img")
    private WebElement visa;
    @FindBy
            (xpath = "//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[2]/img")
    private WebElement vvisa;
    @FindBy
            (xpath = "//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[3]/img")
    private WebElement master;
    @FindBy
            (xpath = "//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[4]/img")
    private WebElement masterSec;
    @FindBy
            (xpath = "//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[5]/img")
    private WebElement bel;
    @FindBy
            (xpath = "/html/body/div[6]/main/div/div[2]/div/div[2]/button[2]")
    private WebElement cookieBut;
    @FindBy
            (xpath = "//*[@id=\"pay-section\"]/div/div/div[2]/section/div/a")
    private WebElement linkServ;
    @FindBy
            (id = "connection-phone")
    private WebElement phoneField;
    @FindBy
            (id = "connection-sum")
    private WebElement sumField;
    @FindBy
            (xpath = "//*[@id=\"pay-connection\"]/button")
    private WebElement continueButton;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this); // PageFactory — это механизм в Selenium WebDriver, который упрощает работу с Page Object Model (POM) путем автоматической инициализации веб-элементов на странице.Метод initElementsPageFactory.initElements(driver, this) — это статический метод, который:Автоматически инициализирует все веб-элементы, помеченные аннотацией @FindByСвязывает WebDriver с элементами страницы,Предотвращает появление NullPointerException при работе с элементами;Как работает initElement Метод принимает два параметра:driver — экземпляр WebDriver,this — текущий объект страницы,При выполнении метода происходит:Поиск всех полей типа WebElement в классе,Автоматическая инициализация этих элементов,Связывание их с указанным драйвером
        this.driver = driver;
    }

    public static String geturl() {
        return RestAssured.baseURI = "https://www.mts.by/";
    }

    public void nameTest() {
        driver.get(geturl());
        name.isDisplayed();
        secName.isDisplayed();
    }

    public void logoTest() {
        driver.get(geturl());
        visa.isDisplayed();
        vvisa.isDisplayed();
        master.isDisplayed();
        masterSec.isDisplayed();
        bel.isDisplayed();
    }

    public void linkWorkTest() {
        driver.get(geturl());
        cookieBut.click();
        linkServ.isDisplayed();
        assertTrue(linkServ.isEnabled());
        linkServ.click();
        assertEquals(driver.getCurrentUrl(), HelpPage.geturl());
    }

    public void payFormTest() {
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
    }
}