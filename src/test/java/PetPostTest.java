import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class PetPostTest extends ConfigurationTest {
    @Test
    public void testCreatePet() {
        Pet pet = new Pet();
        pet.setId(1);
        pet.setName("doggie");
        given().log().body()
                .contentType("application/json")
                .body(pet)
                .when().post("pet")
                .then().log().body().statusCode(200)
                .body("name", equalTo("doggie"));
    }
}
