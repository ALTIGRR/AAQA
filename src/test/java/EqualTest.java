import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Сравнение чисел")

public class EqualTest {
    @Test
    public void testEq1() {
        assertEquals("x == z", Equal.equals(5, 5));
    }

    @Test
    public void testEq2() {
        assertEquals("x > z", Equal.equals(10, 7));
    }

    @Test
    public void testEq3() {
        assertEquals("x < z", Equal.equals(13, 21));
    }
}
