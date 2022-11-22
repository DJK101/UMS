import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestArraySplit {

    public static void main(String[] args) {
        String[] arr = {"10:00", "09:00", "11:00"};

        int[] converted = new int[arr.length];
//        int[] converted = {1000, 900, 1100}
 /*
String input = "10:00";
        String output = arr[1].replace(":","");
        int output2 = Integer.parseInt(output);
        if (output2 > 0) {
            System.out.println(output);

 */

        for (int i = 0; i < arr.length; i++) {
            String removeColon = arr[i].replace(":", "");
            int toInt = Integer.parseInt(removeColon);
            converted[i] = toInt;
        }
        for (int i: converted) {
            System.out.println(i);
        }

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        LocalDateTime now = LocalDateTime.now();
        String nowString = dtf.format(now);
        System.out.println(nowString);

    }
}
