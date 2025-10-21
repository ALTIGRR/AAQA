import org.testng.Assert;
import org.testng.annotations.Test;

public class STriangleTest {
    @Test(testName = "Площадь треугольника")
    public void testSTriangle() {
        Assert.assertEquals(STriangle.area(20, 15), 150);
    }

    @Test
    public void testOZero() {
        try {
            Assert.assertEquals(STriangle.area(0, 15), 0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testHZero() {
        try {
            Assert.assertEquals(STriangle.area(20, 0), 0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testOMinus() {
        try {
            Assert.assertEquals(STriangle.area(-20, 15), 0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testHMinus() {
        try {
            Assert.assertEquals(STriangle.area(20, -15), 0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}