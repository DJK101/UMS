public class TA extends Person {
    private String enrolledAs;
    private String[] officeHours;

    public TA(int id, String name, String contact, String department, String enrolledAs, String[] officeHours) {
        super(id, name, contact, department);
        this.enrolledAs = enrolledAs;
        this.officeHours = officeHours;
    }

    public String stringMaker() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < officeHours.length; i++) {
            String[] daysOfWeek = {"Mon", "Tue", "Wed", "Thu", "Fri"};
            str.append(daysOfWeek[i]).append(": ").append(officeHours[i]).append(System.lineSeparator());
        }
        return "Teachers Assistant ID: " + getId() + System.lineSeparator() +
                "Teachers Assistant Name: " + getName() + System.lineSeparator() +
                "Contact Info: " + getEmail() + System.lineSeparator() +
                "Department: " + getDepartment() + System.lineSeparator() +
                "Enrolled As: " + this.enrolledAs + System.lineSeparator() +
                "Office Hours: " + System.lineSeparator() + str.toString();
    }

    public boolean isAvailable() {
        return true;
    }

    public String getEnrolledAs() {
        return enrolledAs;
    }

    public void setEnrolledAs(String enrolledAs) {
        this.enrolledAs = enrolledAs;
    }

    public String[] getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String[] officeHours) {
        this.officeHours = officeHours;
    }
}
