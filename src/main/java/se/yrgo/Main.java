package se.yrgo;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        Account account1 = new Account("454545");
        Customer randomGuy = new Customer("Kim");

        while (true) {
            String choice;
            double value;

            System.out.println("Help on:");
            System.out.println(" 1. Check balance");
            System.out.println(" 2. Make deposit");
            System.out.println(" 3. Make withdraw");
            System.out.println(" 4. Check transfer history");
            System.out.println(" 5. Log out");
            System.out.print("Choose one: ");

            choice = scan.next();

            System.out.println("\n");

            switch (choice) {
                case "1":
                    System.out.println(account1.getBalance());
                    break;
                case "2":
                    System.out.println("Value to deposit: ");
                    value = scan.nextDouble();
                    account1.deposit(value);
                    break;
                case "3":
                    System.out.println("Value to withdraw: ");
                    value = scan.nextDouble();
                    account1.withdraw(value);
                    break;
                case "4":
                    System.out.println(account1.getTransactions());
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Selection not found.");
            }
            scan.close();
        }
    }
}