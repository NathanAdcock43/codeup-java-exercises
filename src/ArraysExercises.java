import java.util.Arrays;

public class ArraysExercises {

//    public static void main(String[] args)
    public static void main (String[] arg){
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        String[] people = new String[3];

        people[0] = "Larry";
        people[1] = "Curly";
        people[2] = "Moe";

        System.out.println("Arrays.toString(people) = " + Arrays.toString(people));

        for (String person: people){

            System.out.println("person = " + person + " was a member of a comedy troop");
        }
//        System.out.println();
//        String[] newList = Arrays.copyOf(people, 3);

    }



}
