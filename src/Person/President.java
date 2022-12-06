package Person;

public class President extends Person{
    private String officeLocation;

    public President(int id, String password, String name, String email, String department, String[] schedule) {
        super(id, password,name, email, department, schedule);
    }

    public String getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }
}
