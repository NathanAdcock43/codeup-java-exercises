import java.util.Scanner;

public class MethodsExercises {
        public static void main(String[] args) {
//                addition(5, 5);
//                subtraction(3, 2);
//                System.out.println(multiplication(2, 2));
//                division(4, 2);
//                System.out.println(multiplicationLoop(4, 5));
//                System.out.println(multiplicationRecursion(4, 5));
                factoralLoop();
        }

//        public static void addition(double add1, double add2) {
//                double result = add1 + add2;
//                System.out.println(result);
//        }
//
//        public static void subtraction(double sub1, double sub2) {
//                double result = sub1 - sub2;
//                System.out.println(result);
//        }
//
//        public static double multiplication(double mult1, double mult2) {
//                return mult1 * mult2;
//        }
//
//        public static void division(int div1, int div2) {
//                int result =  div1 / div2;
//                System.out.println(result);
//        }
//
//        public static double multiplicationLoop(double a, double b) {
//                double bucket = 0;
//                for (double i = 0; i < a; i++){
//                        bucket += b;
//                }
//                return bucket;
//        }
//
//        public static int multiplicationRecursion(int a, int b){
//                        if ((a==0) || (b==0))
//                                return 0;
//                        else
//                                return (a + multiplicationRecursion(a, b-1));
//                }

//        public static int getInteger(int min, int max);
//
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);

        public static void factoralLoop() {
                Scanner userFactoral = new Scanner(System.in);
                System.out.print("Enter a number between 1 and 10: ");
                int userInput1 = userFactoral.nextInt();
                System.out.println("You entered " + userInput1);

                if(userInput1 <= 10 && userInput1 >= 1) {
                        long factoral = 1;
                        int i = 1;
                        while (i <= userInput1){
                                factoral = factoral * i;
                                i++;
                        }
                        System.out.println("Factorial of " + userInput1 + " is: " + factoral);
                }else{
                      factoralLoop();
                }
        }
}



