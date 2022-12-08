package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFailed extends JFrame implements ActionListener {
    private JLabel lblLogin;
    private JButton tryAgainButton;
    private JPanel LoginFailedBckgrd;


    public LoginFailed() {

        //Create the icon
        ImageIcon icon = new ImageIcon("Images/noodle.png");

        tryAgainButton.addActionListener(this);

        //Create and set up the window
        setTitle("Noodle- Failed Login");
        setIconImage(icon.getImage());
        setContentPane(LoginFailedBckgrd);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        getRootPane().setDefaultButton(tryAgainButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tryAgainButton) {
            new LoginGUI();
            dispose();
        }
    }
}
