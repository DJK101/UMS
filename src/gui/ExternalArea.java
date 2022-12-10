package gui;

import javax.swing.*;
import java.awt.*;

public class ExternalArea extends JFrame {

    private JPanel externalAreaBg;
    private JLabel noodleLogo;
    private JLabel lblLogin;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton tryAgainButton;

    public ExternalArea() {

        //Create icon
        ImageIcon icon = new ImageIcon("Images/NoodleLogo_Scaled.png");
        Image i = icon.getImage();
        Image new_img = i.getScaledInstance(55, 55, Image.SCALE_AREA_AVERAGING);
        icon = new ImageIcon(new_img);
        noodleLogo.setIcon(icon);

        //Create and set up the window
        setTitle("Noodle - Login");
        setIconImage(icon.getImage());
        setContentPane(externalAreaBg);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
