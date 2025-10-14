import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class TestPostFromData {
    @Test
    public void whenPostData_thenStatus200() {
        given().log().body()
                .contentType("application/x-www-form-urlencoded; charset=utf-8")
                .formParam("foo1", "bar1")//Метод .formParam() используется для отправки данных в формате x-www-form-urlencoded в HTTP-запросе. Это удобный способ передачи пар ключ-значение на сервер.
                .formParam("foo2", "bar2")
                .when().post("https://postman-echo.com/post")
                .then().log().body().statusCode(200)
                .and()
                .body("form", hasEntry("foo1", "bar1"))//hasEntry проверка наличия определённой пары ключ-значение
                .body("form", hasEntry("foo2", "bar2"))
                .body("url", containsString("https://postman-echo.com/post"))
                .body("headers.host", equalTo("postman-echo.com"));
    }
}
