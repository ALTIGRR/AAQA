import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Вычисление факториала")

public class TestFactorial {
    @Test
    public void factorialTest() {
        assertEquals(120, Factorial.factorial(5));
    }

    @Test
    public void borderZeroTest() {
        assertEquals(1, Factorial.factorial(0));
    }

    @Test
    public void borderOneTest() {
        assertEquals(1, Factorial.factorial(1));
    }

    @Test
    public void belowZeroTest() {
        try {
            assertEquals(0, Factorial.factorial(-1));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void maxValueTest() {
        assertEquals(479001600, Factorial.factorial(12));
    }

    @Test
    public void moreIntTest() {
        try {
            assertEquals(0, Factorial.factorial(13));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
