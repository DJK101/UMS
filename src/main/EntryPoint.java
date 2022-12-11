package main;

import data.PasswordAuthentication;
import gui.*;

public class EntryPoint {
    public static void main(String[] args) {
        PasswordAuthentication.setCount(0);
        new ExternalArea();
    }
}
