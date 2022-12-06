public class PasswordAuthentication {

    public static boolean password(String enteredUserID, String enteredPassword) {

        int index = 0;

        //Loops through the ids that exist in the system
        for (int i = 0; i < PremadeUsers.getIds().length; i++) {
            //If the id is found, saves the index of that id to index
            if (PremadeUsers.getIds()[i].equals(enteredUserID)) {
                index = i;
                break;
            }
        }
        //Will return true iff id and password match
        return PremadeUsers.getPwds()[index].equals(enteredPassword);
    }
}