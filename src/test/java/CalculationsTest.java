import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CalculationsTest {
    @Test
    public void testCalcul() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(Calculations.sum(7, 13), 20);
        softAssert.assertEquals(Calculations.subtraction(7, 13), -6);
        softAssert.assertEquals(Calculations.multiplication(7, 13), 91);
        softAssert.assertEquals(Calculations.division(7, 13), 0.5384615659713745);
    }

    @Test
    public void byZeroTest() {
        try {
            Assert.assertEquals(Calculations.division(7, 0), 0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
