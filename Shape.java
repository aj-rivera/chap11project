public abstract class Shape {
    protected double area;
    protected double perimeter;
    protected String shapeType;
    protected double radius;
    protected double sideLength;
    protected int numberOfSides;

    /**
     * This implements the two interfaces into
     * each shape in Shape class.
     */
    public abstract double calculateArea();

    public abstract double calculatePerimeter();

}
