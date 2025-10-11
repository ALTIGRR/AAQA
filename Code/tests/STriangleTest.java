import org.testng.annotations.Test;
import org.testng.Assert;

public class STriangleTest {
    @Test(testName = "Площадь треугольника")
    public void testSTriangle() {
        STriangle area = new STriangle(20, 15);
        Assert.assertEquals(area.area(), 150);
        System.out.println("Площадь треугольника вычисляется верно");
    }
}