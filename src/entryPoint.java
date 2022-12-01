import Person.Lecturer;
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
        Lecturer testLecturer = new Lecturer(
                8,
                "Lecturer Name",
                "Lecturer Email",
                "Lecturer Department",
                "Lecturer Office Location",
                testSchedule
        );
        TA testTA = new TA(
                7,
                "TA Name",
                "TA Email",
                "TA Department",
                "TA Enrolled As",
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


        //Meaningless methods to prevent warnings
        testLecturer.setId(8);
        testTA.setEmail("adam@swag.ise");
        testStudent.setCourse("Student Course");
    }

}
