public class Calculations {

    public static int sum(int x, int z) {
        return x + z;
    }

    public static int subtraction(int x, int z) {
        return x - z;
    }

    public static int multiplication(int x, int z) {
        return x * z;
    }

    public static float division(int x, int z) {
        if (z == 0) {
            throw new IllegalArgumentException("Ошибка: деление на ноль");
        } else {
            return (float) x / (float) z;
        }
    }
}
