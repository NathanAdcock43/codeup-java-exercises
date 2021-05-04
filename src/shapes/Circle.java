package shapes;

public class Circle {
    public static void main(String[] args) {


        System.out.println("getTwiceRadius() = " + getTwiceRadius());
        System.out.println("getArea() = " + getArea());
        System.out.println("getCircumference() = " + getCircumference());

    }

    private static double radius = 3;

    public static double getTwiceRadius(){
        double doubleRadius = radius * 2;
        return doubleRadius;
    }
    public static double getArea(){
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
    public static double getCircumference(){
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }
}
