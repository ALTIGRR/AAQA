import io.restassured.RestAssured;

public class ConfigurationTest {
    static {
        RestAssured.baseURI = "https://petstore.swagger.io/v2/";
    }
}
