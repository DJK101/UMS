import Person.*;

public class PremadeUsers {
    private final String[] testSchedule = {
            "10:00", "17:00",
            "11:00", "17:00",
            "11:00", "17:00",
            "11:00", "17:00",
            "11:00", "17:00",
            "11:00", "15:00",
            "11:00", "17:00"};

    private final String[] testModules = {
            "Module 1",
            "Module 2"};

    private final President testPresident = new President(
            1,
            "President Name",
            "President Email",
            "President Department",
            testSchedule);

    private final Lecturer testLecturer = new Lecturer(
            2,
            "Lecturer Name",
            "Lecturer Email",
            "Lecturer Department",
            "Lecturer Office Location",
            testSchedule);

    private final TA testTA = new TA(
            3,
            "TA Name",
            "TA Email",
            "TA Department",
            "TA Enrolled As",
            testSchedule);

    private final Student testStudent = new Student(
            4,
            "Student Name",
            "Student Email",
            "Student Department",
            testSchedule,
            "Student Course",
            testModules);

    private final Person[] people = {testPresident, testLecturer, testTA, testStudent};

    public Person getUser(int id) {
        for (Person i : people) {
            if (i.getId() == id) {
                return i;
            }
        }
        return testLecturer;
    }
}
