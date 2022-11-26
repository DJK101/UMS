import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class TestArraySplit {

    public static void main(String[] args) {
        String[] arr = {
                "10:00", "17:00",
                "11:00", "17:00",
                "11:00", "17:00",
                "11:00", "17:00",
                "11:00", "17:00",
                "11:00", "12:00",
                "11:00", "17:00"};

        int[] converted = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            String removeColon = arr[i].replace(":", "");
            int toInt = Integer.parseInt(removeColon);
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

        if (nowInt > startTime && nowInt < endTime) {
            System.out.println("Available");
        } else {
            System.out.println("Unavailable");
        }
    }
}
