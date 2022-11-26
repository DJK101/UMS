public class Person {
    private int id;
    private String name;
    private String contact;
    private String department;
    private String[] schedule;

    public Person(int id, String name, String contact, String department, String[] schedule) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.department = department;
        this.schedule = schedule;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
