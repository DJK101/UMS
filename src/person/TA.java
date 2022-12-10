package person;

public class TA extends Person {
    private String enrolledAs;

    public TA(String id, String password, String name, String contact, String department, String enrolledAs, String[] schedule) {
        super(id, password, name, contact, department, schedule);
        this.enrolledAs = enrolledAs;
    }

    public String getEnrolledAs() {
        return enrolledAs;
    }

    public void setEnrolledAs(String enrolledAs) {
        this.enrolledAs = enrolledAs;
    }
}
