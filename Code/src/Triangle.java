public class Triangle implements iFigure{
    private String colorBackground;
    private String colorBorder;
    private int a;
    private int b;
    private int c;
    private int o;
    private int h;

    public Triangle(String colorBackground, String colorBorder, int a, int b, int c, int o, int h){
        this.colorBackground = colorBackground;
        this.colorBorder = colorBorder;
        this.a = a;
        this.b = b;
        this.c = c;
        this.o = o;
        this.h = h;
    }
    public void getInfoTri(){
        System.out.println("2.Треугольник:");
        System.out.println("1 сторона = " + a + "см");
        System.out.println("2 сторона = " + b + "см");
        System.out.println("3 сторона = " + c + "см");
        System.out.println("Основание = " + o + "см");
        System.out.println("Высота = " + h + "см");
        System.out.println("Цвет фона: " + colorBackground + "; Цвет границ: " + colorBorder);
    }
    @Override
    public int per() {
        int p = a + b + c;
        System.out.println("Периметр треугольника = " + p + "см");
        return p;
    }
    @Override
    public int area() {
        int s = (o * h / 2);
        System.out.println("Площадь треугольника = " + s + "см²");
        return s;
    }
}
