package shapes;
import java.util.Scanner;

public class Circle {

    public static double getRadius() {
        System.out.print("Enter a circle radius: ");
        Scanner askRadius = new Scanner(System.in);
        double userInput = askRadius.nextDouble();
        return userInput;
    }
    public static double getTwiceRadius(double radius){
        double doubleRadius = radius * 2;
        return doubleRadius;
    }
    public static double getArea(double radius){
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
    public static double getCircumference(double radius){
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }

}
