package gui;

import javax.swing.*;
import java.awt.*;

public class ExternalArea extends JFrame {

    private JPanel externalAreaBg;
    private JLabel noodleLogo;

    public ExternalArea() {

        ImageIcon icon = new ImageIcon("Images/NoodleLogo_Scaled.png");

        //Create and set up the window
        setTitle("Noodle - Login");
        setIconImage(icon.getImage());
        setContentPane(externalAreaBg);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
