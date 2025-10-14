import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TestPostRawText {
    @Test
    public void whenPostText_thenStatus200() {
        String expectBody = "This is expected to be sent back as part of response body.";
        given().log().body()
                .contentType("text/plain")
                .body(expectBody)
                .when().post("https://postman-echo.com/post")
                .then().log().body().statusCode(200)
                .and()
                .body("data", equalTo(expectBody))
                .body("url", equalTo("https://postman-echo.com/post"))
                .body("headers.host", equalTo("postman-echo.com"));
    }
}
