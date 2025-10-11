import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Площадь треугольника")

public class sTriangleTest {
    @Test
    public void testSTriangle() {
        sTriangle area = new sTriangle(20, 15);
        assertEquals(150, area.area());
        System.out.println("Площадь треугольника вычисляется верно");
    }
}
