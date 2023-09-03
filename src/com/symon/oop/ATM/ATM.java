package com.symon.oop.ATM;

import javax.swing.*;
import java.text.NumberFormat;

public class ATM {
    private double balance;
    NumberFormat kesFormat = NumberFormat.getCurrencyInstance();
    String formattedAmount;
    String formattedBalance;

    public ATM(double initialBalance){
        this.balance = initialBalance;
    }

    // Check account balance method
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        formattedAmount = kesFormat.format(amount);
        if (amount > 50){
            balance += amount;
            System.out.println("Deposited " + formattedAmount);
        }
        else
            System.out.println("Deposit amount is too low!");
    }
    // Method to withdraw money from ATM
    public boolean withdraw(double amount){
        formattedAmount = kesFormat.format(amount);
        if (amount > 0 && amount <= balance){
            formattedBalance = kesFormat.format((balance - amount));
            System.out.printf("You have withdrawn %s your account balance is %s", formattedAmount);
            return true;
        }
        else if (amount > balance){
            System.out.println("You have insufficient funds to conduct this transaction!");
            return false;
        }
        else {
            formattedAmount = kesFormat.format(50);
            System.out.println("You cannot withdraw amounts less than " + formattedAmount);
            return false;
        }
    }
}
