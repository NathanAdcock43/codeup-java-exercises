package grades;

import java.util.HashMap;
import java.util.Map;

public class GradesApplication {
    public static void main(String[] args){

        Student Salim = new Student("Salim");
        Student Manny = new Student("Manny");
        Student Shanshan = new Student("Shanshan");
        Student Jonathan = new Student("Jonathan");

        Map<String, Student> students = new HashMap<>();
        students.put("@ahmedabadi", Salim);
        students.put("@MStephen", Manny);
        students.put("@Su", Shanshan);
        students.put("@Sanchez", Jonathan);
        System.out.println("Student = " + students);
        System.out.println(Salim.toString());

    }


}
