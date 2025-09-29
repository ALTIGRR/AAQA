public class Figures implements iFigure {
    private String colorBackground, colorBorder;

    public Figures(String colorBackground, String colorBorder) {
        this.colorBackground = colorBackground;
        this.colorBorder = colorBorder;
    }

    @Override
    public int perRectangle(int a, int b) {
        return iFigure.super.perRectangle(a, b);
    }

    @Override
    public int areaRectangle(int a, int b) {
        return iFigure.super.areaRectangle(a, b);
    }

    @Override
    public int perTriangle(int a, int b, int c) {
        return iFigure.super.perTriangle(a, b, c);
    }

    @Override
    public int areaTriangle(int o, int h) {
        return iFigure.super.areaTriangle(o, h);
    }

    @Override
    public float perLap(float r) {
        return iFigure.super.perLap(r);
    }

    @Override
    public float arealap(float r) {
        return iFigure.super.arealap(r);
    }

    public void figureColor() {
        System.out.println("Цвет фона: " + colorBackground + "; Цвет границ: " + colorBorder);
    }
}
