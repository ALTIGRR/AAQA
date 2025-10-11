import org.testng.annotations.Test;
import org.testng.Assert;

public class TestFactorial {
    @Test(testName = "Вычисление факториала")
    public void factorialTest() {
        Factorial calculations = new Factorial();
        Assert.assertEquals(calculations.factorial(5), 120);
        System.out.println("Факториал определён верно");
    }
}