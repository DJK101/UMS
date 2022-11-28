import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI implements ActionListener {

    JFrame frame;
    JButton submitButton;
    JTextField idTextField;
    JTextField pwdTextField;

    LoginGUI() {

        //Create icon
        ImageIcon icon = new ImageIcon("Images/noodle.png");

        //Create and set up the window.
        frame = new JFrame("Noodle - Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(icon.getImage());

        //Set up the content pane.
        Container contentPane = frame.getContentPane();
        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);

        //Login title label
        JLabel loginTitle = new JLabel("Login - Noodle v0.1");
        loginTitle.setFont(new Font("Helvetica", Font.BOLD, 30));
        contentPane.add(loginTitle);

        //Submit login details button
        submitButton = new JButton("Submit");
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

        //Position ID text field
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, idTextField, //Horizontal
                30,
                SpringLayout.HORIZONTAL_CENTER, contentPane);
        layout.putConstraint(SpringLayout.VERTICAL_CENTER, idTextField, //Vertical
                -30,
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
                0,
                SpringLayout.HORIZONTAL_CENTER, contentPane);
        layout.putConstraint(SpringLayout.NORTH, submitButton, //Vertical
                10,
                SpringLayout.SOUTH, pwdTextField);

        //Position title
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, loginTitle, //Horizontal
                30,
                SpringLayout.HORIZONTAL_CENTER, contentPane);
        layout.putConstraint(SpringLayout.SOUTH, loginTitle,
                -40,
                SpringLayout.NORTH, idTextField);

        //Display the window.
        frame.setSize(750, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            System.out.println("ID Input: " + idTextField.getText()
                    + System.lineSeparator() +
                    "Password Input: " + pwdTextField.getText());
            if ("1".equals(idTextField.getText()) && "pwd".equals(pwdTextField.getText())) {
                new InternalArea();
                frame.dispose();
            }
        }
    }
}
