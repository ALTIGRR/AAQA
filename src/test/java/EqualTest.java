import org.testng.Assert;
import org.testng.annotations.Test;

public class EqualTest {
    @Test(testName = "Сравнение чисел 1")
    public void testEq1() {
        Assert.assertEquals(Equal.equals(5, 5), "x == z");
    }

    @Test(testName = "Сравнение чисел 2")
    public void testEq2() {
        Assert.assertEquals(Equal.equals(10, 7), "x > z");
    }

    @Test(testName = "Сравнение чисел 3")
    public void testEq3() {
        Assert.assertEquals(Equal.equals(13, 21), "x < z");
    }
}