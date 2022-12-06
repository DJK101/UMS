package Person;

public class Lecturer extends Person {

    private String officeLocation;

    public Lecturer(int id, String password, String name, String contact, String department,
                    String officeLocation, String[] schedule) {
        super(id, password, name, contact, department, schedule);

        this.officeLocation = officeLocation;
    }

    public String getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }
}
