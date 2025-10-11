import org.testng.annotations.Test;
import org.testng.Assert;

public class CalculationsTest {
    @Test(testName = "Арифметика двух чисел")
    public void testCalcul() {
        Calculations res = new Calculations(7, 13);
        Assert.assertEquals(res.sum(), 20);
        System.out.println("Сумма вычисляется верно");
        Assert.assertEquals(res.subtraction(), -6);
        System.out.println("Разница вычисляется верно");
        Assert.assertEquals(res.multiplication(), 91);
        System.out.println("Умножение производится верно");
        Assert.assertEquals(res.division(), 0.5384615659713745);
        System.out.println("Деление производится верно");
    }
}
