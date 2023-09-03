package com.symon.oop.ATM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User("1234568", "1234");
        Scanner scanner = new Scanner(System.in);
        String enteredPin;

        System.out.println("Enter pin");
        enteredPin = scanner.nextLine();

        if (user.authenticatePin(enteredPin)){
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            int option = scanner.nextInt();
            switch (option) {
                case 1 -> System.out.println("Account Balance: $" + user.getAccountBalance());
                case 2 -> {
                    System.out.print("Enter the deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    user.deposit(depositAmount);
                }
                case 3 -> {
                    System.out.print("Enter the withdrawal amount: $");
                    double withdrawalAmount = scanner.nextDouble();
                    if (user.withdraw(withdrawalAmount)) {
                        System.out.println("Please take your money.");
                    }
                }
                case 4 -> {
                    System.out.println("Exiting ATM. Thank you!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid option. Try again.");
            }
        }
        else
            System.out.println("Authentication failed.\nExiting...");
    }
}
