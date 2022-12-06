public class passwordAuthentication {

    private static final String[] UserID = {"1", "1223", "2334", "3445"};
    private static final String[] passwords = {"pwd", "student123", "ta123", "lecturer123"};

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