public class Circle extends Shape implements PerimeterCalculable, AreaCalculable {
    /**
     * This is the default constructor for class
     */
    public Circle() {
        this.numberOfSides = 0;
    }

    /**
     * This is a constructor for a circle with a radius
     */
    public Circle(double radius) {
        this.radius = radius;
        this.numberOfSides = 0;
    }

    /**
     * setting and getting methods for radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    /**
     * getting method for number of sides
     */
    public int getNumberOfSides() {
        return numberOfSides;
    }

    /**
     * This method calculates area of a circle
     */
    public double calculateArea() {
        area = Math.PI * radius * radius;
        return area;
    }

    /**
     * This method calculates circumference ("perimeter")
     * of the circle
     */
    public double calculatePerimeter() {
        perimeter = 2 * Math.PI * radius; // calculates circumference
        return perimeter;
    }

}
