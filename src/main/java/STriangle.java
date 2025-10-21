public class STriangle {

    public static int area(int o, int h) {
        int s;
        if (o == 0 || h == 0) {
            throw new IllegalArgumentException("Error: Параметры треугольника не могут быть нулевыми");
        } else if (o < 0 || h < 0) {
            throw new IllegalArgumentException("Error: Параметры не могут быть отрицательными");
        } else {
            s = (o * h / 2);
        }
        return s;
    }
}

