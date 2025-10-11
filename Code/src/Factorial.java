public class Factorial {
    public int factorial(int num) {
        int res = 1;
        if (num < 0) {
            System.out.println("Факториал определён только для целых неотрицательных чисел.");
        } else if (num == 0 || num == 1) {
            return 1;
        } else {
            for (int i = 1; i <= num; i++) {
                res *= i;
            }
        }
        return res;
    }
}
