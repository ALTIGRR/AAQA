import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Площадь треугольника")

public class STriangleTest {
    @Test
    public void testSTriangle() {
        assertEquals(150, STriangle.area(20, 15));
    }

    @Test
    public void testOZero() {
        try {
            assertEquals(0, STriangle.area(0, 15));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testHZero() {
        try {
            assertEquals(0, STriangle.area(20, 0));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testOMinus() {
        try {
            assertEquals(0, STriangle.area(-20, 15));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testHMinus() {
        try {
            assertEquals(0, STriangle.area(20, -15));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
