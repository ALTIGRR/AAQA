import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        boolean res = sumTenTwenty(15, 15);
        System.out.println("5: Результат: " + res);
        isPositive(3);
        isNegative(-5);
        repeatNum("Hello there", 3);
        isVisokos(1998);
        createMassive();
        longMassive();
        umnMassive();
        mnogoMerMassiv();
        int[] array = initialLen(3, 13);
    }

    public static void printThreeWords() {
        System.out.println("1: Orange");
        System.out.println("   Banana");
        System.out.println("   Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = -3;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("2: Сумма положительная");
        } else {
            System.out.println("2: Сумма отрицательная");
        }

    }

    public static void printColor() {
        int value = 300;
        if (value <= 0) {
            System.out.println("3: Красный");
        } else if (value <= 100) {
            System.out.println("3: Жёлтый");
        } else {
            System.out.println("3: Зелёный");
        }

    }

    public static void compareNumbers() {
        int a = 10;
        int b = 7;
        if (a >= b) {
            System.out.println("4: a >= b");
        } else {
            System.out.println("4: a < b");
        }

    }

    public static boolean sumTenTwenty(int a, int b) {
        int sum = a + b;
        boolean res = (sum >= 10 && sum <= 20);
        return res;
    }

    public static void isPositive(int num) {
        if (num >= 0) {
            System.out.println("6: Число положительное");
        } else {
            System.out.println("6: Число отрицательное");
        }
    }

    public static boolean isNegative(int num1) {
        boolean res = (num1 < 0);
        if (num1 < 0) {
            System.out.println("7: Результат: " + res);
        } else {
            System.out.println("7: Результат: " + res);
        }
        return res;
    }

    public static void repeatNum(String str, int x) {
        for (int value = 1; value <= x; value++) {
            System.out.println("8: " + str);
        }
    }

    public static boolean isVisokos(int year) {
        boolean res = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
        if (year % 400 == 0) {
            System.out.println("9: Результат: " + res);
            return true;
        } else if (year % 4 == 0) {
            System.out.println("9: Результат: " + res);
            return true;
        } else if (year % 100 != 0) {
            System.out.println("9: Результат: " + res);
            return false;
        }
        return res;
    }

    public static void createMassive() {
        int[] nums = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0) {
                nums[i] = 1;
            } else {
                nums[i] = 0;
            }
        }
        System.out.println("10: " + Arrays.toString(nums));
    }

    public static void longMassive() {
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        System.out.println("11: " + Arrays.toString(numbers));
    }

    public static void umnMassive() {
        int[] umn = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < umn.length; i++) {
            if (umn[i] < 6) {
                umn[i] *= 2;
            }
        }
        System.out.println("12: " + Arrays.toString(umn));
    }

    public static void mnogoMerMassiv() {
        int[][] diag = new int[5][5];
        for (int i = 0; i < 5; i++) {
            diag[i][i] = 1; // Заполнение основной ветки
            diag[i][5 - 1 - i] = 1; // Заполнение побочной ветки, 5 - 1 - это индекс последнего элемента в строке/столбце, - i - это смещение от конца к началу при увеличении i
        }
        System.out.println("13: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(diag[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] initialLen(int len, int initialValue) {
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = initialValue;
        }
        System.out.println("14: " + Arrays.toString(result));
        return result;
    }
}
