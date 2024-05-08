public class Pentagon extends Shape implements PerimeterCalculable, AreaCalculable {

    /**
     * This is the default constructor for class
     */
    public Pentagon() {
    }

    /**
     * This is a constructor for a pentagon with a sidelength.
     * It also sets the number of sides.
     */
    public Pentagon(double sideLength) {
        this.sideLength = sideLength;
        this.numberOfSides = 5;
    }

    /**
     * setting and getting methods for sidelength
     */
    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    /**
     * setting and getting methods for number of sides
     */
    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = 5;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    /**
     * This method calculates perimeter
     */
    public double calculatePerimeter() {
        perimeter = numberOfSides * sideLength; // calculates perimeter
        return perimeter;
    }

    /**
     * This method calculates area using a generic formula
     * that should work with any equilateral shape with a sidelength
     * and number of sides.
     */
    public double calculateArea() {
        double radians = Math.toRadians(180 / numberOfSides); // converts degrees to radians
        area = (numberOfSides * sideLength * sideLength) / (4 * Math.tan(radians)); // general formula that works with
                                                                                    // any regular polygon
        return area;

    }
}