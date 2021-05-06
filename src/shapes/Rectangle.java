package shapes;

public class Rectangle extends Quadrilateral {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        double perimeter = (length * 2) + (width * 2);
        return perimeter;
    }

    @Override
    public double getArea() {
        double area = length * width;
        return area;
    }
}

    //    private double length;
//    private double width;
//    public Rectangle(double length, double width){
//        this.length = length;
//        this.width = width;
//    }
//    public double getArea(){
//        double area = length * width;
//        System.out.println("Area: " + area);
//        return area;
//    }
//    public double getPerimeter(){
//        double perimeter = (length * 2) + (width * 2);
//        System.out.println("Perimeter: " + perimeter);
//        return perimeter;
//    }
//    public String getMeasurements(){
//        String measurements = "  (length:" + this.length + ", width:" + this.width + ")\n";
//        System.out.print(measurements);
//        return measurements;
//    }

