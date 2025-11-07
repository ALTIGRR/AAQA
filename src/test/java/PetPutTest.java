import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PetPutTest extends ConfigurationTest {
    @Test
    public void testUpdatePet() {
        Pet newPet = new Pet();
        newPet.setId(1);
        newPet.setName("doggiezzz");
        given().log().body()
                .contentType("application/json")
                .body(newPet)
                .when().put("pet")
                .then().log().body().statusCode(200)
                .body("name", equalTo("doggiezzz"));
    }
}
