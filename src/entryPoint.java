import Person.Student;
import Person.TA;

public class entryPoint {
    public static void main(String[] args) {
        new LoginGUI(); // Currently prints inputs to console

        String[] testSchedule = {
                "10:00", "17:00",
                "11:00", "17:00",
                "11:00", "17:00",
                "11:00", "17:00",
                "11:00", "17:00",
                "11:00", "15:00",
                "11:00", "17:00"};
        String[] testModules = {
                "Module 1",
                "Module 2"
        };
        TA adam = new TA(
                7,
                "Java Adam",
                "adam@swag.ise",
                "Here",
                "Masters Person.Student",
                testSchedule);

        Student testStudent = new Student(
                1,
                "Student Name",
                "Student Email",
                "Student Department",
                testSchedule,
                "Student Course",
                testModules
        );


        adam.setEmail("adam@swag.ise");
        testStudent.setCourse("Student Course");
    }

}
