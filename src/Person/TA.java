package Person;

public class TA extends Person {
    private String enrolledAs;

    public TA(int id, String name, String contact, String department, String enrolledAs, String[] schedule) {
        super(id, name, contact, department, schedule);
        this.enrolledAs = enrolledAs;
    }
    public String getEnrolledAs() {
        return enrolledAs;
    }

    public void setEnrolledAs(String enrolledAs) {
        this.enrolledAs = enrolledAs;
    }
}
