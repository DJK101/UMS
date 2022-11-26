import java.util.Scanner;

public class entryPoint {
    public static void main(String[] args) {

        System.out.println("Please select your account:");
        Scanner in = new Scanner(System.in);

        String[] TASchedule = {
                "10:00", "17:00",
                "11:00", "17:00",
                "11:00", "17:00",
                "11:00", "17:00",
                "11:00", "17:00",
                "11:00", "15:00",
                "11:00", "17:00"};
        TA adam = new TA(7, "Java Adam", "adam@swag.ise", "This one",
                "Masters Student", TASchedule);


        System.out.println(adam.isAvailable());
    }

}
