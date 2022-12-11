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
    private JLabel welcomeLbl;
    private JButton logOutBtn;
    private JLabel userIDLbl;
    private JLabel fullNameLbl;
    private JLabel emailLbl;
    private JLabel departmentLbl;
    private JLabel timetableLbl;
    private JLabel availavilityLbl;
    private JLabel courseBoldLbl;
    private JLabel courseLbl;
    private JLabel officeLocationBoldLbl;
    private JLabel officeLocationLbl;
    private JLabel modulesBoldLbl;
    private JLabel ModulesLbl;
    private JLabel enrolledAsLbl;
    private JLabel enrolledAsBoldLbl;

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
        welcomeLbl.setText("Welcome " + currentUser.getName() + "!");

        //Personal info
        userIDLbl.setText(currentUser.getId());
        fullNameLbl.setText(currentUser.getName());
        emailLbl.setText(currentUser.getEmail());

        //Department info
        departmentLbl.setText(currentUser.getDepartment());

        /*
        this returns a boolean value, it needs a string value to be visible tho
        availavilityLbl.setText(currentUser.isAvailable());
        */

        //button styling
        logOutBtn.addActionListener(this);

        //Allows use of enter button to logout
        getRootPane().setDefaultButton(logOutBtn);

        logOutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logOutBtn.setBackground(new Color(158, 85, 11));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logOutBtn.setBackground( new Color(185,119, 39));
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == logOutBtn) {
                new ExternalArea();
                frame.dispose();
            }
        }
    }




