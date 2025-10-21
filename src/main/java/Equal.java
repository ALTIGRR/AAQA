public class Equal {
    public static String equals(int x, int z) {
        if (x == z) {
            System.out.println("Числа равны");
            return "x == z";
        } else if (x > z) {
            System.out.println("Число " + x + " больше, чем " + z);
            return "x > z";
        } else {
            System.out.println("Число " + x + " меньше, чем " + z);
            return "x < z";
        }
    }
}
