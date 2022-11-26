import java.util.Random;

public class Student extends Person {
    private String favouriteModule;
    private String favouriteTA;
    private String[] schedule;
    private String course;

    public Student(int id, String name, String contact, String department,
                   String favouriteModule, String favouriteTA, String[] schedule, String course) {
        super(id, name, contact, department, schedule);
        this.favouriteModule = favouriteModule;
        this.favouriteTA = favouriteTA;
        this.course = course;
    }

    public String stringMaker() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < schedule.length; i++) {
            String[] daysOfWeek = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
            str.append(daysOfWeek[i]).append(": ").append(schedule[i]).append(System.lineSeparator());
        }
        return "Student ID: " + getId() + System.lineSeparator() +
                "Student Name: " + getName() + System.lineSeparator() +
                "Contact Info: " + getContact() + System.lineSeparator() +
                "Department: " + getDepartment() + System.lineSeparator() +
                "Course: " + this.course + System.lineSeparator() +
                "Schedule: " + System.lineSeparator() + str;
    }

    public boolean shouldBeInClass() {
        Random output = new Random();
        return output.nextBoolean();
    }

    public String getFavouriteModule() {
        return favouriteModule;
    }

    public void setFavouriteModule(String favouriteModule) {
        this.favouriteModule = favouriteModule;
    }

    public String getFavouriteTA() {
        return favouriteTA;
    }

    public void setFavouriteTA(String favouriteTA) {
        this.favouriteTA = favouriteTA;
    }

    public String[] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[] schedule) {
        this.schedule = schedule;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
