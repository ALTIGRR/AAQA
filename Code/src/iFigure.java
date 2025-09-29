public interface iFigure {
    float pi = 3.14f;

    default int perRectangle(int a, int b) {
        int per = 0;
        int p = per;
        p = 2 * (a + b);
        System.out.println("Периметр прямоугольника = " + p + "см");
        return p;
    }

    default int areaRectangle(int a, int b) {
        int area = 0;
        int s = area;
        s = a * b;
        System.out.println("Площадь прямоугольника = " + s + "см²");
        return s;
    }

    default int perTriangle(int a, int b, int c) {
        int per = 0;
        int p = per;
        p = a + b + c;
        System.out.println("Периметр треугольника = " + p + "см");
        return p;
    }

    default int areaTriangle(int o, int h) {
        int area = 0;
        int s = area;
        s = (o * h) / 2;
        System.out.println("Площадь треугольника = " + s + "см²");
        return s;
    }

    default float perLap(float r) {
        float per = 0;
        float p = per;
        p = 2f * r * pi;
        System.out.println("Периметр круга = " + p + "см");
        return p;
    }

    default float arealap(float r) {
        float area = 0;
        float s = area;
        s = (float) Math.pow(r, 2) * pi;
        System.out.println("Площадь круга = " + s + "см²");
        return s;
    }

}
