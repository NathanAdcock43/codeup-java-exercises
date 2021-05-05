package shapes;

public class CircleApp {
    public static void main(String[] args){
        double radius = Circle.getRadius();
        System.out.println("getTwiceRadius() = " + Circle.getTwiceRadius(radius));
        System.out.println("getArea() = " + Circle.getArea(radius));
        System.out.println("getCircumference() = " + Circle.getCircumference(radius));
    }

}

