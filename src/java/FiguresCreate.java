public class FiguresCreate {
    public static void main(String[] args) {
        System.out.println("Геометрические фигуры:");
        Rectangle rectangle = new Rectangle("BLue", "Grey", 5,10);
        rectangle.rectangleInfo(rectangle);
        rectangle.per();
        rectangle.area();
        Triangle triangle = new Triangle("Green", "Blue", 10,10,20,20,15);
        triangle.TriangleInfo(triangle);
        triangle.per();
        triangle.area();
        Lap lap = new Lap("Red", "Black", 5);
        lap.lapInfo(lap);
        lap.per();
        lap.area();
    }
}
