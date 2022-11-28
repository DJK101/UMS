import javax.swing.*;
import java.awt.*;

public class InternalArea {
    InternalArea() {
        JFrame frame = new JFrame("Internal Area");

        JLabel label = new JLabel("You are logged in!", SwingConstants.CENTER);
        label.setFont(new Font("Helvetica", Font.BOLD, 30));
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
