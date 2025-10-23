import io.restassured.RestAssured;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayOptions {
    public WebDriver driver;
    @FindBy
            (xpath = "//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]")
    private WebElement options;
    @FindBy
            (xpath = "//*[@id=\"pay\"]/option[1]")
    private WebElement connect;
    @FindBy
            (xpath = "//*[@id=\"pay\"]/option[2]")
    private WebElement internet;
    @FindBy
            (xpath = "//*[@id=\"pay\"]/option[3]")
    private WebElement instalment;
    @FindBy
            (xpath = "//*[@id=\"pay\"]/option[4]")
    private WebElement arrears;
    @FindBy
            (xpath = "//input[contains(@placeholder, 'Номер телефона')]")
    private WebElement connectPhone;
    @FindBy
            (xpath = "//input[contains(@placeholder, 'Сумма')]")
    private WebElement sum;
    @FindBy
            (xpath = "//input[contains(@placeholder, 'E-mail для отправки чека')]")
    private WebElement email;
    @FindBy
            (xpath = "//input[contains(@placeholder, 'Номер абонента')]")
    private WebElement intPhone;
    @FindBy
            (xpath = "//input[contains(@placeholder, 'Номер счета на 44')]")
    private WebElement mentNumber;
    @FindBy
            (xpath = "//input[contains(@placeholder, 'Номер счета на 2073')]")
    private WebElement arNumber;
    @FindBy
            (xpath = "/html/body/div[6]/main/div/div[2]/div/div[2]/button[2]")
    private WebElement cookieBut;

    public PayOptions(WebDriver driver) {
        PageFactory.initElements(driver, this); // PageFactory — это механизм в Selenium WebDriver, который упрощает работу с Page Object Model (POM) путем автоматической инициализации веб-элементов на странице.Метод initElementsPageFactory.initElements(driver, this) — это статический метод, который:Автоматически инициализирует все веб-элементы, помеченные аннотацией @FindByСвязывает WebDriver с элементами страницы,Предотвращает появление NullPointerException при работе с элементами;Как работает initElement Метод принимает два параметра:driver — экземпляр WebDriver,this — текущий объект страницы,При выполнении метода происходит:Поиск всех полей типа WebElement в классе,Автоматическая инициализация этих элементов,Связывание их с указанным драйвером
        this.driver = driver;
    }

    ;

    public static String geturl() {
        return RestAssured.baseURI = "https://www.mts.by/";
    }

    public void connectOptionTest() {
        driver.get(geturl());
        cookieBut.click();
        options.isDisplayed();
        options.isEnabled();
        connect.isDisplayed();
        connectPhone.isDisplayed();
        sum.isDisplayed();
        email.isDisplayed();
    }

    public void internetOptionTest() {
        driver.get(geturl());
        cookieBut.click();
        options.isDisplayed();
        options.isEnabled();
        options.click();
        internet.click();
        internet.isDisplayed();
        intPhone.isDisplayed();
        sum.isDisplayed();
        email.isDisplayed();
    }

    public void mentOptionTest() {
        driver.get(geturl());
        cookieBut.click();
        options.isDisplayed();
        options.isEnabled();
        options.click();
        instalment.click();
        instalment.isDisplayed();
        mentNumber.isDisplayed();
        sum.isDisplayed();
        email.isDisplayed();
    }

    public void arOptionTest() {
        driver.get(geturl());
        cookieBut.click();
        options.isDisplayed();
        options.isEnabled();
        options.click();
        arrears.click();
        arrears.isDisplayed();
        arNumber.isDisplayed();
        sum.isDisplayed();
        email.isDisplayed();
    }
}