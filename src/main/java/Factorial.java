public class Factorial {
    public static int factorial(int num) {
        int res = 1;
        if (num < 0) {
            throw new IllegalArgumentException("Ошибка: факториал определён только для целых неотрицательных чисел.");
        } else if (num <= 0 || num == 1) {
            return 1;
        } else if (num >= 13) {
            throw new ArithmeticException("Ошибка: произошло переполнение int");
        } else {
            for (int i = 1; i <= num; i++) {
                res *= i;
            }
        }
        return res;
    }
}
