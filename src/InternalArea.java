import Person.Person;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InternalArea implements ActionListener {

    final JButton logoutButton;
    final JFrame frame;

    InternalArea(String userID) {

        ImageIcon icon = new ImageIcon("Images/noodle.png");

        frame = new JFrame("Noodle - Internal Area");
        frame.setIconImage(icon.getImage());
        frame.setLayout(new FlowLayout());


        Person currentUser = PremadeUsers.getUser(userID);
        JLabel label = new JLabel("Welcome " + currentUser.getName() + "!", SwingConstants.CENTER);
        label.setFont(new Font("Helvetica", Font.BOLD, 30));
        frame.add(label);

        logoutButton = new JButton("Logout");
        logoutButton.setFocusable(false);
        logoutButton.addActionListener(this);
        logoutButton.setBackground(Color.lightGray);
        logoutButton.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));

        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutButton.setBackground(Color.gray);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutButton.setBackground(Color.lightGray);
            }
        });

        frame.add(logoutButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == logoutButton) {
            new LoginGUI();
            frame.dispose();
        }
    }
}
