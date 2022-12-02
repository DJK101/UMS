import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LoginGUI implements ActionListener {

    final JFrame frame;
    final JButton submitButton;
    final JTextField idTextField;
    final JTextField pwdTextField;
    final Container contentPane;

    LoginGUI() {

        //Create icon
        ImageIcon icon = new ImageIcon("Images/noodle.png");

        //Create and set up the window.
        frame = new JFrame("Noodle - Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(icon.getImage());

        //Set up the content pane.
        contentPane = frame.getContentPane();
        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);

        //Login title label
        JLabel loginTitle = new JLabel("Login");
        loginTitle.setFont(new Font("Helvetica", Font.BOLD, 30));
        contentPane.add(loginTitle);

        JLabel versionLabel = new JLabel("Noodle© 2022 - v0.1");
        versionLabel.setFont(new Font("Helvetica", Font.PLAIN, 10));
        contentPane.add(versionLabel);

        //Submit login details button
        submitButton = new JButton("Submit");
        submitButton.setBackground(new Color(0xB6FF3D));
        Border margin = new EmptyBorder(5, 15, 5, 15);
        submitButton.setBorder(margin);
        submitButton.addActionListener(this);
        submitButton.setFocusable(false);
        contentPane.add(submitButton);


        //ID label and text field
        JLabel idLabel = new JLabel("ID:");
        idTextField = new JTextField("", 15);
        contentPane.add(idLabel);
        contentPane.add(idTextField);

        //Password label and text field
        JLabel pwdLabel = new JLabel("Password:");
        pwdTextField = new JTextField("", 15);
        contentPane.add(pwdLabel);
        contentPane.add(pwdTextField);

        //Position version label
        layout.putConstraint(SpringLayout.EAST, versionLabel, //Horizontal
                -5,
                SpringLayout.EAST, contentPane);
        layout.putConstraint(SpringLayout.SOUTH, versionLabel, //Vertical
                -5,
                SpringLayout.SOUTH, contentPane);

        //Position ID text field
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, idTextField, //Horizontal
                10,
                SpringLayout.HORIZONTAL_CENTER, contentPane);
        layout.putConstraint(SpringLayout.VERTICAL_CENTER, idTextField, //Vertical
                0,
                SpringLayout.VERTICAL_CENTER, contentPane);

        //Position password text field
        layout.putConstraint(SpringLayout.EAST, pwdTextField, //Horizontal
                0,
                SpringLayout.EAST, idTextField);
        layout.putConstraint(SpringLayout.NORTH, pwdTextField, //Vertical
                5,
                SpringLayout.SOUTH, idTextField);

        //Position ID label
        layout.putConstraint(SpringLayout.EAST, idLabel, //Horizontal
                -5,
                SpringLayout.WEST, idTextField);
        layout.putConstraint(SpringLayout.NORTH, idLabel, //Vertical
                0,
                SpringLayout.NORTH, idTextField);

        //Position password label
        layout.putConstraint(SpringLayout.EAST, pwdLabel, //Horizontal
                -5,
                SpringLayout.WEST, pwdTextField);
        layout.putConstraint(SpringLayout.NORTH, pwdLabel, //Vertical
                0,
                SpringLayout.NORTH, pwdTextField);

        //Position Submit Button
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, submitButton, //Horizontal
                -10,
                SpringLayout.HORIZONTAL_CENTER, idTextField);
        layout.putConstraint(SpringLayout.NORTH, submitButton, //Vertical
                10,
                SpringLayout.SOUTH, pwdTextField);

        //Position title
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, loginTitle, //Horizontal
                -10,
                SpringLayout.HORIZONTAL_CENTER, idTextField);
        layout.putConstraint(SpringLayout.SOUTH, loginTitle,
                -20,
                SpringLayout.NORTH, idTextField);

        //Display the window.
        frame.setSize(750, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.getRootPane().setDefaultButton(submitButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            if (passwordAuthentication.password(idTextField.getText(), pwdTextField.getText())) {
                new InternalArea();
                frame.dispose();
            }
        }
    }
}
