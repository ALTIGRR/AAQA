public class sTriangle {
    private int o;
    private int h;

    public sTriangle(int o, int h) {
        this.o = o;
        this.h = h;
    }

    public int area() {
        int s = (o * h / 2);
        System.out.println("Площадь треугольника = " + s + "см²");
        return s;
    }
}

