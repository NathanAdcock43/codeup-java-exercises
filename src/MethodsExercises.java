public class MethodsExercises {
        public static void main(String[] args) {
                addition(5, 5);
                subtraction(3, 2);
                multiplication(2, 2);
                division(4, 2);
                multiplicationLoop(4, 5);
                System.out.println(multiplicationRecursion(4, 5));
        }

        public static void addition(double add1, double add2) {
                double result = add1 + add2;
                System.out.println(result);
        }

        public static void subtraction(double sub1, double sub2) {
                double result = sub1 - sub2;
                System.out.println(result);
        }

        public static double multiplication(double mult1, double mult2) {
                double result = mult1 * mult2;
                return result;
        }

        public static int division(int div1, int div2) {
                return  div1 / div2;
        }

        public static double multiplicationLoop(double a, double b) {
                double i = 0;
                for (double i = 0; i < a; i++){
                        i += b;
                }
        }

        public static int multiplicationRecursion(int a, int b){
                        if ((a==0) || (b==0))
                                return 0;
                        else
                                return (a + multiplicationRecursion(a, b-1));
                }
}



