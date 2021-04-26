import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 15) {
            System.out.println("i is " + i);
            i++;
        }

        int
        do {
            if (someCondition) {
                // executes if someCondition is true
            } else if (someOtherCondition) {
                // executes if someOtherCondition is true *and* all of the previous ifs in
                // this block were false
            }
            System.out.println("You will see this despite the condition!");
        } while (false);



    }
}


