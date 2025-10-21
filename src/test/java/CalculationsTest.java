import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Арифметика двух чисел")

public class CalculationsTest {
    @Test
    public void testCalcul() {
        assertAll(
                () -> assertEquals(20, Calculations.sum(7, 13)),
                () -> assertEquals(-6, Calculations.subtraction(7, 13)),
                () -> assertEquals(91, Calculations.multiplication(7, 13)),
                () -> assertEquals(0.5384615659713745, Calculations.division(7, 13))
        );
    }

    @Test
    public void byZeroTest() {
        try {
            assertEquals(0, Calculations.division(7, 0));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
