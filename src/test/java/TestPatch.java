import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TestPatch extends ConfigurationTest {
    @Test
    public void whenPatch_thenStatus200() {
        String expectBody = "This is expected to be sent back as part of response body.";
        given().log().body()
                .contentType("text/plain")
                .body(expectBody)
                .when().patch("patch")
                .then().log().body().statusCode(200)
                .and()
                .body("data", equalTo(expectBody))
                .body("url", equalTo("https://postman-echo.com/patch"))
                .body("headers.host", equalTo("postman-echo.com"));
    }
}
