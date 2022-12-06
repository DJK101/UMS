import Person.*;

public class PremadeUsers {
    private static final String[] testSchedule = {
            "10:00", "17:00",
            "11:00", "17:00",
            "11:00", "17:00",
            "11:00", "17:00",
            "11:00", "17:00",
            "11:00", "15:00",
            "11:00", "17:00"};

    private static final String[] testModules = {
            "Module 1",
            "Module 2"};

    private static final President testPresident = new President(
            "1",
            "pwd",
            "President Name",
            "President Email",
            "President Department",
            testSchedule);

    private static final Lecturer testLecturer = new Lecturer(
            "2",
            "pwd",
            "Lecturer Name",
            "Lecturer Email",
            "Lecturer Department",
            "Lecturer Office Location",
            testSchedule);

    private static final TA testTA = new TA(
            "3",
            "pwd",
            "TA Name",
            "TA Email",
            "TA Department",
            "TA Enrolled As",
            testSchedule);

    private static final Student testStudent = new Student(
            "4",
            "pwd",
            "Student Name",
            "Student Email",
            "Student Department",
            testSchedule,
            "Student Course",
            testModules);

    private static final Person[] people = {testPresident, testLecturer, testTA, testStudent};

    public static Person getUser(String id) {
        for (Person i : people) {
            if (i.getId().equals(id)) {
                return i;
            }
        }
        return testLecturer;
    }

    public static String[] getIds() {
        String[] ids = new String[4];
        for (int i = 0; i < ids.length; i++) {
            ids[i] = people[i].getId();
        }
        return ids;
    }

    public static String[] getPwds() {
        String[] pwds = new String[4];
        for (int i = 0; i < pwds.length; i++) {
            pwds[i] = people[i].getPassword();
        }
        return pwds;
    }
}
