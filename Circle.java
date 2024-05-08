public class Circle extends Shape implements PerimeterCalculable, AreaCalculable {
    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
        this.numberOfSides = 0;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = 0;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public double calculateArea() {
        area = Math.PI * radius * radius;
        return area;
    }

    public double calculatePerimeter() {
        perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

}
