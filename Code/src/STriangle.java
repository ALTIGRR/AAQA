public class STriangle {
    private int o;
    private int h;

    public STriangle(int o, int h) {
        this.o = o;
        this.h = h;
    }

    public int area() {
        int s = 0;
        if (o == 0 || h == 0) {
            System.out.println("Параметры тругольника не могут быть нулевыми");
        } else if (o < 0 || h < 0) {
            System.out.println("Параметры не могут быть отрицательными");
        } else {
            s = (o * h / 2);
            System.out.println("Площадь треугольника = " + s + "см²");
        }
        return s;
    }
}
