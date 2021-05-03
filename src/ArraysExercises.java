import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysExercises {

//    public static void main(String[] args)
    public static void main (String[] arg){
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];

//        TODO need to create a Person constructor on the last exercise to get this to work

        people[0] = "Larry";
        people[1] = "Curly";
        people[2] = "Moe";

        System.out.println("Arrays.toString(people) = " + Arrays.toString(people));

        System.out.println();

        for (String person: people){

            System.out.println("person = " + person + " was a member of a comedy troop");
        }

        System.out.println();

//this string is being declared be pushed into the people array

        Person troopComedian1 = new Person ("Abbott");
        System.out.println(Arrays.toString(addPerson(people, troopComedian1)));

    }

    static Person[] addPerson(Person[] people, Person.name) {
        System.out.println(people.length);
        String[] additionalPeople = Arrays.copyOf(people, people.length + 1);
        System.out.println(people.length);
        additionalPeople[people.length] = name;

        return additionalPeople;
    }
}
