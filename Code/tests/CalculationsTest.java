import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Арифметика двух чисел")

public class CalculationsTest {
    @Test
    public void testCalcul() {
        Calculations res = new Calculations(7, 13);
        assertEquals(20, res.sum());
        System.out.println("Сумма вычисляется верно");
        assertEquals(-6, res.subtraction());
        System.out.println("Разница вычисляется верно");
        assertEquals(91, res.multiplication());
        System.out.println("Умножение производится верно");
        assertEquals(0.5384615659713745, res.division());
        System.out.println("Деление производится верно");
    }
}
