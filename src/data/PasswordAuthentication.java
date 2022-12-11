package data;

public class PasswordAuthentication {

    public static boolean password(String enteredUserID, String enteredPassword) {

        int index = -1;

        //Loops through the ids that exist in the system
        for (int i = 0; i < PremadeUsers.getIds().length; i++) {
            //If the id is found, saves the index of that id to index
            if (PremadeUsers.getIds()[i].equals(enteredUserID)) {
                index = i;
                break;
            } else if (i == PremadeUsers.getIds().length - 1){
                return false;
            }
        }
        //Will return true iff id and password match
        if (PremadeUsers.getPwds()[index].equals(enteredPassword)) {
            return true;
        } else {
            count ++;
            return false;
        }
    }

    private static int count = 0;

    public static void setCount(int count) {
        PasswordAuthentication.count = count;
    }

    public static int getCount() {
        return PasswordAuthentication.count;
    }

    public static boolean attempts(int maxAttempts) {
        return count < maxAttempts;
    }
}