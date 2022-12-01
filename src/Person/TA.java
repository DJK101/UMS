package Person;

public class TA extends Person {
    private String enrolledAs;

    public TA(int id, String name, String contact, String department, String enrolledAs, String[] schedule) {
        super(id, name, contact, department, schedule);
        this.enrolledAs = enrolledAs;
    }

    public String stringMaker() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < getSchedule().length; i++) {
            String[] daysOfWeek = {"Mon", "Tue", "Wed", "Thu", "Fri"};
            str.append(daysOfWeek[i]).append(": ").append(getSchedule()[i]).append(System.lineSeparator());
        }
        return "Teachers Assistant ID: " + getId() + System.lineSeparator() +
                "Teachers Assistant Name: " + getName() + System.lineSeparator() +
                "Contact Info: " + getEmail() + System.lineSeparator() +
                "Department: " + getDepartment() + System.lineSeparator() +
                "Enrolled As: " + this.enrolledAs + System.lineSeparator() +
                "Office Hours: " + System.lineSeparator() + str;
    }
    public String getEnrolledAs() {
        return enrolledAs;
    }

    public void setEnrolledAs(String enrolledAs) {
        this.enrolledAs = enrolledAs;
    }
}
