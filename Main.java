import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String parameterString;
        double parameterValue;

        System.out.print("Enter the radius of a circle: "); // asks user for parameter needed for formulas
        parameterString = input.next(); // takes input from user
        parameterValue = Double.parseDouble(parameterString); // converts input into a double type
        Circle circle1 = new Circle(parameterValue); // declares shape with parameter value from user
        System.out.println("Circumference: " + circle1.calculatePerimeter()); // prints out calculations
        System.out.println("Area: " + circle1.calculateArea());

        // repeats procedure for a triangle
        System.out.print("\nEnter the sidelength of a regular triangle: ");
        parameterString = input.next();
        parameterValue = Double.parseDouble(parameterString);
        Triangle triangle1 = new Triangle(parameterValue);
        System.out.println("Perimeter: " + triangle1.calculatePerimeter());
        System.out.println("Area: " + triangle1.calculateArea());

        // repeats procedure for a square
        System.out.print("\nEnter the sidelength of a regular square: ");
        parameterString = input.next();
        parameterValue = Double.parseDouble(parameterString);
        Square square1 = new Square(parameterValue);
        System.out.println("Perimeter: " + square1.calculatePerimeter());
        System.out.println("Area: " + square1.calculateArea());

        // repeats procedure for a pentagon
        System.out.print("\nEnter the sidelength of a regular pentagon: ");
        parameterString = input.next();
        parameterValue = Double.parseDouble(parameterString);
        Pentagon pentagon1 = new Pentagon(parameterValue);
        System.out.println("Perimeter: " + pentagon1.calculatePerimeter());
        System.out.println("Area: " + pentagon1.calculateArea());

        // repeats procedure for a hexagon
        System.out.print("\nEnter the sidelength of a regular hexagon: ");
        parameterString = input.next();
        parameterValue = Double.parseDouble(parameterString);
        Hexagon hexagon1 = new Hexagon(parameterValue);
        System.out.println("Perimeter: " + hexagon1.calculatePerimeter());
        System.out.println("Area: " + hexagon1.calculateArea());

    }
}