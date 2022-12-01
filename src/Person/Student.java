package Person;

public class Student extends Person {
    private String favouriteModule;
    private String favouriteTA;
    private String[] schedule;
    private String course;
    private String[] modules;

    public Student(int id, String name, String contact, String department,
                   String favouriteModule, String favouriteTA, String[] schedule, String course, String[] modules) {
        super(id, name, contact, department, schedule);
        this.favouriteModule = favouriteModule;
        this.favouriteTA = favouriteTA;
        this.course = course;
        this.modules = modules;
    }

    public String[] getModules() {
        return modules;
    }

    public void setModules(String[] modules) {
        this.modules = modules;
    }

    public String getFavouriteModule() {
        return favouriteModule;
    }

    public void setFavouriteModule(String favouriteModule) {
        this.favouriteModule = favouriteModule;
    }

    public String getFavouriteTA() {
        return favouriteTA;
    }

    public void setFavouriteTA(String favouriteTA) {
        this.favouriteTA = favouriteTA;
    }

    public String[] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[] schedule) {
        this.schedule = schedule;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
