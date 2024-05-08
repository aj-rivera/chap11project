import java.util.*;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter radius:");
        String radiusString = input.nextLine();
        double radius = Double.parseDouble(radiusString);

        Circle circle1 = new Circle(radius);
        System.out.println("Circumference: " + circle1.calculatePerimeter());
        System.out.println("Area: " + circle1.calculateArea());

    }
}