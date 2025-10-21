import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TestDelete extends ConfigurationTest {
    @Test
    public void whenDelete_thenStatus200() {
        String expectBody = "This is expected to be sent back as part of response body.";
        given().log().body()
                .contentType("text/plain")
                .body(expectBody)
                .when().delete("delete")
                .then().log().body().statusCode(200)
                .and()
                .body("data", equalTo(expectBody))
                .body("url", equalTo("https://postman-echo.com/delete"))
                .body("headers.host", equalTo("postman-echo.com"));
    }
}
