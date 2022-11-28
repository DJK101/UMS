import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame implements ActionListener {
    JButton submitButton;
    JTextField idTextField;
    JTextField pwdTextField;
    MyFrame() {

        //Create and set up the window.
        JFrame frame = new JFrame("Noodle - Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set up the content pane.
        Container contentPane = frame.getContentPane();
        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        contentPane.add(submitButton);

        //Create and add the components.
        JLabel idLabel = new JLabel("ID:");
        idTextField = new JTextField("", 15);
        contentPane.add(idLabel);
        contentPane.add(idTextField);

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


        //Display the window.
        frame.setSize(500, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            System.out.println("ID Input: " + idTextField.getText()
                    + System.lineSeparator() +
                    "Password Input: "+ pwdTextField.getText());
        }
    }
}
