package main;

import data.PasswordAuthentication;
import gui.*;

public class EntryPoint {
    public static void main(String[] args) {
//        new LoginGUI(); // Currently prints inputs to console
//        new LoginFailed();
        new ExternalArea();
        //new InternalArea("1");
//        new Internal("4");
        PasswordAuthentication.setCount(0);
    }
}