package GUI;

import javax.swing.*;

public class LoginFailed extends JFrame{
    private JLabel lblLogin;
    private JButton tryAgainButton;
    private JPanel LoginFailedBckgrd;

    public LoginFailed() {
        setContentPane(LoginFailedBckgrd);
        setSize(1550,850);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        LoginFailed myFrame = new LoginFailed();
    }
}
