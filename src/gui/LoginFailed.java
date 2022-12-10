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
        ImageIcon icon = new ImageIcon("Images/NoodleLogo_Scaled.png");
        setIconImage(icon.getImage());
        Image i = icon.getImage();
        Image new_img = i.getScaledInstance(55, 55, Image.SCALE_AREA_AVERAGING);
        icon = new ImageIcon(new_img);
        noodleLogo.setIcon(icon);

        //Button action listener
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
            new ExternalArea();
            dispose();
        }
    }
}
