public class passwordAuthentication {
    static String[] UserID = {"1223", "2334", "3445"};
    static String[] passwords = {"student123", "ta123", "lecturer123"};

    public static boolean password(String enteredUserID, String enteredPassword) {

        int index = -1;

        for (int i = 0; i < UserID.length; i++) {
            if (UserID[i].equals(enteredUserID)) {
                index = i;
                break;
            }
        }
        return passwords[index].equals(enteredPassword);
    }


}