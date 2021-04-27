import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//        }

//        int y = 0;
//        do {
//            y++;
//            if (y%2 == 0) {
//                System.out.println("y is equal to:");
//                System.out.println(y);
//            }
//
//        } while (y <= 100);
//
//
//    }
//        for (y =0; y<=)

//    int y = 100;
//        do {
//        y-=5;
//            System.out.println("y is equal to:");
//            System.out.println(y);
//    } while (y > -10);
//    }

//        long y = 2;
//
//        do {
//        y*=y;
//            System.out.print("y is equal to: ");
//            System.out.println(y);
//    } while (y < 65535);

//        long y;
//        for (y= 2; y < 1000000; y*=y){
//            System.out.print("y is equal to: ");
//            System.out.println(y);
//        }
//
//        long y = 1;
//        do {
//            y++;
//            if (y%5 == 0 && y%3 == 0) {
//                System.out.println("FizzBuzz");
//            }else if (y%3 == 0) {
//                System.out.println("Fizz");
//            }else if (y%5 == 0) {
//                System.out.println("Buzz");
//            }}while (y < 99);
//


//        Scanner userInt = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//        int userInput = userInt.nextInt();
//
//        System.out.println("Number    Squared    Cubed");
//        System.out.println("______    _______    ______");
//        for (long y = 1; y<= userInput; y++) {
//            long y2 = y*y;
//            long y3 = y*y*y;
//
//            System.out.printf("%-10d |%-10d |%-10d\n", y, y2 ,y3);


//
//        System.out.println("Number    Squared    Cubed");
//        System.out.println("______    _______    ______");
//        for (long y = 1; y<= userInput; y++) {
//            long y2 = y*y;
//            long y3 = y*y*y;
//
//            System.out.printf("%-10d |%-10d |%-10d\n", y, y2 ,y3);


//        switch (userInput) {
//            case userInput >= 88 && userInput <= 100:
//                    System.out.print("Hey! you got an: A");
//                    break;
//            case userInput >= 80 && userInput <= 87:
//                    System.out.print("Hey! you got an: B");
//                    break;
//            case userInput >= 67 && userInput <= 79:
//                     System.out.print("Hey! you got an: C");
//                     break;
//            case userInput >= 60 && userInput <= 66:
//                    System.out.print("Hey! you got an: D");
//                    break;
//            case userInput >= 0 && userInput <= 59:
//                    System.out.print("Hey! you got an: F");
//                    break;
//            default:
//                    System.out.println("Invalid grade entered.");
//                    break;
//    }




        Do{
            System.out.print("Enter your grade: ");
            int grade = userInt.nextInt();



        if (grade >= 88 && grade <= 100)
            System.out.print("Hey! you got an: A");
        else if (grade >= 80 && grade <= 87)
            System.out.print("Hey! you got an: B");
        else if (grade >= 67 && grade <= 79)
            System.out.print("You got an: C");
        else if (grade >= 60 && grade <= 66)
            System.out.print("Sorry, You got an: D");
        else if (grade >= 0 && grade <= 59)
            System.out.print("Sorry, You got an: F");
        else
            System.out.println("Invalid grade entered.");
         }
         while (false);

         if(userInput.equalsIgnoreCase("yes")){
             willcontinue = true;
         } else {
             System.out.println("See you later");
             willcontinue = false;
         }


        //        do{
//            if(userInput.equalsIgnoreCase("yes")) {
//
//            } else{
//
//            }
//        }

}



}







