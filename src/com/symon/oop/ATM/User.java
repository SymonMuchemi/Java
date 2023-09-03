package com.symon.oop.ATM;

public class User {
    private String accountNumber;
    private String pin;
    private ATM atm;

    public User(String accountNumber,
                String pin,
                double amount) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.atm = new ATM(amount);
    }
    // sets the initial deposit to 0
    public User(String accountNumber,
                String pin
                ) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.atm = new ATM(0);
    }
    // Authenticates the pin entered
    public boolean authenticatePin(String enterPin){
        return pin.equals(enterPin);
    }
    //returns the account balance
    public double getAccountBalance(){
        return atm.getBalance();
    }
    // Deposits money to the account
    public void deposit(double amount){
        atm.deposit(amount);
    }
    // withdraws money from the account
    public boolean withdraw(double amount){
        return atm.withdraw(amount);
    }

}
