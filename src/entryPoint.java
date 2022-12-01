import Person.Lecturer;
import Person.President;
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
        President testPresident = new President(
                1,
                "President Name",
                "President Email",
                "President Department",
                testSchedule);
        Lecturer testLecturer = new Lecturer(
                2,
                "Lecturer Name",
                "Lecturer Email",
                "Lecturer Department",
                "Lecturer Office Location",
                testSchedule
        );
        TA testTA = new TA(
                3,
                "TA Name",
                "TA Email",
                "TA Department",
                "TA Enrolled As",
                testSchedule);

        Student testStudent = new Student(
                4,
                "Student Name",
                "Student Email",
                "Student Department",
                testSchedule,
                "Student Course",
                testModules
        );

        //Meaningless methods to prevent warnings

        testPresident.setId(1);
        testLecturer.setId(2);
        testTA.setId(3);
        testStudent.setId(4);
    }

}
