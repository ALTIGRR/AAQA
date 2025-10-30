public interface iFigure {
    int per();
    int area();
    default void rectangleInfo(Rectangle rectangle) {
        rectangle.getInfo();
    }
    default void TriangleInfo(Triangle triangle) {
        triangle.getInfoTri();
    }
    default void lapInfo(Lap lap) {
        lap.getInfoLap();
    }
}
