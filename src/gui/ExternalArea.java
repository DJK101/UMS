package gui;

import javax.swing.*;

public class ExternalArea {

    private JPanel externalArea;

    public static void main(String[] args) {

        LoginFailed myFrame = new LoginFailed();
        JFrame f=new JFrame();
        f.add(myFrame);
        f.setVisible(true);
    }
}
