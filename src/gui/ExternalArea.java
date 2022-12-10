package gui;

import data.PasswordAuthentication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExternalArea extends JFrame implements ActionListener {

    private JPanel externalAreaBg;
    private JLabel noodleLogo;
    private JLabel lblLogin;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton submitButton;

    public ExternalArea() {

        //Create icon
        ImageIcon icon = new ImageIcon("Images/NoodleLogo_Scaled.png");
        Image i = icon.getImage();
        Image new_img = i.getScaledInstance(55, 55, Image.SCALE_AREA_AVERAGING);
        icon = new ImageIcon(new_img);
        noodleLogo.setIcon(icon);

        submitButton.addActionListener(this);

        //Create and set up the window
        setTitle("Noodle - Login");
        setIconImage(icon.getImage());
        setContentPane(externalAreaBg);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton && PasswordAuthentication.password(textField1.getText(), passwordField1.getText())) {
            new InternalArea(textField1.getText());
        } else {
            new LoginFailed();
        }
        dispose();
    }
}
