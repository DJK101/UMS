package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFailed extends JFrame implements ActionListener {
    private JLabel lblLogin;
    private JButton tryAgainButton;
    private JPanel LoginFailedBckgrd;
    private JLabel noodleLogo;


    public LoginFailed() {

        //Create icon
        ImageIcon icon = new ImageIcon("Images/noodle.png");
        Image new_img = icon.getImage().getScaledInstance(120, 40, Image.SCALE_SMOOTH);
        tryAgainButton.addActionListener(this);
        //img = new ImageIcon(new_img);

        //Create and set up the window
        setTitle("Noodle- Failed Login");
        setIconImage(icon.getImage());
        setContentPane(LoginFailedBckgrd);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        getRootPane().setDefaultButton(tryAgainButton);

        noodleLogo.setIcon(icon);
        //noodleLogo.setSize(10, 10);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tryAgainButton) {
            new LoginGUI();
            dispose();
        }
    }


    public static void main(String[] args) {

        LoginFailed myFrame = new LoginFailed();
        JFrame f=new JFrame();
        f.add(myFrame);
        f.setVisible(true);
    }
}
