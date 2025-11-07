import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class PetGetTest extends ConfigurationTest {
    @Test
    public void testPetById() {
        given().log().body()
                .contentType("application/json")
                .pathParam("petId", 1)
                .when().get("pet/{petId}")
                .then().log().body().statusCode(200)
                .body("id", notNullValue());
    }
}