import org.testng.annotations.Test;
import org.testng.Assert;

public class EqualTest {
    @Test(testName = "Сравнение чисел 1")
    public void testEq1() {
        Equal y = new Equal();
        Assert.assertEquals(y.equals(5, 5), "x == z");
    }

    @Test(testName = "Сравнение чисел 2")
    public void testEq2() {
        Equal y = new Equal();
        Assert.assertEquals(y.equals(10, 7), "x > z");
    }

    @Test(testName = "Сравнение чисел 3")
    public void testEq3() {
        Equal y = new Equal();
        Assert.assertEquals(y.equals(13, 21), "x < z");
    }
}