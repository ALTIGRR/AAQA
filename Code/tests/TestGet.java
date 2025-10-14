import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TestGet {
    @Test
    public void whenGet_thenStatus200() {
        given().log().body()
                .contentType("application/json")
                .when().get("https://postman-echo.com/get?foo1=bar1&foo2=bar2")
                .then().log().body().statusCode(200)
                .and()
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"))
                .body("url", equalTo("https://postman-echo.com/get?foo1=bar1&foo2=bar2"))
                .body("headers.host", equalTo("postman-echo.com"));// equalTo — это метод из библиотеки Hamcrest, который используется для проверки точного равенства значений. Он является частью набора matchers для написания выразительных проверок в тестах.
    }
}