import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Сравнение чисел")

public class EqualTest {
    @Test
    public void testEq1() {
        Equal y = new Equal();
        assertEquals("x == z", y.equals(5, 5));
    }

    @Test
    public void testEq2() {
        Equal y = new Equal();
        assertEquals("x > z", y.equals(10, 7));
    }

    @Test
    public void testEq3() {
        Equal y = new Equal();
        assertEquals("x < z", y.equals(13, 21));
    }
}
