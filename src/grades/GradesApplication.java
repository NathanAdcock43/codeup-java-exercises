package grades;

import java.util.HashMap;
import java.util.Map;

public class GradesApplication {
    public static void main(String[] args){

        Map<String, Student> Student = new HashMap<>();
        Student.put("@ahmedabadi", Student.Salim);
        Student.put("@MStephen", Student.Manny);
        Student.put("@Su", Student.Shanshan);
        Student.put("@Sanchez", Student.Jonathan);
        System.out.println("Student = " + Student);

    }


}
