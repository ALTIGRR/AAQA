import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Вычисление факториала")

public class TestFactorial {
    @Test
    public void factorialTest() {
        Factorial calculations = new Factorial();
        assertEquals(120, calculations.factorial(5));
        System.out.println("Факториал определён верно");
    }
}
