public class PasswordAuthentication {

    public static boolean password(String enteredUserID, String enteredPassword) {

        int index = 0;

        for (int i = 0; i < PremadeUsers.getIds().length; i++) {
            if (PremadeUsers.getIds()[i].equals(enteredUserID)) {
                index = i;
                break;
            }
        }
        return PremadeUsers.getPwds()[index].equals(enteredPassword);
    }
}