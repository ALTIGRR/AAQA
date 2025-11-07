import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PetDeleteTest extends ConfigurationTest {
    @Test
    public void testDeletePet() {
        given().log().body()
                .contentType("application/json")
                .pathParam("petId", 1)
                .when().delete("pet/{petId}")
                .then().log().body().statusCode(200);
    }
}
