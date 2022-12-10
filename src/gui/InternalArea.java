package gui;

import person.Person;
import data.PremadeUsers;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InternalArea implements ActionListener {

    final JButton logoutButton;
    final JFrame frame;

    InternalArea(String userID) {

        //Loads the logged-in user to access their info
        Person currentUser = PremadeUsers.getUser(userID);

        //Loads icon image from project folder
        ImageIcon icon = new ImageIcon("Images/noodle.png");

        //Frame setup
        frame = new JFrame("Noodle - Internal Area");
        frame.setIconImage(icon.getImage());
        frame.setLayout(new FlowLayout());

        //Welcomes the specific user to the Internal Area
        JLabel label = new JLabel("Welcome " + currentUser.getName() + "!", SwingConstants.CENTER);
        label.setFont(new Font("Helvetica", Font.BOLD, 30));
        frame.add(label);

        //Creates Logout button
        logoutButton = new JButton("Logout");
        logoutButton.setFocusable(false);
        logoutButton.addActionListener(this);
        logoutButton.setBackground(Color.lightGray);
        logoutButton.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));

        //Shading for Logout button (when hovering over it)
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutButton.setBackground(Color.gray);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutButton.setBackground(Color.lightGray);
            }
        });

        //Adds Logout button to frame
        frame.add(logoutButton);

        //Simple JFrame operations
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == logoutButton) {
            //Returns to Login Page
            new LoginGUI();
            frame.dispose();
        }
    }
}
