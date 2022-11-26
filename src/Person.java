public class Person {
    private int id;
    private String name;
    private String email;
    private String department;
    private String[] schedule;

    public Person(int id, String name, String email, String department, String[] schedule) {
        this.id = id;
        this.name = name;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
