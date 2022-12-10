package data;

import person.*;

public class PremadeUsers {

    //Basic Schedule for all users to have as a default
    private static final String[] testSchedule = {
            "10:00", "17:00",
            "11:00", "17:00",
            "11:00", "17:00",
            "11:00", "17:00",
            "11:00", "17:00",
            "11:00", "15:00",
            "11:00", "17:00"};

    //Modules for the student
    private static final String[] testModules = {
            "Module 1",
            "Module 2"};

    //President template
    private static final President testPresident = new President(
            "1",
            "pwd",
            "President Name",
            "President Email",
            "President Department",
            testSchedule);

    //Lecturer template
    private static final Lecturer testLecturer = new Lecturer(
            "2",
            "pwd",
            "Lecturer Name",
            "Lecturer Email",
            "Lecturer Department",
            "Lecturer Office Location",
            testSchedule);

    //TA template
    private static final TA testTA = new TA(
            "3",
            "pwd",
            "TA Name",
            "TA Email",
            "TA Department",
            "TA Enrolled As",
            testSchedule);

    //Student template
    private static final Student testStudent = new Student(
            "4",
            "pwd",
            "Student Name",
            "Student Email",
            "Student Department",
            testSchedule,
            "Student Course",
            testModules);

    //Array of premade users
    private static final Person[] people = {testPresident, testLecturer, testTA, testStudent};

    //Method for accessing individual users based off their id
    public static Person getUser(String id) {
        for (Person i : people) {
            if (i.getId().equals(id)) {
                return i;
            }
        }
        return testLecturer;
    }

    //Method for accessing all ids within the system, for data.PasswordAuthentication
    public static String[] getIds() {
        String[] ids = new String[people.length];
        for (int i = 0; i < ids.length; i++) {
            ids[i] = people[i].getId();
        }
        return ids;
    }

    //Method for accessing all pwds within the system, for data.PasswordAuthentication
    public static String[] getPwds() {
        String[] pwds = new String[people.length];
        for (int i = 0; i < pwds.length; i++) {
            pwds[i] = people[i].getPassword();
        }
        return pwds;
    }
}
