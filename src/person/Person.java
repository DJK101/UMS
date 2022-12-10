package person;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Person {
    private String id;
    private String password;
    private String name;
    private String email;
    private String department;
    private String[] schedule;

    public Person(String id, String password, String name, String email, String department, String[] schedule) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.email = email;
        this.department = department;
        this.schedule = schedule;
    }

    public boolean isAvailable() {
        int[] converted = new int[(this.schedule).length];
        for (int i = 0; i < converted.length; i++) {
            String noColon = (this.schedule[i]).replace(":", "");
            int toInt = Integer.parseInt(noColon);
            converted[i] = toInt;
        }

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        LocalDateTime now = LocalDateTime.now();
        String nowString = dtf.format(now).replace(":", "");
        int nowInt = Integer.parseInt(nowString);

        Calendar calendar = Calendar.getInstance();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        int startTime = -1;
        int endTime = -1;
        switch (dayOfWeek) {
            case 1:
                startTime = converted[12];
                endTime = converted[13];
                break;
            case 2:
                startTime = converted[0];
                endTime = converted[1];
                break;
            case 3:
                startTime = converted[2];
                endTime = converted[3];
                break;
            case 4:
                startTime = converted[4];
                endTime = converted[5];
                break;
            case 5:
                startTime = converted[6];
                endTime = converted[7];
                break;
            case 6:
                startTime = converted[8];
                endTime = converted[9];
                break;
            case 7:
                startTime = converted[10];
                endTime = converted[11];
                break;
            default:
                System.out.println("Something went wrong... dayOfWeek out of bounds");
        }

        return (nowInt > startTime && nowInt < endTime);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String[] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[] schedule) {
        this.schedule = schedule;
    }
}
