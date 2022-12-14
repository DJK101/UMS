package gui;

import data.PasswordAuthentication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExternalArea extends JFrame implements ActionListener {

    private final JFrame frame;
    private JPanel externalAreaBg;
    private JLabel noodleLogo;
    private JLabel lblLogin;
    private JTextField idTextField;
    private JPasswordField pwdTextField;
    private JButton btnLogin;

    public ExternalArea() {

        //Create icon
        ImageIcon icon = new ImageIcon("Images/NoodleLogo_Scaled.png");
        Image i = icon.getImage();
        Image new_img = i.getScaledInstance(55, 55, Image.SCALE_AREA_AVERAGING);
        icon = new ImageIcon(new_img);
        noodleLogo.setIcon(icon);

        //Create and set up the window
        frame = new JFrame("Noodle - Login");
        setTitle("Noodle - Login");
        setIconImage(icon.getImage());
        setContentPane(externalAreaBg);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        //button styling
        btnLogin.addActionListener(this);

        //Allows use of enter button to submit
        getRootPane().setDefaultButton(btnLogin);

        int maxAttempts = 4;
        int attempts = PasswordAuthentication.getCount();

        //Submit button highlighting when within attempt range
        if (PasswordAuthentication.attempts(maxAttempts)) {
            btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {

                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    btnLogin.setBackground(new Color(158, 85, 11));
                }

                public void mouseExited(java.awt.event.MouseEvent evt) {
                    btnLogin.setBackground(new Color(185, 119, 39));
                }
            });

        } else {
            //Disables button if max attempts is exceeded
            idTextField.setEnabled(false);
            pwdTextField.setEnabled(false);
            idTextField.setBackground(new Color(0xD7D7D7));
            pwdTextField.setBackground(new Color(0xD7D7D7));
            lblLogin.setText("Too Many Failed Attempts (" + attempts + "/" + maxAttempts + ")");
            lblLogin.setForeground(new Color(0x8B0001));
            btnLogin.setEnabled(false);
            btnLogin.setBackground(new Color(158, 85, 11));
        }

        //Displays number of Failed Attempts
        if (attempts > 0) {
            lblLogin.setText("Login (Failed Attempts " + attempts + "/" + maxAttempts + ")");
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnLogin) {

            //Gets the entered details
            String enteredId = idTextField.getText();
            String enteredPwd = String.valueOf(pwdTextField.getPassword());

            //Checks if the entered details are valid
            if (PasswordAuthentication.password(enteredId, enteredPwd)) {
                new Internal(idTextField.getText());
            } else {
                new LoginFailed();
            }

            dispose();
        }
    }
}

