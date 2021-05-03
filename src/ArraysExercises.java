import java.lang.reflect.Array;
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

        System.out.println();

        for (String person: people){

            System.out.println("person = " + person + " was a member of a comedy troop");
        }

        System.out.println();
        String troopComedian1 = "Abbott";
        System.out.println(Arrays.toString(addPerson(people, troopComedian1)));

    }

    static String[] addPerson(String[] people, String name) {
        String[] additionalPeople = Arrays.copyOf(people, (people.length + 1));
        additionalPeople[people.length + 1] = name ;

        return additionalPeople;
    }
}
