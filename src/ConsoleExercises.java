import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.\n", pi );


//        Scanner userPromt = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int userInput = userPromt.nextInt();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");

        Scanner userString1 = new Scanner(System.in);
        System.out.print("Enter three words: ");
        String userInput1 = userString1.nextLine();

        Scanner userString2 = new Scanner(System.in);
        System.out.print("Enter three words: ");
        String userInput2 = userString2.nextLine();

        Scanner userString3 = new Scanner(System.in);
        System.out.print("Enter three words: ");
        String userInput3 = userString3.nextLine();

        System.out.println("You entered: --> \"" + userInput1 + userInput2 + userInput3 + "\" <--");
    }
}
