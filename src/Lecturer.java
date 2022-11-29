import java.util.Random;

public class Lecturer extends Person {

    private String officeLocation;

    public Lecturer(int id, String name, String contact, String department,
                    String officeLocation, String[] schedule) {
        super(id, name, contact, department, schedule);

        this.officeLocation = officeLocation;
    }

    public String stringMaker() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < getSchedule().length; i++) {
            String[] daysOfWeek = {"Mon", "Tue", "Wed", "Thu", "Fri"};
            str.append(daysOfWeek[i]).append(": ").append(getSchedule()[i]).append(System.lineSeparator());
        }
        return "Lecturer ID: " + getId() + System.lineSeparator() +
                "Lecturer Name: " + getName() + System.lineSeparator() +
                "Contact Info: " + getEmail() + System.lineSeparator() +
                "Department: " + getDepartment() + System.lineSeparator() +
                "Office Location: " + this.officeLocation + System.lineSeparator() +
                "Office Hours: " + System.lineSeparator() + str;
    }

    public boolean isAvailable() {
        Random output = new Random();
        return output.nextBoolean();
    }

    public String getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }
}
