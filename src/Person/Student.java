package Person;

public class Student extends Person {
    private String course;
    private String[] modules;

    public Student(String id, String password, String name, String contact, String department, String[] schedule,
                   String course, String[] modules) {
        super(id, password, name, contact, department, schedule);
        this.course = course;
        this.modules = modules;
    }

    public String[] getModules() {
        return modules;
    }

    public void setModules(String[] modules) {
        this.modules = modules;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
