package gui;

import data.PremadeUsers;
import person.Person;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Internal extends JFrame implements ActionListener {
    private final JFrame frame;
    private JPanel internalBg;
    private JLabel noodleLogo;
    private JLabel lblLogin;
    private JButton btnLogOut;

    public Internal(String userID) {

        //Create icon
        ImageIcon icon = new ImageIcon("Images/NoodleLogo_Scaled.png");
        setIconImage(icon.getImage());
        Image i = icon.getImage();
        Image new_img = i.getScaledInstance(55, 55, Image.SCALE_AREA_AVERAGING);
        icon = new ImageIcon(new_img);
        noodleLogo.setIcon(icon);



        //Create and set up the window
        frame = new JFrame("Noodle - Logged in");
        setTitle("Noodle- Logged in");
        setIconImage(icon.getImage());
        setContentPane(internalBg);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


        //Loads the logged-in user to access their info
        Person currentUser = PremadeUsers.getUser(userID);


        //Welcomes the specific user to the Internal Area
        lblLogin.setText("Welcome " + currentUser.getName() + "!");

        //button styling
        btnLogOut.addActionListener(this);

        btnLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogOut.setBackground(new Color(158, 85, 11));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogOut.setBackground( new Color(185,119, 39));
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnLogOut) {
                new ExternalArea();
                frame.dispose();
            }
        }
    }




