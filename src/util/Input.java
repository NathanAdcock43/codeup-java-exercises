package util;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.reflect.Field;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        System.out.println(userInput.getString());
//        System.out.println(userInput.yesNo());
            Input in = new Input();
            System.out.println("Input.getInt(1, 10) = " + in.getInt(1, 10));
//        System.out.println(userInput.getDouble());
//        System.out.println(userInput.getString());
//        System.out.println(userInput.getString());
    }





   public String getString(){
       System.out.print("Enter an integer: ");
       String userInput = scanner.next();
        return this.scanner.nextLine();
    }

//        System.out.print("Enter an integer: ");
//        int userInput = scanner.nextInt();
//    public boolean yesNo(){
//        if (this.equalsIgnoreCase("y") || this.equalsIgnoreCase("yes")){
//            return true;
//        }else {
//            return false;
//        }
//    }
//Integer.valueOf(this)

    public int getInt(int min, int max){
        try {
            System.out.print("Enter an integer: ");
            int userInput = Integer.valueOf(this.getString());
            if (userInput < max && userInput > min) {
                return userInput;
            } else {
                return getInt(min, max);
            }
        }catch(Exception e){
            System.out.println("Try Again");
            return getInt(min, max);
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

    public double getDouble(double min, double max){
        System.out.print("Enter a Double: ");
        int userInput = scanner.nextInt();
        if (userInput < max && userInput > min){
            return userInput;
        }else {
            return getDouble(min, max);
        }
    }
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
