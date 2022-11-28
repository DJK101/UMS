import java.util.Scanner;

public class entryPoint {
    public static void main(String[] args) {

        String[] TASchedule = {
                "10:00", "17:00",
                "11:00", "17:00",
                "11:00", "17:00",
                "11:00", "17:00",
                "11:00", "17:00",
                "11:00", "15:00",
                "11:00", "17:00"};
        TA adam = new TA(7, "Java Adam", "adam@swag.ise", "This one", "Masters Student", TASchedule);

        System.out.println("Please select your account:" + System.lineSeparator() + "[1] Student" + System.lineSeparator() + "[2] Teacher's Assistant" + System.lineSeparator() + "[3] Lecturer");

        Scanner in = new Scanner(System.in);
        String selection = in.nextLine();
        String person = "";
        switch (selection) {
            case "1":
                person = "Student";
                break;
            case "2":
                person = "TA";
                break;
            case "3":
                person = "Lecturer";
                break;
            default:
                System.out.println("Invalid selection!");
        }
        System.out.println("Please enter the password for " + person + ":");
        String pwd = in.nextLine();
        switch (selection) {
            case "1":
                if (pwd.equals("Spwd")) {
                    System.out.println("Access Granted");
                }
                break;
            case "2":
                if (pwd.equals("Tpwd")) {
                    System.out.println("Access Granted");
                }
                break;
            case "3":
                if (pwd.equals("Lpwd")) {
                    System.out.println("Access Granted");
                }
                break;
        }
    }

}
