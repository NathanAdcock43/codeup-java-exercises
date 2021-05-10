package util;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.reflect.Field;

public class Input {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

//        System.out.println(userInput.getString());
//        System.out.println(userInput.yesNo());
        System.out.println(getInt());
//        System.out.println(userInput.getDouble());
//        System.out.println(userInput.getString());
//        System.out.println(userInput.getString());
    }

    public Input(Double number){
        System.out.print("Enter an integer: ");
        int userInput = scanner.nextInt();
        this.userInput = number;
    }

//        System.out.print("Enter an integer: ");
//        int userInput = scanner.nextInt();
//   public String getString(){
//        if (typeof(this) == String){
//            return true;
//        }else {
//       return false;
//    }
//    }
//        System.out.print("Enter an integer: ");
//        int userInput = scanner.nextInt();
//    public boolean yesNo(){
//        if (this.equalsIgnoreCase("y") || this.equalsIgnoreCase("yes")){
//            return true;
//        }else {
//            return false;
//        }
//    }

    public static int getInt(int min, int max){
        System.out.print("Enter an integer: ");
        int userInput = scanner.nextInt();
        if (userInput.getType() == int){
            return true;
        }else {
            return false;
        }
    }
//        System.out.print("Enter an integer: ");
//        int userInput = scanner.nextInt();
//    public int getInt(){
//        if (typeof(this) == int){
//            return true;
//        }else {
//            return false;
//        }
//    }
//        System.out.print("Enter an integer: ");
//        int userInput = scanner.nextInt();
//    public double getDouble(double min, double max){
//        if (typeof(this) == double){
//            return true;
//        }else {
//            return false;
//        }
//    }
//        System.out.print("Enter an integer: ");
//        int userInput = scanner.nextInt();
//    public double getDouble(){
//        if (typeof(this) == double){
//            return true;
//        }else {
//            return false;
//        }
//    }

}
