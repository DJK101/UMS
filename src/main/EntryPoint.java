package main;

import data.PasswordAuthentication;
import gui.*;

public class EntryPoint {
    public static void main(String[] args) {
        new ExternalArea();
        PasswordAuthentication.setCount(0);
    }
}
