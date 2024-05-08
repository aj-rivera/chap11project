public abstract class Shape {
    protected double area;
    protected double perimeter;
    protected String shapeType;
    protected double radius;
    protected double sideLength;
    protected int numberOfSides;

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

}
