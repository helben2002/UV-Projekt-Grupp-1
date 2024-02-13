package se.yrgo;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        char choice;

        System.out.println("Help on:");
        System.out.println(" 1. Create new account");
        System.out.println(" 2. Make deposit");
        System.out.println(" 3. Make withdraw");
        System.out.println(" 4. Check transfer history");
        System.out.print("Choose one: ");

        choice = (char) System.in.read();

        System.out.println("\n");

        switch(choice) {
            case '1':
                Account acc = new Account("1234578");
                break;
            case '2':

                break;
            case '3':

                break;
            case '4':

                break;
            default:
                System.out.println("Selection not found.");
        }
    }
}