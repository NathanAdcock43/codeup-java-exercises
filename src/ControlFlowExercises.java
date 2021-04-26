import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 15) {
            System.out.println("i is " + i);
            i++;
        }

        int y = 0;
        do {
            y++;
            if (y%2 == 0) {
                System.out.println("y is equal to:");
                System.out.println(y);
            }

        } while (y <= 100);


    }
}



