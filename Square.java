public class Square extends Shape {

    public Square() {
    }

    public Square(double sideLength) {
        this.sideLength = sideLength;
        this.numberOfSides = 4;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = 4;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public double calculatePerimeter() {
        perimeter = numberOfSides * sideLength;
        return perimeter;
    }

    public double calculateArea() {
        double radians = Math.toRadians(180 / numberOfSides);
        area = (numberOfSides * sideLength * sideLength) / (4 * Math.sin(radians));
        return area;

    }
}