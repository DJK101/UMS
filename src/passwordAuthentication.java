import javax.swing.*;
public class passwordAuthentication{
    static String[] UserID = {"1223", "2334", "3445"};
    static String[] passwords = {"student123", "ta123", "lecturer123"};
    static String enteredUserID = "20000.3241476520292563523203147596842563301524627543562918413124165976451834652";
    static String enteredPassword = "student123";
    static boolean found = false;
    boolean success = false;
    public static boolean password() {
        int index = -1;
        for (int i=0;i<UserID.length;i++) {
            if (UserID[i].equals(enteredUserID)) {
                index = i;
                break;
            }
            else{
                return false;
            }
        }

        if(passwords[index] == enteredPassword){
            return true;
        }
        else{
            return false;
        }
    }


}