import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFactorial {
    @Test(testName = "Вычисление факториала")
    public void factorialTest() {
        Assert.assertEquals(Factorial.factorial(5), 120);
    }

    @Test
    public void borderZeroTest() {
        Assert.assertEquals(Factorial.factorial(0), 1);
    }

    @Test
    public void borderOneTest() {
        Assert.assertEquals(Factorial.factorial(1), 1);
    }

    @Test
    public void belowZeroTest() {
        try {
            Assert.assertEquals(Factorial.factorial(-1), 0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void maxValueTest() {
        Assert.assertEquals(Factorial.factorial(12), 479001600);
    }

    @Test
    public void moreIntTest() {
        try {
            Assert.assertEquals(Factorial.factorial(13), 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}