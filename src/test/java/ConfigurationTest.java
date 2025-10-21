import io.restassured.RestAssured;

public class ConfigurationTest {
    static {
        RestAssured.baseURI = "https://postman-echo.com";
    }
}
