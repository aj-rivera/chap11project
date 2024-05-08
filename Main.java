import java.util.*;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String parameteString;
        double parameterValue;

        System.out.print("Enter the radius of a circle: ");
        parameterString = input.next();
        parameterValue = Double.parseDouble(parameterString);
        Circle circle1 = new Circle(parameterValue);
        System.out.println("Circumference: " + circle1.calculatePerimeter());
        System.out.println("Area: " + circle1.calculateArea());

        System.out.print("Enter the sidelength of a regular triangle: ");
        parameterString = input.next();
        parameterValue = Double.parseDouble(parameterString);
        Triangle triangle1 = new Triangle(parameterValue);
        System.out.println("Perimeter: " + triangle1.calculatePerimeter());
        System.out.println("Area: " + triangle1.calculateArea());

    }
}