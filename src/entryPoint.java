public class entryPoint {
    public static void main(String[] args) {

        String[] jamesHours = {"10:00 - 16:00", "10:00 - 16:00", "10:00 - 16:00", "10:00 - 16:00", "10:00 - 16:00"};
        Lecturer lec = new Lecturer(9, "James", "james@me.com", "Ass",
                "Your mum", jamesHours);

        String[] TAHours = {"24/7", "24/7", "24/7", "24/7", "24/7"};
        TA adam = new TA(7, "Java Adam", "adam@swag.ise", "This one",
                "Masters Student", TAHours);

        String[] studentSchedule = {"09:00", "17:00", "09:00 - 17:00", "09:00 - 17:00", "09:00 - 17:00", "09:00 - 17:00"};
        Student me = new Student(3, "DJ", "me@me.me", "Zoinks",
                "Scoobs", "Colm", studentSchedule, "ISE LM173");


        System.out.println(lec.stringMaker() + "Is Available? " + lec.isAvailable() + System.lineSeparator());
        System.out.println(adam.stringMaker());
        System.out.println(me.stringMaker());
    }

}
