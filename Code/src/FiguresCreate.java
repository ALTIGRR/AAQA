public class FiguresCreate {
    public static void main(String[] args) {
        System.out.println("Геометрические фигуры:");
        System.out.println("1.Прямоугольник:");
        Figures rectangle = new Figures("Blue", "Grey");
        rectangle.perRectangle(5, 10);
        rectangle.areaRectangle(5, 10);
        rectangle.figureColor();
        System.out.println("2.Треугольник:");
        Figures triangle = new Figures("Green", "White");
        triangle.perTriangle(10, 10, 15);
        triangle.areaTriangle(15, 10);
        triangle.figureColor();
        System.out.println("3.Круг:");
        Figures lap = new Figures("Red", "Dark Steel");
        lap.perLap(5);
        lap.arealap(5);
        lap.figureColor();
    }
}
