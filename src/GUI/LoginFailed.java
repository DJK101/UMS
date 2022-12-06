package GUI;

import javax.swing.*;

public class LoginFailed extends JFrame{
    private JLabel lblLogin;
    private JButton tryAgainButton;
    private JPanel LoginFailedBckgrd;


    public LoginFailed() {

        //Create icon
        ImageIcon icon = new ImageIcon("Images/noodle.png");

        //Create and set up the window
        setTitle("Noodle- Failed Login");
        setIconImage(icon.getImage());
        setContentPane(LoginFailedBckgrd);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        LoginFailed myFrame = new LoginFailed();
    }
}
