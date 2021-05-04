
import util.Input;

import java.util.Arrays;

public class ArraysExercises {

//    public static void main(String[] args)
    public static void main (String[] arg){
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];


        people[0].setName("Larry");
        people[1].setName("Curly");
        people[2].setName("Moe");


//        System.out.println("Arrays.toString(people) = " + Arrays.toString(people));
//
//        System.out.println();

//        for (String person: people){
//
//            System.out.println("person = " + person + " was a member of a comedy troop");
//        }
//
//        System.out.println();

//this string is being declared be pushed into the people array
//need to
        Person troopComedian1 = new Person ("Abbott");
        System.out.println(Arrays.toString(addPerson(people, troopComedian1)));

    }

    public static Person[] addPerson(Person[] people, Person person) {
        Person[] additionalPeople = Arrays.copyOf(people, people.length + 1);
        additionalPeople[people.length] = person;

        return additionalPeople;
    }



}
