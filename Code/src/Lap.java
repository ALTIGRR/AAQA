public class Lap implements iFigure{
    private String colorBackground;
    private String colorBorder;
    private int r;
    float pi = 3.14f;

    public Lap(String colorBackground, String colorBorder, int r){
        this.colorBackground = colorBackground;
        this.colorBorder = colorBorder;
        this.r = r;
    }
    public void getInfoLap(){
        System.out.println("3.Круг:");
        System.out.println("Радиус = " + r + "см");
        System.out.println("Цвет фона: " + colorBackground + "; Цвет границ: " + colorBorder);
    }
    @Override
    public int per() {
        float p = 2f * r * pi;
        System.out.println("Периметр круга = " + p + "см");
        return (int)p;
    }
    @Override
    public int area() {
        float s = (float) Math.pow(r, 2) * pi;
        System.out.println("Площадь круга = " + s + "см²");
        return (int)s;
    }
}
