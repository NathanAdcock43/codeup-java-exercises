package grades;

import com.sun.jdi.Value;

import java.lang.reflect.Array;
import java.util.*;


//Create a Student class
//
//Create a class named Student. It should have private properties for the student's name, and grades. The grades property should be an ArrayList of integers. The student class should have a constructor that sets name property, and initializes the grades property as an empty ArrayList. The Student class should have the following methods:



public class Student {


    public static void main(String[] args){
//        instantiate three students add grades for each student; place students into hashmap
        Student Rob = new Student("Rob");


        Rob.addGrade(95);
        Rob.addGrade(65);
        Rob.addGrade(82);
        System.out.println("Rob = " + Rob);
        System.out.println("Rob.grades = " + Rob.grades);
        System.out.println("Rob.getGradeAverage() = " + Rob.getGradeAverage());


    }


    private String name;

    private ArrayList<Integer> grades;

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }


//    // returns the student's name
//    public String getName();
//    // adds the given grade to the grades property
//    public void addGrade(int grade);
//    // returns the average of the students grades
//    public double getGradeAverage();

    public String getName() {
        return name;
    }
    public ArrayList<Integer> getGrade() {
        return grades;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    int bucket;
    public int getGradeAverage() {

        for (int i = 0 ; i < grades.size(); i++){
                bucket = bucket + grades.get(i);
        }
        return bucket / grades.size();
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                ", bucket=" + bucket +
                '}';
    }
}
