import io.restassured.RestAssured;

public class HelpPage {
    public static String geturl() {
        return RestAssured.baseURI = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
    }
}
