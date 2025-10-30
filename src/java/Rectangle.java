public class Rectangle implements iFigure{
    private String colorBackground;
    private String colorBorder;
    private int a;
    private int b;

    public Rectangle(String colorBackground, String colorBorder, int a, int b){
        this.colorBackground = colorBackground;
        this.colorBorder = colorBorder;
        this.a = a;
        this.b = b;
    }
    public void getInfo() {
        System.out.println("1.Прямоугольник:");
        System.out.println("1 сторона = " + a + "см");
        System.out.println("2 сторона = " + b + "см");
        System.out.println("Цвет фона: " + colorBackground + "; Цвет границ: " + colorBorder);
    }
    @Override
    public int per() {
        int p = 2 * (a + b);
        System.out.println("Периметр прямоугольника = " + p + "см");
        return p;
    }

    @Override
    public int area() {
        int s = a * b;
        System.out.println("Площадь прямоугольника = " + s + "см²");
        return s;
    }
}
